# SimpleHibernate
Основные функции работы с Hibernate, Hibernate annotations api, maven, mysql.

## Inheritance Mapping:
### 1. Table per Hierarchy
In table per hierarchy mapping, single table is required to map the whole hierarchy, an extra column (known as discriminator column) is added to identify the class. But nullable values are stored in the table.

tables: tph(see databases.txt)

### 2. Table per concrete class
In case of Table Per Concrete class, tables are created per class. So there are no nullable values in the table. Disadvantage of this approach is that duplicate columns are created in the subclass tables.

tables: ID_Generator, tpcEmployee, tpcContractEmployee, tpcRegularEmployee
