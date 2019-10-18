//Section 6 Exercise Closure
//-Create a Method that accepts a closure as an argument
//Create a closure that performs some action
//Call the method and pass the closure to it.
def myMethod(Closure c){
    println "inside myMethod"
    c()
}

def say = { String name = "aa", String lastName = "bb" ->
    println "name: $name lastName:$lastName"
}

myMethod(say)

//Create a list and use them each to iterate over each item in the list and print it out
//Hint - You can use the implicit it or use your own variable
List list = [1,2,3,4,5,6,7,8,9]
list.each{ n -> print n}



//Create a map of data and iterate over it using each method.
//This method can take a closure that accepts 1 or 2 arguments. 
//Use 2 arguments and print out the key and value on each line.
println "\nmap:"
def map = [1:"a", 2:"b", 3:"c"]
map.each{ key, value -> println "$key:$value"}



//Demonstrate the use of curry and try to come up with an example different from the one we used in the lecture. 
def lastName = say.curry("Ayce")
lastName()


//Explore the GDK
List people = [
    [name:"Ayce", city:"London"],
    [name:"Murad", city:"London"],
    [name:"Andy", city:"Dayton"],
    [name:"Birol", city:"Izmir"],
    [name:"John", city:"Oxford"],
    [name:"Dan", city:"Dayton"],
]
//In the following exercises we are going to explore the GDK to find some methods that take closures and learn how to use them.
// Hint - I would narrow your search to java.util.Collection, java.lang.Iterable & java.util.List
//Search for the find and findAll methods.
//What is the difference between the two? 
//Write some code to show how they both work.
/*
Object    find(): Finds the first item matching the IDENTITY Closure (i.e. matching Groovy truth).
Object    find(Closure closure): Finds the first value matching the closure condition.
Collection    findAll(): Finds the items matching the IDENTITY Closure (i.e. matching Groovy truth).
Collection    findAll(Closure closure): Finds all values matching the closure condition.
*/
println people.find{ person -> person.city == 'London'}
println people.findAll{ person -> person.city == 'London'}

//Search for the any and every methods.
//What is the difference between the two? 
//Write some code to show how they both work. 
/*
boolean    any(Closure predicate): Iterates over the contents of an iterable, and checks whether a predicate is valid for at least one element.
boolean    every(Closure predicate): Used to determine if the given predicate closure is valid (i.e. returns true for all items in this iterable).
*/
println people.any{ person -> person.city == 'London'}
println people.every{ person -> person.city == 'London'}
println people.every{ person -> person.name.size() >=3}

//Search for the method groupBy that accepts a closure
//What does this method do? 
//Write an example of how to use this method.
/*
Map    groupBy(Closure closure):Sorts all Iterable members into groups determined by the supplied mapping closure.
Map    groupBy(Object closures):Sorts all Iterable members into (sub)groups determined by the supplied mapping closures.
Map    groupBy(List closures):Sorts all Iterable members into (sub)groups determined by the supplied mapping closures.
*/
def peopleByCity = people.groupBy{person -> person.city}
println peopleByCity
def london = peopleByCity["London"]
println london

london.each{ println it}
