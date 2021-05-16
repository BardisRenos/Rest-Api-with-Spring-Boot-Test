# AtosTest


### Documentation



### Schema Design

The below sql command that create the database table `Users` 

```sql
CREATE TABLE Users (
    `id`  INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `name` VARCHAR(64),
    `lastName` VARCHAR(64),
    `age` INT,
    `address` VARCHAR(64),
    `city` VARCHAR(64),
    `country` VARCHAR(64));
```

The other sql command fill up the table 
```sql
 INSERT INTO Users (id, name, lastName, age, address, city, country)
 VALUES (122, 'Renos', 'Bardis', 20, '78 BD Wilson', 'Antibes', 'France'),
        (222, 'Omar', 'Mater', 21, '6 BD Dugommier', 'Juan Leas Pins', 'France'),
        (322, 'Jacques', 'Seilier', 25, '89 BD Albert', 'Nice', 'France'),
        (422, 'Nikos', 'Pappas', 35, '101 BD Cannes', 'Cannes', 'France');
```


