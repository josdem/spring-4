--liquibase formatted sql
 
--changeset makingdevs:7
CREATE TABLE IF NOT EXISTS USER(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    DATE_CREATED TIMESTAMP NOT NULL,
    ENABLED BOOLEAN NOT NULL,
    LAST_UPDATED TIMESTAMP NOT NULL,
    USERNAME VARCHAR(255) NOT NULL
);                  
     
--changeset makingdevs:8
INSERT INTO USER(ID, DATE_CREATED, ENABLED, LAST_UPDATED, USERNAME) VALUES
(1, TIMESTAMP '2014-02-12 13:06:30.342', TRUE, TIMESTAMP '2014-02-12 13:06:30.342', 'makingdevs'),
(2, TIMESTAMP '2014-02-12 13:06:38.918', TRUE, TIMESTAMP '2014-02-12 13:06:38.918', 'neodevelop'),
(3, TIMESTAMP '2014-02-12 13:06:44.007', TRUE, TIMESTAMP '2014-02-12 13:06:44.007', 'yadelisa'),
(4, TIMESTAMP '2014-02-12 13:07:00.753', TRUE, TIMESTAMP '2014-02-12 13:07:00.753', 'sohjiro'),
(5, TIMESTAMP '2014-02-12 13:07:06.092', FALSE, TIMESTAMP '2014-02-12 13:07:06.092', 'says_cisco'),
(6, TIMESTAMP '2014-02-12 13:07:12.239', FALSE, TIMESTAMP '2014-02-12 13:07:12.239', 'cggg88jorge'),
(7, TIMESTAMP '2014-02-12 13:07:18.388', FALSE, TIMESTAMP '2014-02-12 13:07:18.388', 'marlenz');