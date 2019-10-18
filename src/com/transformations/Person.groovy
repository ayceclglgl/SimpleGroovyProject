package com.transformations

import static groovy.transform.TypeCheckingMode.SKIP

import groovy.transform.Canonical
import groovy.transform.CompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.Sortable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.TypeChecked
import groovy.transform.TypeCheckingMode
import groovy.transform.builder.Builder

//@ToString
//@ToString(includeNames = true, excludes = ['email'])


//@EqualsAndHashCode(excludes = 'email')


//@TupleConstructor
//@ToString


//@Canonical


//@Singleton

//@Sortable
//@Sortable (includes = ['last', 'first'])// I want you to sort by last. only if the last names are then equal to each other then use first
//@Canonical


//@Immutable


@Builder
@ToString
class Person {
	String first
	String last
	String email
	
}


@TypeChecked
class PersonTypeChecked{
	String first
	String last
	
	String getFullName(){
		"firstname: $first, lastname: $last"
		//"firstname: $first, lastname: $lastName" 
		// When we don't add @TypeChecked annotation, even if 'lastName' property doesn't exist we are good at compile time.
		// If we add @TypeChecked 'lastName' will give an error - Groovy:[Static type checking] - The variable [lastName] is undeclared
	}
	
} 


@CompileStatic
class SomeClassCompileStatic {
	String foo() {
		"foo"
	}
	
	String bar() {
		"bar"
	}
	
	@CompileStatic(TypeCheckingMode.SKIP)
	void noReturn() {}
}

