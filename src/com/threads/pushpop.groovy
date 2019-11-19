package com.threads

List numbers = []

10.times { 
	println "push:\t ${it}"
	numbers << it
}

println numbers

for (i in 9..0) {
	println "pop:\t ${i}"
	numbers.pop()
}

println numbers