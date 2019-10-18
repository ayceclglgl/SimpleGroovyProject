package com.mop

class Developer{
	
}

Developer dev = new Developer()
println "Hello"

dev.metaClass



Expando e = new Expando()
e.name = "Ayce"
//add a method to expando
e.writeCode = { -> println "$name writeCode() method"}
e.writeCode()
// Adding methods and properties is per instance. i.e we added 'name' property and 'writeCode' method to 'e' instance. 
// If we try to call these new method from other instance, we get an error - per instance basis.
Expando e2 = new Expando()
//e2.writeCode() //Caught: groovy.lang.MissingMethodException: No signature of method: groovy.util.Expando.writeCode() is applicable for argument types: () values: []


//MetaClass is actually is an Expando. Lets add some property and method to metaClass of Developer.
// per instance
dev.metaClass.name = 'Ayc'
dev.metaClass.writeCode = { -> println "$name dev metaClass's writeCode() method"}
dev.writeCode()



/*
 * Now you can start to do this on a every instance basis not just per instance. 
But be careful, You know with great power comes great responsibility. */
//Every instance
//Since every class has metaClass associated with it. Adding String class's metaData
String.metaClass.shout = { -> toUpperCase() } 
println "aaaavaaaa".shout()
 
 