package com.transformations

import groovy.transform.EqualsAndHashCode
//1- @ToString Demo
//Person p = new Person(first:'Ayce', last:'Kes', email:'elsevier')
//println p


//2- @EqualAndHashCode Demo
//Person p1 = new Person(first:'Ayce', last:'Kes', email:'elsevier')
//Person p2 = new Person(first:'Ayce', last:'Kes', email:'vier')
//assert p1 == p2 // fails before @EqualAndHashCode, cause these 2 instances totally different from each other and we haven't tell how to compare them yet.
//After @EqualsAndHashCode the instances are still different but now the system knows how to compare, basically it compares properties so these 2 instances are equal to each other.


//3- @TupleConstructor Demo
//Person p = new Person('Ayce', 'Kes', 'elsevier')
//println p


//4- @Canonical Demo
//Person p1 = new Person(first:'Ayce', last:'Kes', email:'elsevier')
//Person p2 = new Person(first:'Ayce', last:'Kes', email:'elsevier')
//assert p1 == p2


//5- @Singleton Demo
//Person p1 = new Person(first:'Ayce', last:'Kes', email:'elsevier')
//println p1
//It gives below error;
/*
 * Caught: java.lang.RuntimeException: Can't instantiate singleton com.transformations.Person. Use com.transformations.Person.instance
java.lang.RuntimeException: Can't instantiate singleton com.transformations.Person. Use com.transformations.Person.instance
	at com.transformations.Person.<init>(Person.groovy)
	at com.transformations.app.run(app.groovy:28) 
*/
//Person p = Person.instance ; // or Person.getInstance() 
//println p // It gives com.transformations.Person@34a3d150


//6- @Sortable Demo
//Person p1 = new Person(first:'Murad', last:'Kes', email:'elsevier')
//Person p2 = new Person(first:'Ayce', last:'Kes', email:'eee')
//Person p3 = new Person(first:'Nuh', last:'Kes', email:'rr')
//
//def list = [p1, p2, p3]
//println list.toSorted()



//7- @Immutable Demo
//Person p = new Person(first:'Ayce', last:'Kes', email:'elsevier')
//println p.toString()
//p.first = 'Murad' // It gives below error:
/*
 *Caught: groovy.lang.ReadOnlyPropertyException: Cannot set readonly property: first for class: com.transformations.Person
groovy.lang.ReadOnlyPropertyException: Cannot set readonly property: first for class: com.transformations.Person
	at com.transformations.Person.setProperty(Person.groovy)
	at com.transformations.app.run(app.groovy:55)
*/


//8- @TypeChecked
//PersonTypeChecked p = new PersonTypeChecked()
//println p


//9-CompileStatic look PersonTypeChecked class in Person.groovy

//10- Builder
 Person person = Person.builder().first("Ayce").last("Kes").build()
 println person

