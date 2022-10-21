databaseChangeLog = {

    changeSet(author: "mehulchopra (generated)", id: "1666360267825-1") {
        addColumn(tableName: "book") {
            column(name: "pages", type: "integer") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "mehulchopra (generated)", id: "1666360267825-2") {
        dropNotNullConstraint(columnDataType: "int", columnName: "price", tableName: "book")
    }
}
