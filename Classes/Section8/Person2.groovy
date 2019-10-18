@groovy.transform.ToString
class Person{
    String firstName, lastName
    
    //Java
//    public Person2(String firstName, String lastName){
//        this.firstName = firstName
//        this.lastName = lastName
//    }
    
    // Groovy
//    We can create object with name of the fileds like below.
//    Person person = new Person(firstName:'Ayce', lastName:'Kes')
     Person(){}
    

    Person(String fullName){
        List parts = fullName.split(' ')
        firstName = parts[0]
        lastName = parts[1]
    }
    
    // Methods
    public void foo(String a, String b){
        //...
    }
    
    String getFullName(){
        "$firstName $lastName"
    }
    
    def bar(){}//***Note: return type: def we do not care the return type it can be int, string, void .. But if i know return type, type it not use def
    
    static String staticMethod(){
        println 'someString'
    }
    
    // Defualt method parameters values
    // default value of 'canAccessAll' parameter is false
    // default value of 'numbers' parameter is [1,2,3]
    List someMethod(List numbers = [1,2,3], Boolean canAccessAll = false){
        println "default values: $numbers $canAccessAll"
    }
    
    
    //If we do not know the number of parameters
    // We can use vararg
    def concat(String... args){
        println args.length
    }
}

Person.staticMethod()

Person p = new Person(firstName:'Ayc', lastName:'Kes')
println p

p.someMethod()

Person pp = new Person('Ayce Ke')
println pp


Person person = new Person()
person.concat('a','b','c')
