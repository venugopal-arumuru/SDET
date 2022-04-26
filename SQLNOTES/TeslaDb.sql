CREATE DATABASE TeslaDB;
USE TeslaDB;

CREATE TABLE Customers(
	Id int auto_increment primary key,
	FirstName varchar(100) NOT NULL,
	MiddleName varchar(100) NULL,
	LastName varchar(100) NULL,
	StreetName varchar(500) NULL,
	City varchar(100) NULL,
	StateId int NULL,
	EmailAddress varchar(500),
	Password varchar(50));



CREATE TABLE Dealers(
	Id int auto_increment primary key,
	Name varchar(500) NOT NULL,
	StreetName varchar(50) NULL,
	City varchar(50) NULL,
	StateId int NULL);


CREATE TABLE LookupStates(
	Id int auto_increment primary key,
	Code varchar(50) NOT NULL,
	FullName varchar(100) NOT NULL);
 
CREATE TABLE Models(
	Id int auto_increment primary key,
	Name varchar(50) NOT NULL,
	Price int NOT NULL,
	Description varchar(1000) NULL,
	ImagePath varchar(500) NULL,
	Range1 varchar(500) NULL,
	Acceleration varchar(500) NULL,
	TopSpeed int NULL,
	AllWheelDrive bit NULL);


CREATE TABLE Orders(
	Id int auto_increment primary key,
	CustomerId int NOT NULL,
	DealerId int NOT NULL,
	ModelId int NOT NULL,
	Quantity int NOT NULL,
	Discount decimal(12, 2) NULL,
	TotalAmount int NOT NULL,
	OrderDate datetime NULL);
 


INSERT into Customers  (FirstName, MiddleName, LastName, StreetName, City, StateId, EmailAddress, Password) VALUES ('John', 'M', 'Scully', '1 Newark St', 'Hoboken', 35, NULL, NULL);
INSERT into Customers  (FirstName, MiddleName, LastName, StreetName, City, StateId, EmailAddress, Password) VALUES ('Joshua', NULL, 'Kushner', '325 South End Ave', 'NewYork', 37, NULL, NULL);
INSERT into Customers  (FirstName, MiddleName, LastName, StreetName, City, StateId, EmailAddress, Password) VALUES ('Reed', 'T', 'Hastings', '200 Vatrik St', 'San Francisco', 6, NULL, NULL);
INSERT into Customers  (FirstName, MiddleName, LastName, StreetName, City, StateId, EmailAddress, Password) values('Ellon', NULL, 'Musk', '1 Silicon Ave', 'SiliconValley', 6, NULL, NULL);
INSERT into Customers  (FirstName, MiddleName, LastName, StreetName, City, StateId, EmailAddress, Password) VALUES ('Jenny', 'L', 'Jackson', '11168 Antioch Rd', 'OverlandPark', 20, NULL, NULL);
INSERT into Customers  (FirstName, MiddleName, LastName, StreetName, City, StateId, EmailAddress, Password) VALUES ('Jillian', NULL, 'Scully', '1918 Skibo Rd', 'Fayetteville', 38, NULL, NULL);

select * from customers;

INSERT into Dealers(Name, StreetName, City, StateId) VALUES ('Brooklyn Tesla', '160 Van Brunt Street', 'Brroklyn', 37);
INSERT into Dealers(Name, StreetName, City, StateId) VALUES('SanFrancisco Tesla', '1 Nicole Drive', 'SanFrancisco', 6);
INSERT into Dealers(Name, StreetName, City, StateId) VALUES('Fayetteville Tesla', '255 Central Ave', 'Fayetteville', 38);
INSERT into Dealers(Name, StreetName, City, StateId) VALUES('OverlandPark Tesla', '11923 Sinatra Rd', 'OverlandPark', 20);
INSERT into Dealers(Name, StreetName, City, StateId) VALUES ('Delaware Tesla', '12 Washington Dr', 'Dover', 9);
INSERT into Dealers(Name, StreetName, City, StateId) VALUES('Whippany Tesla', '1255 Route 10', 'Whippany', 35);

select * from dealers;

