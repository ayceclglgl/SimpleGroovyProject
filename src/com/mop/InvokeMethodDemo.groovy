package com.mop

//This method is called when the method you called is not present on a Groovy object.

class InvokeDemo{
	def test() {
		return "method exists"
		
	}
	
	def invokeMethod(String name, Object args) {//We implemented a method that is actually in the GroovyObject interface. //That's how we're able to handle that particular method that wasn't defined.
		"called invokeMethod $name $args"
		
	}
	
}

def invokeDemo = new InvokeDemo()
assert invokeDemo.test() == "method exists"
assert invokeDemo.someMethod() == 'called invokeMethod someMethod []'//we have we have a way to handle a particular method that was and defined in our class and that's by using that invoke method.
