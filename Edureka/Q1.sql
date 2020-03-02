//Part 1 of Q1
use Data_Foundation;
CREATE TABLE table1 ( `empid` INT NOT NULL, `firstname` VARCHAR(45) NOT NULL, `lastname` VARCHAR(45) NOT NULL,`age` INT NULL, PRIMARY KEY (`empid`));
DELIMITER $$
CREATE PROCEDURE insert_table()
BEGIN
insert into table1 values (1,'Siddhant','Sharma',21), (2, 'Apoorva','Sharma',21),(3,'Avi','Sharma',22),(4,'Aadi','Sharma',22),(5,'Aarvi','Sharma',23);
END $$
DELIMITER ;
CALL insert_table();
SELECT * from table1;


//Part 2 of Q1
DROP PROCEDURE insert_table;
DELIMITER $$
CREATE PROCEDURE insert_table()
BEGIN
DECLARE pkvalue int;
select max(empid) into pkvalue from table1;
insert into table1 values (pkvalue+1,'Vipul','Chikara',22), (pkvalue+2,'Jay','Patel',21),(pkvalue+3,'Devansh','Bindal',21);
END $$
DELIMITER ;
CALL insert_table();
SELECT * from table1;
