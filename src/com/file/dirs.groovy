package com.file

String dir = 'C:/Temp'
List hidden = []
new File(dir).eachFile { file ->
	
	if(file.isDirectory()) {
		println file.name
	}
	
	if(file.isHidden()) {
		hidden << file.name
	}
	
}

println "hiddens: $hidden"

File exDir = new File(dir)
exDir.eachDir { subfolder -> println subfolder }
println exDir.directorySize()

new File('dummy').mkdir()
new File('one/two/three').mkdirs()

new File('dummy').delete()
new File('one').deleteDir()


