# SimpleHibernate
Основные функции работы с Hibernate, Hibernate annotations api, maven, mysql.

## Inheritance Mapping:
### 1. Table per Hierarchy
In table per hierarchy mapping, single table is required to map the whole hierarchy, an extra column (known as discriminator column) is added to identify the class. But nullable values are stored in the table.

tables: tph(see databases.txt)

### 2. Table per concrete class
In case of Table Per Concrete class, tables are created per class. So there are no nullable values in the table. Disadvantage of this approach is that duplicate columns are created in the subclass tables.

tables: ID_Generator(внешняя таблица для хранения @Id объектов, т.к. использовался strategy = GenerationType.TABLE), tpcEmployee, tpcContractEmployee, tpcRegularEmployee

### 3. Table Per Subclass
In case of table per subclass strategy, tables are created as per persistent classes but they are reated using primary and foreign key. So there will not be duplicate columns in the relation.

tables: tpsEmployee, tpsContractEmployee, tpsRegularEmployee
