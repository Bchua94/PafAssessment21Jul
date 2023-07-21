CREATE DATABASE IF NOT EXISTS mybnb;

USE mybnb;
DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS acc_occupancy;


CREATE TABLE acc_occupancy (
                               acc_id VARCHAR(10),
                               vacancy INT,
                               PRIMARY KEY (acc_id)
);


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
