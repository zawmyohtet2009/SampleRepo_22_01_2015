package com.ndmm.internship.File

class TempFile {
	static void main(def args){
		//create temp file in C:\Users\PC's Name\AppData\Local\Temp
		File temp = File.createTempFile("temp",".scrap")
		temp.write("Hello world")
		println temp.getAbsolutePath()
	}
}
