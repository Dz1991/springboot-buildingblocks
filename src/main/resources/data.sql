INSERT INTO USER (ID,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,ROLE,SSN,USER_NAME) VALUES(101, 'kreddy@stacksimplify.com', 'Kalyan', 'Reddy', 'admin', 'ssn101', 'kreddy');
INSERT INTO USER (ID,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,ROLE,SSN,USER_NAME) VALUES(102, 'gwiser@stacksimplify.com', 'Greg', 'Wiser', 'admin', 'ssn102', 'gwiser');
INSERT INTO USER (ID,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME,ROLE,SSN,USER_NAME) VALUES(103, 'dmark@stacksimplify.com', 'David', 'Mark', 'admin', 'ssn103', 'dmark');
insert into orders (orderid, orderdescription, user_id) values( 2001, 'order11', 101);
insert into orders (orderid, orderdescription, user_id) values( 2002, 'order12', 101);
insert into orders (orderid, orderdescription, user_id) values( 2003, 'order13', 101);
insert into orders (orderid, orderdescription, user_id) values( 2004, 'order21', 102);
insert into orders (orderid, orderdescription, user_id) values( 2005, 'order22', 102);
insert into orders (orderid, orderdescription, user_id) values( 2006, 'order31', 103);