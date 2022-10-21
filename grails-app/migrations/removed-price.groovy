databaseChangeLog = {

    changeSet(author: "mehulchopra (generated)", id: "1666360470850-1") {
        dropColumn(columnName: "price", tableName: "book")
    }
}
