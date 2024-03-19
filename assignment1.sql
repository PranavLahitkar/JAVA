create table sailor(s_id integer primary key ,s_name varchar(60),rating integer,age real);
create table Boat(b_id integer primary key,b_name varchar(60),color varchar(60));
create table Reserves(
    s_id integer,
    b_id integer,
    day date,
    primary key(s_id, b_id, day),
    foreign key(s_id) REFERENCES Sailor(s_id),
    FOREIGN KEY (b_id) REFERENCES Boat(b_id)
);




insert into sailor values(22,'Dustin',7,45.0);
insert into sailor values(29,'Brutus',1,33.0);
insert into sailor values(31,'Lubber',8,55.5);
insert into sailor values(32,'Andy',8,25.5);
insert into sailor values(58,'Rusty',10,35.0);
insert into sailor values(64,'Horatio',7,35.0);
insert into sailor values(71,'Zorban',10,16.0);
insert into sailor values(74,'Horatio',9,35.0);
insert into sailor values(85,'Art',3,25.5);
insert into sailor values(95,'Bob',3,63.5);
select *from sailor;
insert into Boat values(101,'Interlake','blue');
insert into Boat values(102,'Interlake','red');
insert into Boat values(103,'Clipper','green');
insert into Boat values(104,'Marine','red');
select *from Boat;
insert into Reserves values(22, 101, '10/10/98');
insert into Reserves values(22, 102, '10/10/98');
insert into Reserves values(22, 103, '10/8/98');
insert into Reserves values(22, 104, '10/7/98');
insert into Reserves values(31, 102, '11/10/98');
insert into Reserves values(31, 103, '11/6/98');
insert into Reserves values(31, 104, '12/12/98');
insert into Reserves values(64, 101, '9/5/98');
insert into Reserves values(64, 102, '9/8/98');
insert into Reserves values(74, 103, '9/8/98');
select *from Reserves;

SELECT rating, MIN(age) AS min_age
FROM Sailor
GROUP BY rating;

SELECT color, COUNT(*) AS num_boats
FROM Boat
GROUP BY color;

SELECT rating, MAX(age) AS max_age
FROM Sailor
GROUP BY rating;

SELECT b_id, COUNT(*) AS num_reservations
FROM Reserves
GROUP BY b_id
ORDER BY b_id DESC;


SELECT rating, AVG(age) AS avg_age
FROM Sailor
GROUP BY rating
HAVING COUNT(s_id) >= 2;

SELECT rating, MIN(age) AS min_age
FROM Sailor
where age>18
GROUP BY rating;


SELECT S.s_name, R.day
FROM Sailor S
JOIN Reserves R ON S.s_id = R.s_id
ORDER BY R.day ASC;
