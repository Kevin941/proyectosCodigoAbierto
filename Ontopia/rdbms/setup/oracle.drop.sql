

drop index CLOB_TM_OCCURRENCE;
drop index CLOB_TM_VARIANT_NAME;
drop function tm_clob_value;


/* 
alter table TM_VARIANT_NAME_SCOPE drop constraint FK_TM_VARIANT_NAME_SCOPE_1;
alter table TM_VARIANT_NAME_SCOPE drop constraint FK_TM_VARIANT_NAME_SCOPE_2;
alter table TM_TOPIC_NAME_SCOPE drop constraint FK_TM_TOPIC_NAME_SCOPE_1;
alter table TM_TOPIC_NAME_SCOPE drop constraint FK_TM_TOPIC_NAME_SCOPE_2;
alter table TM_VARIANT_NAME drop constraint FK_TM_VARIANT_NAME_1;
alter table TM_VARIANT_NAME drop constraint FK_TM_VARIANT_NAME_2;
alter table TM_VARIANT_NAME drop constraint FK_TM_VARIANT_NAME_3;
alter table TM_OCCURRENCE_SCOPE drop constraint FK_TM_OCCURRENCE_SCOPE_1;
alter table TM_OCCURRENCE_SCOPE drop constraint FK_TM_OCCURRENCE_SCOPE_2;
alter table TM_ASSOCIATION_SCOPE drop constraint FK_TM_ASSOCIATION_SCOPE_1;
alter table TM_ASSOCIATION_SCOPE drop constraint FK_TM_ASSOCIATION_SCOPE_2;
alter table TM_TOPIC_NAME drop constraint FK_TM_TOPIC_NAME_1;
alter table TM_TOPIC_NAME drop constraint FK_TM_TOPIC_NAME_2;
alter table TM_TOPIC_NAME drop constraint FK_TM_TOPIC_NAME_3;
alter table TM_TOPIC_NAME drop constraint FK_TM_TOPIC_NAME_4;
alter table TM_ASSOCIATION_ROLE drop constraint FK_TM_ASSOCIATION_ROLE_1;
alter table TM_ASSOCIATION_ROLE drop constraint FK_TM_ASSOCIATION_ROLE_2;
alter table TM_ASSOCIATION_ROLE drop constraint FK_TM_ASSOCIATION_ROLE_3;
alter table TM_ASSOCIATION_ROLE drop constraint FK_TM_ASSOCIATION_ROLE_4;
alter table TM_ASSOCIATION_ROLE drop constraint FK_TM_ASSOCIATION_ROLE_5;
alter table TM_SUBJECT_IDENTIFIERS drop constraint FK_TM_SUBJECT_IDENTIFIERS_1;
alter table TM_SUBJECT_LOCATORS drop constraint FK_TM_SUBJECT_LOCATORS_1;
alter table TM_ASSOCIATION drop constraint FK_TM_ASSOCIATION_1;
alter table TM_ASSOCIATION drop constraint FK_TM_ASSOCIATION_2;
alter table TM_ASSOCIATION drop constraint FK_TM_ASSOCIATION_3;
alter table TM_TOPIC_MAP drop constraint FK_TM_TOPIC_MAP_1;
alter table TM_ITEM_IDENTIFIERS drop constraint FK_TM_ITEM_IDENTIFIERS_1;
alter table TM_OCCURRENCE drop constraint FK_TM_OCCURRENCE_1;
alter table TM_OCCURRENCE drop constraint FK_TM_OCCURRENCE_2;
alter table TM_OCCURRENCE drop constraint FK_TM_OCCURRENCE_3;
alter table TM_OCCURRENCE drop constraint FK_TM_OCCURRENCE_4;
alter table TM_TOPIC_TYPES drop constraint FK_TM_TOPIC_TYPES_1;
alter table TM_TOPIC_TYPES drop constraint FK_TM_TOPIC_TYPES_2;
alter table TM_TOPIC drop constraint FK_TM_TOPIC_1;
*/
drop table TM_VARIANT_NAME_SCOPE cascade constraints;
drop table TM_TOPIC_NAME_SCOPE cascade constraints;
drop table TM_VARIANT_NAME cascade constraints;
drop table TM_OCCURRENCE_SCOPE cascade constraints;
drop table TM_ASSOCIATION_SCOPE cascade constraints;
drop table TM_TOPIC_NAME cascade constraints;
drop table TM_ASSOCIATION_ROLE cascade constraints;
drop table TM_SUBJECT_IDENTIFIERS cascade constraints;
drop table TM_SUBJECT_LOCATORS cascade constraints;
drop table TM_ASSOCIATION cascade constraints;
drop table TM_ADMIN_SEQUENCE cascade constraints;
drop table TM_TOPIC_MAP cascade constraints;
drop table TM_ITEM_IDENTIFIERS cascade constraints;
drop table TM_OCCURRENCE cascade constraints;
drop table TM_TOPIC_TYPES cascade constraints;
drop table TM_TOPIC cascade constraints;
