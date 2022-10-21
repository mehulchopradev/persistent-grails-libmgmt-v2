package libmgmtv2

class BootStrap {

    def init = { servletContext ->
        if (Book.count() == 0) {
            new Book(title: 'Book 1', pages: 900).save()
            new Book(title: 'Book 2', pages: 100).save()
        }
    }
    def destroy = {
    }
}
