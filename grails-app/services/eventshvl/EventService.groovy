package eventshvl

import grails.transaction.Transactional

@Transactional
class EventService {

    def serviceMethod() {

    }

    def getAllEvents(){

        List<Events> events = Events.findAll()
            [evenList:events]
        }

}
