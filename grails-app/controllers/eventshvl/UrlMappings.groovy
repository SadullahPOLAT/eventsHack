package eventshvl

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/mainPage.gsp")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
