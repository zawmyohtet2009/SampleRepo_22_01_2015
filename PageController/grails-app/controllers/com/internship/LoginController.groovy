package com.internship

class LoginController {

	def index() {
		render (view:"home")
	}
	def  login(){
		def user="admin"
		def password = "admin"
		def inputUser = params.name
		def inputPassword = params.password
		if(inputUser.equals(user)&&inputPassword.equals(password)){
			session.setAttribute("loginUser", user)
			flash.welcome="Welcome User!"
			render (view:"home")
		}else{
			flash.check="Invalid User Name and Password.Try Again!!"
			redirect action:"index"
		}
	}

	def logout(){
		session.invalidate()
		redirect action:"index"
	}
}
