import groovy.sql.Sql
class GroovySqlExample1{
	static void main(String[] args) {
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test",
				"root", "", 'com.mysql.jdbc.Driver')
		sql.eachRow("select * from word"){ row ->
			println row.word_id + " " + row.spelling + " " + row.part_of_speech
		}
	}
}
