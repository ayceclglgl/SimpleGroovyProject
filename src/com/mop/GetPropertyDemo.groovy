package com.mop

//Every read access to a property can be intercepted be overriding the getProperty() method of the current object.
//Again we're implementing that GroovyObject interface so we can override that getProperty() method.


class PropertyDemno{
	
	def prop1 = "prop1"
	def prop2 = "prop2"
	def prop3 = "prop3"
	
	
	def getProperty(String name) {
		println "getProperty() called with argument $name"
		//return
		//metaClass.getProperty(this, name)
		
		//returning value since it is a getProperty method :)
		if(metaClass.hasProperty(this, name)) { //metaClass is: public interface MetaClass extends MetaObjectProtocol {
			metaClass.getProperty(this, name)
		}else {
			"property does not exists"
		}
	}
}

def pd = new PropertyDemno()
println pd.prop1
println pd.prop2
println pd.prop3
println pd.prop4