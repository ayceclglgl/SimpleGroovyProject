package com.mop

// Groovy supports the concept of the methodMissing. This method differs from invokeMethod in that it is only
// invoked in case of a failed method dispatch, when no method can be found for the given name and/or the given arguments:

/*
 This method differs from invoke method in that it is only invoked in the case of a failing method dispatch 
 when no method can be found for the given name and are given arguments.
 So whereas invoke method can be called for any method that we invoke whether it exists or doesn't exist.
 Method missing is only called when we can't find a method.
 * */

class MyEmployee {
	
	def methodMissing(String name, def args){
		if(name != 'someMethod') {
			throw new MissingMethodException(name,args)
		}
		println "Method Missing called on $name with arguments $args"
	}
	
}

MyEmployee e = new MyEmployee()
e.someMethod(1,2,3) // There is no method named someMethod but our 'methodMissing' catches it
e.someOtherMethod(4,5,6)