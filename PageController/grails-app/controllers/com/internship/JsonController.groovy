package com.internship

import groovy.xml.MarkupBuilder

class JsonController {
	def index() {
		/*
		 * def person = new Person(name:'bob',age:34)
		 render person as grails.converters.JSON
		 */
		def writer = new StringWriter()
		def builder = new MarkupBuilder(writer)
		builder.html {
			head { title 'Log in' }
			body {
				h1 'Welcome  HTML!!!'
				form{
					'<form action ="hello">'
					'Name:<input type=text  name=name> '
					'<input type=submit value=submit>'
					'</form>'
				}
			}
		}

		def html = writer.toString()
		render html
	}
}
