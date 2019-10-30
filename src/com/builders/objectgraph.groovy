package com.builders

import groovy.transform.ToString

@ToString(includeNames = true)
class Book{
	String title
	String summary
	List<Section> sections = []

}

@ToString(includeNames = true)
class Section{
	String title
	List<Chapter> chapters = []
}

@ToString(includeNames = true)
class Chapter{
	String title
}


//Java Style
public Book createBook() {
	Book b = new Book()
	b.setTitle("My Book")
	b.setSummary("Summary")
	
	Section s = new Section()
	s.setTitle("Section 1")
	
	Chapter c1 = new Chapter()
	c1.setTitle("Chapter 1")
	Chapter c2 = new Chapter()
	c2.setTitle("Chapter 2")
	
	s.setChapters([c1, c2])
	// or
	//s.getChapters().add(c1)
	//s.getChapters().add(c2)
	
	b.getSections().add(s)
	// or
	//b.setSections([s])
	
	return b
}
Book javaStyleBook = createBook()
println javaStyleBook.getTitle()



//Groovy Style
ObjectGraphBuilder builder = new ObjectGraphBuilder()
// uncomment the following line if running this script with GroovyConsole
// builder.classloader = getClass().classLoader
builder.classNameResolver = "com.builders"

def book = builder.book( title:'My Book', summary:'Summary') {
			section(title:'Section 1') {
				chapter(title:'Chapter 1')
				chapter(title:'Chapter 2')
			}
			section(title:'Section 2') {
				chapter(title:'Chapter 3')
				chapter(title:'Chapter 4')
			}
		}


println book
