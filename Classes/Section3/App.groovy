//1- Testing our ImmutableCustomer class
def d = new Date()
def c1 = new ImmutableCustomer(first:'Tom', last:'Jones', age:21, since:d, favItems:['Books', 'Tops'])
def c2 = new ImmutableCustomer('Tom', 'Jones', 21, d, ['Books', 'Tops'])
assert c1 == c2
/*
c1 and c2 is equal to each other.
Because since our class is immutable it has hashcode equals method by defualt.
*/

//c1.first = "Ayce" --> groovy.lang.ReadOnlyPropertyException: Cannot set readonly property: first for class: ImmutableCustomer

//2- Testing our EqualsAndHashCodeUser class
def user = new EqualsAndHashCodeUser(name: 'mrhaki', active: false, likes: ['Groovy', 'Java'])
def mrhaki = new EqualsAndHashCodeUser(name: 'mrhaki', likes: ['Groovy', 'Java'])
def hubert = new EqualsAndHashCodeUser(name: 'Hubert Klein Ikkink', likes: ['Groovy', 'Java'])
assert user == mrhaki
//assert mrhaki == hubert



//3- Testing our EqualsAndHashCodeUser class
def date = new Date()
def anyObject = new Object()
def cust1 = new CanonicalUser(first:'Tom', last:'Jones', age:21, since:date, favItems:['Books', 'Games'], object: anyObject)
def cust2 = new CanonicalUser('Tom', 'Jones', 21, date, ['Books', 'Games'], anyObject)
assert cust1 == cust2


//4- Testing our SortablePerson class 
final SortablePerson person1 = new SortablePerson(first:'Tom', last:'Jones', born:2000)
final SortablePerson person2 = new SortablePerson(first:'mrhaki', last:'Ikkink', born:2002)
final SortablePerson person3 = new SortablePerson(first:'Hubert', last:'AAA', born:1990)

final List<SortablePerson> people = [person1, person2, person3]
assert people.last().born == 1990
//assert people.last().born == 2000
println people
def sorted = people.sort(false /*do not mutate original collection*/)
println sorted



/*
*** In the groovy console, 
I write a class and save it. Tu test/use my class I create an another class and try to run.
When I tried to run it gets compile error because it do not see our class.
Here's my solution;
First open the class and run it in th groovy console with Ctrl + R
See the error:
    groovy.lang.GroovyRuntimeException: This script or class could not be run.
    It should either:
    - have a main method,
    - be a JUnit test or extend GroovyTestCase,
    - implement the Runnable interface,
After seeing the error open the another class like App.groovy or Application.groovy
Then run the application class.

I think when i first run the class itself it kinda lots the class in memory so when i run my app class it see my original class and print the results.
*/