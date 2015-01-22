class Check{
	static void main(def args){
		Scanner input = new Scanner(System.in)
		def command = [
			"exit",
			"retrieve",
			"update",
			"delete",
			"insert"
		]
		String  operation =null
		while(operation!=command[0]){
			println " Enter Operation .."
			operation = input.nextLine()
			if(operation==command[1]){
				println "This is for Retrieve"
			}else if(operation==command[2]) {
				println "This is for Update"
			}else if(operation==command[3]) {
				println "This is for Delete"
			}else if (operation==command[4]){
				println "This is for Insert"
			}
		}
		System.exit(0)
	}
}