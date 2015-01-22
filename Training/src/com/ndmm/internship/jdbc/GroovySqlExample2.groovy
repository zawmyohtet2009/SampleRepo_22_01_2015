import groovy.sql.Sql
class GroovySqlExample2{
	static void main(String[] args) {
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test",
				"root", "", 'com.mysql.jdbc.Driver')
		sql.eachRow("select * from word"){
			println it.spelling + " ${it.part_of_speech}"
		}
	}
}
