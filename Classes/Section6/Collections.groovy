// each & eachWithIndex
List nums = [2,9,45,13,89]
nums.each {
    println it
}
//What about if we need an index?
nums.eachWithIndex { num, idx ->
    println "$idx:$num"
}

//findAll
List days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
List sdays = days.findAll{ it.startsWith("S")}
println days
println sdays


//collect
//take each itme n the list and multiply by 10
List numbers = [9,45,103,8,77,56,34,91]
List numsTimesTen = []
numbers.each{ n ->
    numsTimesTen << n * 10
}
println numbers
println numsTimesTen

//using with collect method
List numsTimesTenWithCollect = numbers.collect{ n -> n*10}
println numsTimesTenWithCollect

