def c = { }
println c.class.name
println c instanceof Closure

def sayHello = { name ->
    println "Hello $name"
}
sayHello("Ayce")

List numbers = [1,2,3,4,5]
numbers.each{ num ->
    println num
}

//Closure are objects & last parameter
def tenTimes(num, closure){
    closure(num * 10)
}

tenTimes(10, {println it})//Any method that accepts a closure as the last argument has a special idiomatic way to kind of print it out, to kind of use it in an expression.   
//So any time a closure is the last argument to a method you can remove the braces and put it outside of the braces.
tenTimes(2) {
    println it
} 


//Other example:
10.times {
    println it
}

import java.util.Random
Random random = new Random()
3.times {
    println random.nextInt()
}