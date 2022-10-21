package libmgmtv2

import grails.rest.Resource

@Resource(uri='/books', formats = ['json'])
class Book {

    String title
    Integer pages

    static constraints = {
        title maxSize: 20, unique: true
    }
}
