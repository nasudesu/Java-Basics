DROP DATABASE IF EXISTS currency;
CREATE DATABASE currency;
USE currency;
DROP DATABASE IF EXISTS Transaction;
CREATE DATABASE Transaction;

CREATE TABLE IF NOT EXISTS CurrencyConvert
(
    currency VARCHAR(3)     NOT NULL,
    rate     DECIMAL(10, 4) NOT NULL,
    PRIMARY KEY (currency)
);

CREATE TABLE IF NOT EXISTS Transaction(
    id INT AUTO_INCREMENT,
    amount DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO CurrencyConvert (currency, rate)
VALUES ('USD', 1.00),
       ('EUR', 0.95),
       ('JPY', 149.68),
       ('GBP', 0.83),
       ('CNY', 7.21),
       ('AUD', 1.58),
       ('CAD', 1.37),
       ('CHF', 0.92);

DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE ON CURRENCY.* TO 'appuser'@'localhost';
GRANT SELECT,INSERT,UPDATE,DELETE ON Transaction.* TO 'appuser'@'localhost';
GRANT CREATE, DROP ON Transaction.* TO 'appuser'@'localhost';