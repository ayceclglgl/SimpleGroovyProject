package com.file

println "Enter your favourite team:"

String item
System.in.withReader { reader -> 
	team = reader.readLine() 
}

println "Team is: $team"

