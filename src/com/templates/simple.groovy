package com.templates

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

// 3 components to building a dynamic template

// 1.Engine (SimpleTemplateEngine)
// 2.binding Template
// 3.Data bindings 


SimpleTemplateEngine engine = new SimpleTemplateEngine() // for more detail use new SimpleTemplateEngine(true)
Template template = engine.createTemplate( new File('src/com/templates/email.txt'))

//data bindings
Map bindings = [
	firstName: 'AA',
	lastName: 'BB',
	commits: 27,
	repositories: [
		[name: 'Groovy', url:'https://github.com'],
		[name: 'Java', url:'https://github.com']
	]
]

println template.make(bindings)