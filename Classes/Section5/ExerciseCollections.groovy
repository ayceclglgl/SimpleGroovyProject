enum Days{ Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday }

println 'Range:'
Range rangeDays = Days.Monday..Days.Sunday
println "size: ${rangeDays.size()}"
println "Wednesday is in that Range: ${rangeDays.contains(Days.Wednesday)}"
println rangeDays.from
println rangeDays.to
println '\n'
//for loop
for (d in rangeDays ){
   println d
}
//clouse
rangeDays.each { d ->
    println d
}



println '\nList:'
List listDays = []
for (d in Days ){
    listDays.add(d)
}
println listDays
println "size: ${listDays.size()}"
listDays.remove(Days.Saturday)
println listDays
listDays << Days.Saturday //listDays.add(Days.Saturday)
println listDays.size()
println listDays[2]




println '\nMap:'
Map map = [:]
for (int i =0; i<Days.values().size(); i++ ){
   map.put(i+1, Days.values().getAt(i))
}
println map
println "size of the map: ${map.size()}"
println map.values()
println map.getClass().getName()