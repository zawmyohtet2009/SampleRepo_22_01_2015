package com.ndmm.internship.training.test

public class Start extends Service{
	List<Student> student = new ArrayList<Student>()
	def insertStudent(){
		def student1 = new Student(studentName:"Mg Mg",rollNumber:2,studentAddress:"Hlaing Ygn")
		def student2 = new Student(studentName:"Ma Mg",rollNumber:1,studentAddress:"Latha Ygn")
		def student3= new Student(studentName:"Win Latt",rollNumber:3,studentAddress:"Hinthada ")
		def student4 = new Student(studentName:"King King",rollNumber:4,studentAddress:"Mhawbi Ygn")
		def student5 = new Student(studentName:"Soe Soe",rollNumber:5,studentAddress:"Tamwe Ygn")
		student<<student1
		student<<student2
		student<<student3
		student<<student4
		student<<student5
	}
	def studentList(){
		int i=0
		println "Sorting with StudentName !!"
		student.sort{ a,b ->
			a.studentName <=> b.studentName
		}//sort the student list by studentName property
		for(s in student){
			println "$i ->"+s.studentName+" | "+s.rollNumber+" | "+s.studentAddress
			i++
		}
		i=0
		println "Sorting with RollNumber !!"
		// We order first on dynamic property and then name property.
		def orderByRollNumber=new OrderBy([{it.rollNumber}])
		def sortedList = student.sort(orderByRollNumber)
		println "Student's List Size is $student.size and Sorted By RollNumber"
		for(s in sortedList){
			println "$i ->"+s.studentName+" | "+s.rollNumber+" | "+s.studentAddress
			i++
		}
	}
	def deleteStudent(int studentNumber){
		student.remove(studentNumber)
		println "Deleted Student No : $studentNumber Successfully!"
		println "After Deleting Student's List Size is $student.size"
		int i=0
		for(s in student){
			println "$i ->"+s.studentName+" | "+s.rollNumber+" | "+s.studentAddress
			i++
		}
	}
	def  findStudent(int studentNumber) {
		def result =student.getAt(studentNumber)
		if(!result){
			println "Search is Over!!!"
		}
		else{
			println "1 Result was found!!"
			println "$studentNumber->"+result.studentName+" | "+result.rollNumber+" | "+result.studentAddress
		}
	}
	def findingMatchIndex(){
		int i=0
		def index = student.findIndexValues { it.studentName ==~ /Ma .*\w+/ }
		if(index){
			println "Results was fould"
		}
		else{
			println "No index found!!"
		}
	}

	static void main(String[] args) {
		def studentMain = new Start()
		studentMain.insertStudent()
		studentMain.studentList()
		studentMain.deleteStudent(1)
		studentMain.findStudent(0)
		studentMain.findingMatchIndex()
	}
}