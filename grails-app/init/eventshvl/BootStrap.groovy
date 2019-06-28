package eventshvl

import authorization.*
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
    }
    def destroy = {
    }
}
