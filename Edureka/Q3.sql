DELIMITER $$
CREATE PROCEDURE Case_Function(IN age INT,OUT output varchar(255))
BEGIN
CASE age
    WHEN 21 THEN SET Output = 'the age is 21';
    WHEN 22  THEN SET Output = 'the age is 22';
    WHEN 23  THEN SET Output = 'the age is 23';
    ELSE SET Output = 'the age is 24';
END CASE;
END $$
DELIMITER ;
CALL Case_Function(22,@output);
SELECT @output;

