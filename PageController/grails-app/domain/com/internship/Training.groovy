package com.internship

class Training {
	String name
	static constraints = {
		name unique: true, size:5..10
	}
}
