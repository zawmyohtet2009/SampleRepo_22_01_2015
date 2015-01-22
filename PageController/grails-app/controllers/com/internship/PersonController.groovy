package com.internship


class PersonController {
	def personService
	static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

	def index() {
		redirect(action: "list", params: params)
	}

	def list(Integer max) {
		params.max = Math.min(max ?: 2, 100)
		[personInstanceList: Person.list(params), personInstanceTotal: Person.count()]
	}

	def create() {
		render(view: "create",model: [personInstance: new Person(params)]) as grails.converters.JSON
	}

	def save() {
		def personInstance = new Person(params)
		println "$params.name    $params.age    $params.address  "
		boolean flag=personService.serviceMethod(params)
		if(flag){
			flash.message = message(code: 'default.created.message', args: [
				message(code: 'person.label', default: 'Person'),
				personInstance.id
			])
			redirect(action: "show", id: personInstance.id)
		}
		render(view: "create", model: [personInstance: personInstance])
		return
	}

	def show(Long id) {
		def personInstance = Person.get(id)//1
		if (!personInstance) {
			flash.message = message(code: 'default.not.found.message', args: [
				message(code: 'person.label', default: 'Person'),
				id
			])
			redirect(action: "list")
			return
		}
		[personInstance: personInstance]
	}

	def edit(Long id) {
		def personInstance = Person.get(id)
		if (!personInstance) {
			flash.message = message(code: 'default.not.found.message', args: [
				message(code: 'person.label', default: 'Person'),
				id
			])
			redirect(action: "list")
			return
		}
		[personInstance: personInstance]
	}

	def update(Long id, Long version) {
		def personInstance = Person.get(id)
		if (!personInstance) {
			flash.message = message(code: 'default.not.found.message', args: [
				message(code: 'person.label', default: 'Person'),
				id
			])
			redirect(action: "list")
			return
		}

		if (version != null) {
			if (personInstance.version > version) {
				personInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
						[
							message(code: 'person.label', default: 'Person')] as Object[],
						"Another user has updated this Person while you were editing")
				render(view: "edit", model: [personInstance: personInstance])
				return
			}
		}

		personInstance.properties = params//

		if (!personInstance.save(flush: true)) {
			render(view: "edit", model: [personInstance: personInstance])
			return
		}

		flash.message = message(code: 'default.updated.message', args: [
			message(code: 'person.label', default: 'Person'),
			personInstance.id
		])
		redirect(action: "show", id: personInstance.id)
	}

	def delete(Long id){//1
		def personInstance = Person.read(4)
		personInstance.each {println it }
		println "ID is "+personInstance
		if(personInstance.delete(flush:true))
		{
			render "Try Again!!!"
		}
		else{
			render "Delete Success"
		}
		/*if (!personInstance) {
		 flash.message = message(code: 'default.not.found.message', args: [
		 message(code: 'person.label', default: 'Person'),
		 id
		 ])
		 redirect(action: "list")
		 return
		 }
		 try {
		 personInstance.delete(flush: true)//
		 flash.message = message(code: 'default.deleted.message', args: [
		 message(code: 'person.label', default: 'Person'),
		 id
		 ])
		 redirect(action: "list")
		 }
		 catch (DataIntegrityViolationException e) {
		 flash.message = message(code: 'default.not.deleted.message', args: [
		 message(code: 'person.label', default: 'Person'),
		 id
		 ])
		 redirect(action: "show", id: id)
		 }*/
	}
}
