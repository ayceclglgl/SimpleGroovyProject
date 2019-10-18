package com.groovybean

Employee e = new Employee(firstName: 'Ayce', lastName:'Kes', email:'elsevier')
println e.toString()


DoubleBean db = new DoubleBean()
db.value = 100
println "db.value: ${db.value}, db.getValue(): ${db.getValue()}"
println "Accessing the value not calling getValue() method: ${db.@value}"
