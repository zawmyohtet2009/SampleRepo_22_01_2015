import groovy.sql.Sql
class insert{
	static void main(String[] args) {
		def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test",
				"root", "", 'com.mysql.jdbc.Driver')

		sql.execute("delete from word where word_id=6")


		def wid = 6
		def spelling = "Nefarious"
		def pospeech = "Adjective"
		sql.execute("insert into word (word_id, spelling, part_of_speech) values (${wid}, ${spelling}, ${pospeech})")

		sql.eachRow("select * from word"){ row ->
			println row.word_id + " " + row.spelling + " " + row.part_of_speech
		}

		def val = sql.execute("select * from word where word_id = ?", [6])
		println val

		def nid = 5
		def newSpelling = "Dastardly"
		sql.executeUpdate("update word set spelling = ? where word_id = ?", [newSpelling, nid])

		sql.eachRow("select * from word"){ row ->
			println row.word_id + " " + row.spelling + " " + row.part_of_speech
		}

		println "get last row"
		sql.eachRow("select * from word"){ row ->
			(0..2).each{ i ->
				print "Field[${i}]: "
				println row.getAt(i)
			}
			println "Last field using -1 index = " + row.getAt(-1)
		}
	}
}