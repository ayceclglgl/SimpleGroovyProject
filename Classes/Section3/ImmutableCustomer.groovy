import groovy.transform.Immutable

@Immutable
class ImmutableCustomer {
    String first, last
    int age
    Date since
    Collection favItems

}

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