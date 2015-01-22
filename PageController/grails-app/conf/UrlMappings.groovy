class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{ constraints {
				// apply constraints here
			} }
		//"/"(view:"/index")
		"/" controller:"training"
		"500"(view:'/error')
	}
}
