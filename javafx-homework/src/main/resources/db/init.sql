-- Create a new database called 'Homework'
-- Connect to the 'master' database to run this snippet
USE master
GO
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT name
        FROM sys.databases
        WHERE name = N'Homework'
)
CREATE DATABASE Homework
GO

CREATE TABLE Staff(
    id CHAR(9) NOT NULL,
    lastName VARCHAR(15),
    firstName VARCHAR(15),
    mi CHAR(1),
    address VARCHAR(20),
    city VARCHAR(20),
    state CHAR(2),
    telephone CHAR(10),
    email VARCHAR(40),
    PRIMARY KEY (id)
)
