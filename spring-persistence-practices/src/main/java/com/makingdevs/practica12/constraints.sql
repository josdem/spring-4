--liquibase formatted sql
 
--changeset makingdevs:11
ALTER TABLE TASK ADD CONSTRAINT FK36358592F91B26 FOREIGN KEY(USER_STORY_ID) REFERENCES USER_STORY(ID);            
ALTER TABLE USER_STORY ADD CONSTRAINT FK73530381A3DAE07D FOREIGN KEY(PROJECT_ID) REFERENCES PROJECT(ID);          
ALTER TABLE PROJECT_USER ADD CONSTRAINT FK3801613172CB6170 FOREIGN KEY(PROJECT_PARTICIPANTS_ID) REFERENCES PROJECT(ID);           
ALTER TABLE TASK_USER ADD CONSTRAINT FKAC91A45EEA62E62 FOREIGN KEY(TASK_PARTICIPANTS_ID) REFERENCES TASK(ID);     
ALTER TABLE TASK_USER ADD CONSTRAINT FKAC91A4517211B57 FOREIGN KEY(USER_ID) REFERENCES USER(ID);  
ALTER TABLE PROJECT_USER ADD CONSTRAINT FK3801613117211B57 FOREIGN KEY(USER_ID) REFERENCES USER(ID);