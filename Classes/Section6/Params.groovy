// implicit parameter
def foo = {
    println it
}
foo('Ayce')


//If we want to have a closure which takes no args.
/*
def noparams = {
    println "no params..."
}
*/
// To make them no paras add arrow '->' in the begining
def noparams = { ->
    println "no params..."
}
noparams()


//Multiple args
def sayHello = { first, last -> 
    println "Hello $first, $last"
}
sayHello('FirstName', 'LastName')


//Multiple args with specific data type
def sayHello2 = { String first, String last -> 
    println "Hello $first, $last"
}
sayHello2('Ayce', 'Kes')


//default values
def greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"  
}
greet("Ayce", "Hello")
greet("Murad") // Calling with the default value


//var-arg
//not strictly belong to the closure
// When we do not know the number of the argument. Closure can take 1 argument, 10 arguments, 12 arguments ...
def concat = {String ... args ->
    args.join('')
}
println concat('abc', 'def')
println concat('abc', 'def', '123')


//Define a method that takes a closure as an argument
def someMethod(Closure c){
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

//Define a closure
def someClosure = { int x, int y -> x+y}

//Call method
someMethod(someClosure)
