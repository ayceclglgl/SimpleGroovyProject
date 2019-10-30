package com.builders

import groovy.xml.MarkupBuilder


MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true

builder.sports {//start with root node
	sport(id:1){
		name 'Baseball'
	}	
	sport(id:2){
		name 'Basketball'
	}
	sport(id:3){
		name 'Voleyball'
	}
	sport(id:4){
		name 'Hockey'
	}
	sport(id:null, foo:''){
		name ''
	}
}

builder.books{
	book(isbn: "978-1935182443"){
		title('Groovy in Action 2nd Edition')
		author('Dierk Koenig')
		price('50.58')
	}
	book(isbn: "978-1935182948"){
		title('Making Java Groovy')
		author('Ken Kousen')
		price('33.96')
	}
	book(isbn: "978-1937785307"){
		title('Programming Groovy 2: Dynamic Productivity for the Java Developer')
		author('Venkat Subramaniam')
		price('28.92')
	}
}
