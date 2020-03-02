DROP PROCEDURE insert_table;
DELIMITER $$
CREATE PROCEDURE insert_table(IN fname VARCHAR(45),IN lname VARCHAR(45),IN age INT)
BEGIN
DECLARE pkvalue int;
select max(empid) into pkvalue from table1;
insert into table1 values (pkvalue+1,fname,lname,age);
END $$
DELIMITER ;
CALL insert_table('Sandeep','Sharma',24);
SELECT * from table1;
