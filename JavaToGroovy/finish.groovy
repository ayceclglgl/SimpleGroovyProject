@groovy.transform.ToString()
class User{
    String first
    String last
    Date date
    
    void printFullName(){
        println "FullName: $fist $last"
    }
    
}

def u = new User(first:"Ayce", last:"Keskinege")
println u