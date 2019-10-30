package com.builders

import groovy.xml.MarkupBuilder

//FileWriter writter = new FileWriter('src/about.html')
//MarkupBuilder builder = new MarkupBuilder(writter)
MarkupBuilder builder = new MarkupBuilder()

List courses = [ 
	[id:1, name: 'Groovy'],
	[id:2, name: 'Spring']
	]
	
List books = [
	[isbn:"978-1935182443", title:"Groovy in Action 2nd Edition", author:"Dierk Koenig"],
	[isbn:"978-1935182948", title:"Making Java Groovy", author:"Ken Kousen"],
	[isbn:"978-1937785307", title:"Programming Groovy 2: Dynamic Productivity for the Java Developer", author:"Venkat Subramaniam"]
	]

builder.html {
	title 'About'
	description 'This is description'
	keywords 'This is keywords'
	body{
		h1 'about'
		p 'This is bunch of text'
		section {
			h2 'Courses'
			table{
				tr {
					th 'id'
					th 'name'
				}
				courses.each { course ->
					tr{
						th course.id
						th course.name
					}
				}
			}
		}
	}
}

builder.html{
	head {
		title('Books')
	}
	body{
		h1('Groovy Books')
		table {
			tr{
				th('isbn')
				th('title')
				th('author')
			}
			books.each{ book ->
				tr{
					td(book.isbn)
					td(book.title)
					td(book.author)
				}
				
			}
		}
	}

	
}