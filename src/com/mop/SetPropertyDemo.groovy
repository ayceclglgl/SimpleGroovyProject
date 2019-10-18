package com.mop

//You can intercept write access to properties by overriding the setProperty() method.

class POGO{
	
	String property
	
	void setProperty(String name, Object obj) {
		this.@"$name" = 'overridden'
		
	}
}

def pogo = new POGO()
pogo.property = 'a' // It doesn't matter which value we set, we override the setProperty method thus the value is always overridden
println pogo.property
assert pogo.property == 'overridden'