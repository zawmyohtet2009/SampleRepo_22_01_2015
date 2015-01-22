package com.internship

class RenderController {

	def index() {
		render "Hello Word!"
	}

	def  renderView(){
		def stdList=["Roll Number" , "Name "]
		def stdMap=["3CS:1":"Ma Mya Aye","3CS:2":"Mg Aung","3CS:3":"Ma Win Mya"]
		request.setAttribute("stdList",stdList)
		request.setAttribute("stdMap",stdMap)
		//request.removeAttribute("stdMap")
		render( view:'hello')
	}

	def passParam(){
		def footer=['footer':"This is Footer @ "]
		def header="This is Header"
		[params:footer ,'header':header]
	}

	def redirectAction(){
		//dflkdsffj
		//dfldkjs
		//redirect(action:"show",id:144, params:[author:"Kaung Hsat Lwin"])
		redirect(url: "http://www.google.com")
	}

	def show(){
		render( view:'show')
	}

	def forwardAction(){
		forward (action: "show", id: 4, params: [author: "Stephen King"])
	}
}
