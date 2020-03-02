create table student_audit (student_id int auto_increment primary key, marks int, grade varchar(50), changedate datetime default null, action varchar(50) default null);


delimiter $$
create trigger AFTER_student_insert
AFTER INSERT ON student
FOR EACH ROW
BEGIN 
	INSERT INTO student_audit
	set action = 'after insert',
	marks = new.marks,
	grade = new.grade,
	changedate = now();
end$$
delimiter ;


delimiter $$
create trigger before_student_update
BEFORE UPDATE ON student
FOR EACH ROW
BEGIN 
	INSERT INTO student_audit
	set action = 'before update',
	marks = old.marks,
	grade = old.grade,
	changedate = now();
end$$
delimiter ;


delimiter $$
create trigger after_student_update
AFTER UPDATE ON student
FOR EACH ROW
BEGIN 
	INSERT INTO student_audit
	set action = 'after update',
	marks = NEW.marks,
	grade = NEW.grade,
	changedate = now();
end$$
delimiter ;


delimiter $$
create trigger after_student_delete
AFTER DELETE ON student
FOR EACH ROW
BEGIN 
	INSERT INTO student_audit
	set action = 'after delete',
	marks = old.marks,
	grade = old.grade,
	changedate = now();
end$$
delimiter ;


delimiter $$
create trigger before_student_delete
BEFORE DELETE ON student
FOR EACH ROW
BEGIN 
	INSERT INTO student_audit
	set action = 'before delete',
	marks = old.marks,
	grade = old.grade,
	changedate = now();
end$$
delimiter ;


delimiter $$
create trigger before_student_insert
BEFORE INSERT ON student
FOR EACH ROW
BEGIN 
	INSERT INTO student_audit
	set action = 'before insert',
	marks = NEW.marks,
	grade = NEW.grade,
	changedate = now();
end$$
delimiter ;



