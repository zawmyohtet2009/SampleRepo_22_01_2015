package com.internship

class Person {
	String name
	int age
	String address
	static constraints = {
		name (size:8..20,unique:true)
		age (range:20..50)
		address (inList :[
			'Yangon',
			'Mandalay',
			'Maubin'
		])
	}
}
