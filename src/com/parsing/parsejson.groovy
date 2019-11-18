package com.parsing

import groovy.json.JsonSlurper

def books = new JsonSlurper().parse(new File('src/books.json'))
println books
println books.books.book1