INSERT into LookupStates(Code, FullName) VALUES ('AL', 'Alabama');
INSERT into LookupStates(Code, FullName) VALUES ('AK', 'Alaska');
INSERT into LookupStates(Code, FullName) VALUES('AS', 'American Samoa');
INSERT into LookupStates(Code, FullName) VALUES ('AZ', 'Arizona');
INSERT into LookupStates(Code, FullName) VALUES('AR', 'Arkansas');
INSERT into LookupStates(Code, FullName) VALUES('CA', 'California');
INSERT into LookupStates(Code, FullName) VALUES ('CO', 'Colorado');
INSERT into LookupStates(Code, FullName) VALUES ('CT', 'Connecticut');
INSERT into LookupStates(Code, FullName) VALUES('DE', 'Delaware');
INSERT into LookupStates(Code, FullName) VALUES ('DC', 'District of Columbia');
INSERT into LookupStates(Code, FullName) VALUES('FM', 'Federated LookupStatess of Micronesia');
INSERT into LookupStates(Code, FullName) VALUES ('FL', 'Florida');
INSERT into LookupStates(Code, FullName) VALUES ('GA', 'Georgia');
INSERT into LookupStates(Code, FullName) VALUES ('GU', 'Guam');
INSERT into LookupStates(Code, FullName) VALUES ('HI', 'Hawaii');
INSERT into LookupStates(Code, FullName) VALUES ('ID', 'Idaho');
INSERT into LookupStates(Code, FullName) VALUES ('IL', 'Illinois');
INSERT into LookupStates(Code, FullName) VALUES ('IN', 'Indiana');
INSERT into LookupStates(Code, FullName) VALUES ('IA', 'Iowa');
INSERT into LookupStates(Code, FullName) VALUES ('KS', 'Kansas');
INSERT into LookupStates(Code, FullName) VALUES ('KY', 'Kentucky');
INSERT into LookupStates(Code, FullName) VALUES ('LA', 'Louisiana');
INSERT into LookupStates(Code, FullName) VALUES ('ME', 'Maine');
INSERT into LookupStates(Code, FullName) VALUES ('MH', 'Marshall Islands');
INSERT into LookupStates(Code, FullName) VALUES('MD', 'Maryland');
INSERT into LookupStates(Code, FullName) VALUES ('MA', 'Massachusetts');
INSERT into LookupStates(Code, FullName) VALUES ('MI', 'Michigan');
INSERT into LookupStates(Code, FullName) VALUES ('MN', 'Minnesota');
INSERT into LookupStates(Code, FullName) VALUES ('MS', 'Mississippi');
INSERT into LookupStates(Code, FullName) VALUES ('MO', 'Missouri');
INSERT into LookupStates(Code, FullName) VALUES ('MT', 'Montana');
INSERT into LookupStates(Code, FullName) VALUES ('NE', 'Nebraska');
INSERT into LookupStates(Code, FullName) VALUES ('NV', 'Nevada');
INSERT into LookupStates(Code, FullName) VALUES ('NH', 'New Hampshire');
INSERT into LookupStates(Code, FullName) VALUES ('NJ', 'New Jersey');
INSERT into LookupStates(Code, FullName) VALUES ('NM', 'New Mexico');
INSERT into LookupStates(Code, FullName) VALUES ('NY', 'New York');
INSERT into LookupStates(Code, FullName) VALUES ('NC', 'North Carolina');
INSERT into LookupStates(Code, FullName) VALUES ('ND', 'North Dakota');
INSERT into LookupStates(Code, FullName) VALUES ('MP', 'Northern Mariana Islands');
INSERT into LookupStates(Code, FullName) VALUES ('OH', 'Ohio');
INSERT into LookupStates(Code, FullName) VALUES ('OK', 'Oklahoma');
INSERT into LookupStates(Code, FullName) VALUES ('OR', 'Oregon');
INSERT into LookupStates(Code, FullName) VALUES ('PW', 'Palau');
INSERT into LookupStates(Code, FullName) VALUES ('PA', 'Pennsylvania');
INSERT into LookupStates(Code, FullName) VALUES ('PR', 'Puerto Rico');
INSERT into LookupStates(Code, FullName) VALUES ('RI', 'Rhode Island');
INSERT into LookupStates(Code, FullName) VALUES ('SC', 'South Carolina');
INSERT into LookupStates(Code, FullName) VALUES('SD', 'South Dakota');
INSERT into LookupStates(Code, FullName) VALUES ('TN', 'Tennessee');
INSERT into LookupStates(Code, FullName) VALUES ('TX', 'Texas');
INSERT into LookupStates(Code, FullName) VALUES ('UT', 'Utah');
INSERT into LookupStates(Code, FullName) VALUES ('VT', 'Vermont');
INSERT into LookupStates(Code, FullName) VALUES ('VI', 'Virgin Islands');
INSERT into LookupStates(Code, FullName) VALUES ('VA', 'Virginia');
INSERT into LookupStates(Code, FullName) VALUES ('WA', 'Washington');
INSERT into LookupStates(Code, FullName) VALUES ('WV', 'West Virginia');
INSERT into LookupStates(Code, FullName) VALUES ('WI', 'Wisconsin');

