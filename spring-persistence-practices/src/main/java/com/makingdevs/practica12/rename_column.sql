--liquibase formatted sql
 
--changeset makingdevs:12
alter table PROJECT add column FULL_DESCRIPTION varchar(255);
 
--changeset makingdevs:13
update PROJECT set FULL_DESCRIPTION=DESCRIPTION where id=id and 1=1;
 
--changeset makingdevs:14
alter table PROJECT drop column DESCRIPTION;