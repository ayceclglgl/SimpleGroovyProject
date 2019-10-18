package com.mop

class Dev {
	
	//Without this constructor it gives an error.
	/*Caught: groovy.lang.MissingPropertyException: No such property: writeCode for class: groovy.lang.MetaClassImpl
	 groovy.lang.MissingPropertyException: No such property: writeCode for class: groovy.lang.MetaClassImpl
	 at com.mop.Dev.methodMissing(InterceptCacheInvokePattern.groovy:17)
	 at com.mop.InterceptCacheInvokePattern.run(InterceptCacheInvokePattern.groovy:29)
	 */
	// Set metaClass property to ExpandoMetaClass instance, so we can add dynamic methods.
	Dev(){
		def mc = new ExpandoMetaClass(Dev, false, true)
		mc.initialize()
		this.metaClass = mc
	}
	
	List languages = []
	
	def methodMissing(String name, args) {
		println "$name method was called"
		
		if(name.startsWith('write')) {
			String language = name.split('write')[1]
			if(languages.contains(language)) {
				def impl = {Object[] theArgs -> println "I'd like to write code in $language" }
				getMetaClass()."$name" = impl
				return impl(args)
			}
		}
	}
}

Dev d = new Dev()
d.languages << "Groovy"
d.languages << "Java"
println d.metaClass.methods.size()
d.writeGroovy()
d.writeGroovy()
d.writeGroovy()
println d.metaClass.methods.size()
d.writeJava()



//class Person {
//	def activities
//	def methodMissing(String name, args) {
//		println "you called $name"
//		if (name.startsWith('play')) {
//			def activity = name.split('play')[1]
//			if (activities.contains(activity)) {
//				def impl = {Object[] theArgs -> println "I'd like to play $activity" }
//				getMetaClass()."$name" = impl
//				return impl(args)
//			}
//		}
//		throw new MissingMethodException(name, this.class, args)
//	}
//}
//	 
//def sam = new Person()
//sam.activities = ['Football', 'Tennis']
//println sam.metaClass.methods.size()
//sam.playTennis()
//sam.playTennis()
//sam.playTennis()
//println sam.metaClass.methods.size()
//sam.playPolitics()




//class LanguageList {
//	def list = ['Java', 'Groovy', 'Scala']
// 
//	// Set metaClass property to ExpandoMetaClass instance, so we
//	// can add dynamic methods.
//	LanguageList() {
//		def mc = new ExpandoMetaClass(LanguageList, false, true)
//		mc.initialize()
//		this.metaClass = mc
//	}
//	 
//	def methodMissing(String name, args) {
//		// Intercept method that starts with find.
//		if (name.startsWith("find")) {
//			def result = list.find { it == name[4..-1] }
//			// Add new method to class with metaClass.
//			this.metaClass."$name" = {-> result + "[cache]" }
//			result
//		} else {
//			throw new MissingMethodException(name, this.class, args)
//		}
//	}
//}
// 
//def languages = new LanguageList()
//assert 'Groovy' == languages.findGroovy()
//assert 'Scala' == languages.findScala()
//assert 'Java' == languages.findJava()
//assert !languages.findRuby()
// 
//assert 'Groovy[cache]' == languages.findGroovy()
//assert 'Scala[cache]' == languages.findScala()
//assert 'Java[cache]' == languages.findJava()