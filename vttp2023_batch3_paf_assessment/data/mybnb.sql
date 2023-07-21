-- Create the 'mybnb' database
CREATE DATABASE IF NOT EXISTS mybnb;

-- Switch to 'mybnb' database
USE mybnb;

DROP TABLE IF EXISTS acc_occupancy;
DROP TABLE IF EXISTS reservations;
-- Create the 'acc_occupancy' table
CREATE TABLE acc_occupancy (
                               acc_id VARCHAR(10),
                               vacancy INT,
                               PRIMARY KEY (acc_id)
);

-- Create the 'reservations' table
CREATE TABLE reservations (
                         resv_id VARCHAR(8),
                         name VARCHAR(128),
                         email VARCHAR(128),
                         acc_id VARCHAR(10),
                         arrival_date DATE,
                         duration INT,
                         PRIMARY KEY (resv_id),
                         FOREIGN KEY (acc_id) REFERENCES acc_occupancy(acc_id)
);
