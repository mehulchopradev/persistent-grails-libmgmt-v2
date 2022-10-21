databaseChangeLog = {

    changeSet(author: "mehulchopra (generated)", id: "1666358800026-1") {
        createTable(tableName: "book") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "bookPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "title", type: "VARCHAR(20)") {
                constraints(nullable: "false")
            }

            column(name: "price", type: "INT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "mehulchopra (generated)", id: "1666358800026-2") {
        addUniqueConstraint(columnNames: "title", constraintName: "UC_BOOKTITLE_COL", tableName: "book")
    }
    include file: 'added-pages-pricenullconstraint.groovy'
    include file: 'removed-price.groovy'
}
