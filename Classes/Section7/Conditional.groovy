//Swicth
def num = 3
switch(num){
    case 1:
        println "1"
        break
   case 2:
       println "2"
       break
   case 1..3:
       println "in the range 1..3"
       break
   case [1,6,9]:
       println "num is in List"
       break
   case Integer:
       println "num is an Integer"
       break
   case Float:
       println "num is an Integer"
       break
    default :
        println "default .."
   
}

//In
def validAges = 18..56
def someAge = 19
println someAge in validAges