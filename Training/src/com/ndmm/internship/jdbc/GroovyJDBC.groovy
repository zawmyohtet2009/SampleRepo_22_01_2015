package com.ndmm.internship.jdbc

import groovy.sql.Sql

class GroovyJDBC {
	static void main(String[] args) {
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test",
				"root", "", 'com.mysql.jdbc.Driver')
		println "ID| Forum Name   | Fourm Description                 |\n"
		sql.eachRow("select * from forum"){ row ->
			println row.forumid + " | " + row.forumname + " | " + row.forumdesc
		}
	}
}