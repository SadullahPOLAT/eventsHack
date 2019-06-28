package eventshvl

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])

class ProductAnnouncementController {


    def index() {

        def announcements = ProductAnnouncement.createCriteria().list {
            order("dateCreated", "desc")
            maxResults(1)
        }
        render announcements.first()?.message

    }
}
