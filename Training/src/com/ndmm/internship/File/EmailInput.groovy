package com.ndmm.internship.File

class EmailInput {
	static void main(def args){
		EmailValidator validator = new EmailValidator()
		Scanner input = new Scanner(System.in)
		boolean flag=false
		while(!flag){
			println "Type Word "
			String mail = input.next()
			println "Enter next"
			int dkf=input.next
			/*flag=validator.validate(mail)
			 if(flag){
			 println "It is valid mail => $mail"
			 }
			 else{
			 println "Type Again "
			 flag=validator.validate(mail)
			 println "Not valid = > $mail"
			 }*/
		}
	}
}
