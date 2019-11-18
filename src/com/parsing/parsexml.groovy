package com.parsing

def xml = '''
<sports>
  <sport id="1">
    <name>Baseball</name>
  </sport>
  <sport id="2">
    <name>Basketball</name>
  </sport>
  <sport id="3">
    <name>Voleyball</name>
  </sport>
  <sport id="4">
    <name>Hockey</name>
  </sport>
  <sport>
    <name></name>
  </sport>
</sports>
'''

//def sports = new XmlSlurper().parseText(xml)
//println sports.getClass().getName()
//println sports.sport.name

def sportsFile = new XmlSlurper().parse('src/sports.xml')
println sportsFile
println sportsFile.sport[2].name