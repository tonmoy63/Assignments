use tonmoymdb;

create table customer(
cust_id varchar(30) primary key,	
Fname varchar(20) not null,		
Lname varchar(20),
Area varchar(20) not null,
Phone numeric(10)
);
create table movie(
Mv_no int primary key,  
cust_id varchar(30),
Title varchar(25) not null,
Star varchar(20) not null,
Price integer,
foreign key movie(cust_id) references customer(cust_id) 	
);
#inseting values into customer table
insert into customer values
('A01','Ivan','Ross','SA',6125467),
('A02','Vandana','Ray','MU',5560379),
('A03','Pramada','Jauguste','DA',4560389),
('A04','Basu','Navindi','BA',6125401),
('A05','Ravi','Shridhar','NA',null),
('A06','Rukmini','Aiyer','GH',5125274);

#inserting values into movie table
insert into movie values
(1, 'A02', 'Bloody', 'JC', 181),
(2, 'A04', 'The Firm', 'TC', 200),
(3, 'A01', 'Pretty Woman', 'RG', 151),
(4, 'A06', 'Home Alone', 'MC', 150),
(5, 'A05', 'The Fugitive', 'MF', 200),
(6, 'A03', 'Come', 'MD', 100),
(7, 'A02', 'Dracula', 'GO', 150),
(8, 'A06', 'Quick change', 'BM', 100),
(9, 'A03', 'Gone with the wind', 'CB', 200),
(10, 'A05', 'Carry on Doctor', 'LP', 100);

#5. Display the movie titles, whose price is greater than 100 but less than 200.
select title from movie where price between 100 and 200;
# 6. Display the cust_id who have seen movies having stars as either JC or TC or MC.
select cust_id from movie where star in('JC','TC','MC');
#7. Display the details of those customers who have an A in their area name.
select * from customer where area like '%A%';
#8. Display the movie titles, whose price is within 180 and the movie titles are of exactly 6
select title from movie where price<180 and length(title)=6;
#9. Display the movie name, their original prices and the prices after 10% increment. Give alias name to the incremented price column.
select title, price, price+(price*10/100) as '10% increament' from movie;
#10. Display all the customer details in the following way: ‘Ivan Ross stays in SA and his phone number is 6125467.’
select fname, lname,area,phone from customer where cust_id='A01';
#11. Add a not null constraint to the Lname field in Customer.
alter table customer modify lname varchar(40) not null;
#12. Display the customer’s name whose phone number is not recorded.
select fname from customer where phone is null;
#13. Add the phone number according to your own wish for the person mentioned in problem no 12.
update customer set phone=1234567 where phone is null;
#14. Display the unique customer ids from movie table.
select distinct cust_id from customer movie;
#15. Remove the not null constraint from Star column in movie table.
alter table movie modify star varchar(30);
#16 . Delete any row from the Customer table. If you cannot delete, then note the error message displayed.
delete from customer where cust_id='A01';
#17. Delete any row from the Movie table. If you cannot delete, then note the error message displayed.
delete from movie where cust_id='A02';
#18. Drop the Customer table. If you cannot drop, then note the error message displayed.
drop table customer;
#19. Drop the Movie table. If you cannot drop, then note the error message displayed.
drop table movie;
#20. Drop the foreign key from Movie table.
