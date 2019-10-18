def writer = {
    append 'Ayce'
    append 'lives in London'
}

//writer()

/*
It gets 
    'groovy.lang.MissingMethodException: No signature of method: Delegates.append() is applicable for argument types: (String) values: [Ayce]
    Possible solutions: any(), find(), grep(), print(java.lang.Object), find(groovy.lang.Closure), any(groovy.lang.Closure)'
error.
Because It doesn't know what to append.
So it's time to call appen and it doesn't know what he's doing so it fails.

So when appen is called in the writer closure then looks outside of itself into the enclosing class.
So in our case where it isn't a script blocks, it is script class that was created for us.
So append method looks Script class and do have any methods calles append? 
It doesn't.
*/



//Then let's add an append method

def append(String s){
    println "append() called with argument of $s"
}

//Now it found the appen method.
//We actually create an append method when the writer goes to call upon, looks first within the closing class and goes all right I can call. 
//And it goes ahead and in it calls it.
//So everything is fine at this point.



//So what if there was a situation where the append method lived in another class that we wanted to delegate responsibility to.
//What about StringBuffer? It has append method.
//I want to say the delegate property I want to set that to string buffer.
//So closing the upper append method.
StringBuffer sb = new StringBuffer()
writer.delegate = sb
//writer()


//What about if we comment out our appen method also? We have 2 append method now one is our method and the another one is StringBuffer
//It call our method even if we delegate it. this is because of the resolve strategy. The default strategy is owner_first. (https://groovy-lang.org/closures.html#_currying)
//append() called with argument of Ayce
//append() called with argument of lives in London

//If we change the default strategy to delegate? - to use StringBuffer class
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer()