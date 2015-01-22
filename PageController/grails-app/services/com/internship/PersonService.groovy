package com.internship

class PersonService {

	def boolean serviceMethod(params) {
		def personInstance = new Person(params)
		//	personInstance.properties = params
		if (!personInstance.save(flush: true)) {
			println ("No save person")
			return  false
		}
		else
			return true
	}
}
