package com.ndmm.internship.File

class CreateAppend {
	static void main(def args){
		def f1= new File('File1.txt')
		boolean b= f1.createNewFile()
		f1.append("Hello EveryBody \r\n"+new Date())
		if(b) println "Created File1 "
		b=false
		def d1= new File('D:/FileTest')
		d1.mkdir()
		def f= new File('D:/FileTest', 'File2.txt')
		f.setReadable(false,true)
		b=f.createNewFile()
		Date date=new Date()
		f.append("\n Hello EveryBody "+date+" \n ")
		if(b) println "Created File2 "
	}
}
