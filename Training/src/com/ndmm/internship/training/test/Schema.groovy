package com.ndmm.internship.training.test

class Schema {
	static void main(def args){
		boolean i=true
		boolean flag=true
		def words = ['ant':13,'dsf':454]
		Scanner input = new Scanner (System.in)
		while(i){
			println "Enter Word"
			String result = input.nextLine()
			flag=words.containsKey(result)
			if(flag) {
				i=false
				println "found"
			}
			else{
				i=true
				println "No"
			}
		}
	}
}
