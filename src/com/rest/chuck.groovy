package com.rest

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient
//@GrabResolver(name='', root='')
//@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.0')

String base = 'http://api.icndb.com'
def chuck = new RESTClient(base)

chuck.contentType = ContentType.JSON
chuck.get(path: '/jokes/random'){ response, json ->
	println response.status
	println json
}