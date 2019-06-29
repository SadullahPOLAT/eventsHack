package eventshvl

import grails.plugin.springsecurity.annotation.Secured


@Secured(['ROLE_USER','ROLE_ADMIN'])
class EventsController {


    def getEvents = {
        def events = Events.findAll();
        String name = "Tony Danza"
        [name: name]

    }

    def index() { }
}
