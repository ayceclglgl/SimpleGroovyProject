class Person {
    String firstName, lastName
    def dob //date of birth
    //private | protected | public
    protected String f1, f2, f3
    private Date createdOn = new Date()
    
    static welcomeMsg = 'HELLO'
    public static final String WELCOME_MSG = 'HELLO'
    
    //local variables
    def foo(){ //***Note: return type: def we do not care the return type it can be int, string, void .. But if i know return type, type it not use def
        String msg = 'Hi'
        String firstName = "Ayce"
        println "$msg $firstName"
    } 
    
    def foo(def params){} //Note: We do not care the parameters types, it could be anything. Again if we know the type, type it not use def.
}

println Person.WELCOME_MSG
def person = new Person()
person.foo()