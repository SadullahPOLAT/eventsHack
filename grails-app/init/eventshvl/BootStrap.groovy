package eventshvl

import authorization.*
import grails.plugin.springsecurity.SpringSecurityService

class BootStrap {
def springSecurityService
    def init = { servletContext ->

        new ProductAnnouncement(message: 'Launch day').save()

        def userRole = new Role('ROLE_USER').save()
        def userRole2 = new Role('ROLE_ADMIN').save()

        def me = new Person('user', springSecurityService.encodePassword('1234')).save()
        def me2 = new Person('admin', springSecurityService.encodePassword('1234')).save()

        PersonRole.create me, userRole

        PersonRole.withSession {
            it.flush()
            it.clear()
        }

        PersonRole.create me2, userRole2

        PersonRole.withSession {
            it.flush()
            it.clear()
        }

        def event1 = new Events(description: 'Hackathon evet', capacity: 50, applicationStartDate: '2019-06-15 10:23:54', applicationEndDate:'2019-06-26 10:23:54',eventDate: '2019-06-27 08:30:54').save()
        def event2 = new Events(description: '2H yan haklar', capacity: 20000, eventDate: '2019-06-28 14:00:54').save()


    }
    def destroy = {
    }
}
