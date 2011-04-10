--liquibase formatted sql


/*
   Release Version 3
 */

--changeset foo:1
CREATE TABLE test3 (id int primary key);
--rollback DROP TABLE test3;

--changeset bar:2
ALTER TABLE test3 ADD COLUMN name VARCHAR(10);
--rollback ALTER TABLE test3 DROP COLUMN name;

--changeset bar:3
INSERT INTO test3 (id, name) VALUES (1, 'foo');
INSERT INTO test3 (id, name) VALUES (2, 'bar');
--rollback TRUNCATE TABLE test3;
