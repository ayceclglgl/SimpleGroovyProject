package com.mop.category

//String.metaClass.shout = { -> toUpperCase()}
//println "Hello, World".shout() 

//Using category class. We use category classes with keyword 'use'
/*So in this block we are basically saying now that anything in that string category class is kind of like a native function call on this block.
 * It is only available in this block*/
use(StringCategory){
	println "Hello, World".shout()
}

//println "Hello, World".shout() //Caught: groovy.lang.MissingMethodException: No signature of method: java.lang.String.shout() is applicable for argument types: () values: []