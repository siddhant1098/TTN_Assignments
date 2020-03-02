DROP TABLE student_marks;
CREATE TABLE student_marks ( `student_id` INT NOT NULL, `marks` INT NOT NULL, `grade` VARCHAR(100) ,PRIMARY KEY (`student_id`));
DELIMITER $$
CREATE PROCEDURE insert_table()
BEGIN
insert into student_marks values (1, 70,null),(2,82,null),(3,94,null),(4,96,null),(5,68,null);
END $$
DELIMITER ;
DELIMITER $$
CREATE PROCEDURE demo_table()
BEGIN
DECLARE done INT DEFAULT FALSE;
DECLARE s_id int;
DECLARE mrks int;
DECLARE cur1 CURSOR FOR select student_id,marks from student_marks;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
OPEN cur1;
get_loop: LOOP
FETCH cur1 INTO s_id, mrks;
IF  done THEN LEAVE get_loop; END IF;
IF  mrks<50 THEN update student_marks set  grade ='D' where student_id = s_id;
ELSEIF  mrks<70 THEN update student_marks set  grade ='C' where student_id = s_id;
ELSEIF  mrks<90 THEN update student_marks set  grade ='B' where student_id = s_id;
ELSE update student_marks set  grade ='A' where student_id = s_id; 
END IF;
END LOOP;
CLOSE cur1;
END $$ DELIMITER ;CALL insert_table;CALL demo_table;select * from student_marks;

