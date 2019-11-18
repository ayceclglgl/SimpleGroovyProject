package com.file

//def file = new File('dummy.txt')
//file.write("some line\n")
//file.append("some other lines...")
//
//List lines = file.readLines();
//lines.each { l -> println l }


String dir = 'C:/Temp'
//new File(dir).eachFile{ f ->
//	 if(f.isFile()) {
//		 println f.name
//	 }
//}

// Inside directories
//new File(dir).eachFileRecurse{ f ->
//	if(f.isFile()) {
//		println f.name
//	}
//}

//File('.') : this directory = SimpleGroovyProject directory
new File('.').eachFile { ff ->
	if(ff.name.endsWith('.txt')) {
		println ff.name
	}
}