select * from lookupstates;

INSERT into Models(Name, Price, Description, ImagePath, Range1, Acceleration, TopSpeed, AllWheelDrive) 
VALUES ('Model S', 50000, 'Model S is designed from the ground up to be the safest, most exhilarating sedan on the road. With unparalleled performance delivered through Tesla’s unique, all-electric powertrain, Model S accelerates from 0 to 60 mph in as little as 2.8 seconds. Model S comes with Autopilot capabilities designed to make your highway driving not only safer, but stress free.', NULL, '270 miles (EPA)', '2.8 seconds 0-60 mph', 155, 1);
INSERT into Models (Name, Price, Description, ImagePath, Range1, Acceleration, TopSpeed, AllWheelDrive) 
VALUES ('Model X', 70000, 'Model X is the safest, fastest and most capable sport utility vehicle in history. With all-wheel drive and a 90 kWh battery providing 257 miles of range, Model X has ample seating for seven adults and all of their gear. And it’s ludicrously fast, accelerating from zero to 60 miles per hour in as quick as 3.2 seconds. Model X is the SUV uncompromised.', NULL, '250 miles (EPA)', '3.8 seconds 0-60 mph', 150, 0);

INSERT into Models (Name, Price, Description, ImagePath, Range1, Acceleration, TopSpeed, AllWheelDrive) 
VALUES ('Model 3', 35000, 'Model 3 combines real world range, performance, safety and spaciousness into a premium sedan that only Tesla can build. Our most affordable car yet, Model 3 achieves 215 miles of range per charge while starting at only $35,000 before incentives. Model 3 is designed to attain the highest safety ratings in every category. ', NULL, '230 miles (EPA)', '4.2 seconds 0-60 mph', 140, 0);

select * from models;


INSERT into Orders(CustomerId, DealerId, ModelId, Quantity, Discount, TotalAmount, OrderDate) 
VALUES (1, 1, 1, 2, NULL, 100000, CAST('2016-06-01 00:00:00.000' AS DateTime));

INSERT into Orders(CustomerId, DealerId, ModelId, Quantity, Discount, TotalAmount, OrderDate) 
VALUES (1, 2, 2, 1, CAST(5.00 AS Decimal(12, 2)), 65000, CAST('2016-05-01 00:00:00.000' AS DateTime));

INSERT into Orders(CustomerId, DealerId, ModelId, Quantity, Discount, TotalAmount, OrderDate) 
VALUES (2, 3, 3, 1, NULL, 35000, CAST('2016-04-15 00:00:00.000' AS DateTime));

INSERT into Orders(CustomerId, DealerId, ModelId, Quantity, Discount, TotalAmount, OrderDate) 
VALUES (4, 6, 2, 10, CAST(10.00 AS Decimal(12, 2)), 630000, CAST('2015-04-28 00:00:00.000' AS DateTime));

INSERT into Orders(CustomerId, DealerId, ModelId, Quantity, Discount, TotalAmount, OrderDate) 
VALUES (3, 4, 3, 3, NULL, 105000, CAST('2016-01-15 00:00:00.000' AS DateTime));

INSERT into Orders(CustomerId, DealerId, ModelId, Quantity, Discount, TotalAmount, OrderDate) 
VALUES (6, 5, 1, 2, CAST(10.00 AS Decimal(12, 2)), 90000, CAST('2016-02-07 00:00:00.000' AS DateTime));

INSERT into Orders(CustomerId, DealerId, ModelId, Quantity, Discount, TotalAmount, OrderDate) 
VALUES (5, 1, 1, 1, NULL, 50000, CAST('2016-01-28 00:00:00.000' AS DateTime));

INSERT into Orders(CustomerId, DealerId, ModelId, Quantity, Discount, TotalAmount, OrderDate) 
 VALUES (1, 2, 1, 1, NULL, 50000, CAST('2016-02-03 00:00:00.000' AS DateTime));
INSERT into Orders(CustomerId, DealerId, ModelId, Quantity, Discount, TotalAmount, OrderDate) 
 VALUES (6, 3, 1, 2, NULL, 140000, CAST('2016-02-17 00:00:00.000' AS DateTime));

select * from orders;

-- ================================
