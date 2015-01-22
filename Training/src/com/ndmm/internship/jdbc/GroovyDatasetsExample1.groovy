import groovy.sql.Sql
class GroovyDatasetsExample1{
	static void main(String[] args) {
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test",
				"root", "", 'com.mysql.jdbc.Driver')

		sql.execute("delete from word where word_id=19999")

		def words = sql.dataSet("word")
		println words.getClass().name
		words.add(word_id:"19999", spelling:"hello", part_of_speech:"Noun")
		println words.firstRow()
		words.findAll {it.word_id!=null}.sort{it.spelling}.each{row->
			row.word_id+"  "+row.spelling
		}
		//	words.each{ word ->
		//println word.word_id + " " + word.spelling
		//}
	}
}
