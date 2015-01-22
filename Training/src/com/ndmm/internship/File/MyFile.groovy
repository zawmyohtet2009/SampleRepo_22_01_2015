package com.ndmm.internship.File

/*
 * Writes a files to the console
 */
public class MyFile{
	public static void main(def args){

		ArrayList pids = null
		PrintWriter writer = null
		File f = new File("c:/temp/pids.txt")

		if (f.length() > 0){
			pids = new ArrayList()

			f.eachLine { line ->
				pids.add(line)
			}

			println("Item to be removed: " + pids.get(0))

			pids.remove(0)

			println pids

			writer = new PrintWriter(f)
			pids.each { id -> writer.println(id) }

			writer.close()
		}
		else{
			println "File is empty!"
		}
	}
}

