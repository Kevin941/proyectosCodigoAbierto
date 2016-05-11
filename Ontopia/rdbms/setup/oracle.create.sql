create table TM_VARIANT_NAME_SCOPE (
  scoped_id  integer not null,
  theme_id  integer not null,
  constraint TM_VARIANT_NAME_SCOPE_pkey primary key (scoped_id, theme_id)
);

create table TM_TOPIC_NAME_SCOPE (
  scoped_id  integer not null,
  theme_id  integer not null,
  constraint TM_TOPIC_NAME_SCOPE_pkey primary key (scoped_id, theme_id)
);

create table TM_VARIANT_NAME (
  id  integer not null,
  name_id  integer not null,
  topicmap_id  integer not null,
  reifier_id  integer,
  datatype_address  varchar2(512),
  length  integer,
  hashcode  integer,
  content  clob,
  constraint TM_VARIANT_NAME_pkey primary key (id)
);

create table TM_OCCURRENCE_SCOPE (
  scoped_id  integer not null,
  theme_id  integer not null,
  constraint TM_OCCURRENCE_SCOPE_pkey primary key (scoped_id, theme_id)
);

create table TM_ASSOCIATION_SCOPE (
  scoped_id  integer not null,
  theme_id  integer not null,
  constraint TM_ASSOCIATION_SCOPE_pkey primary key (scoped_id, theme_id)
);

create table TM_TOPIC_NAME (
  id  integer not null,
  topic_id  integer not null,
  topicmap_id  integer not null,
  reifier_id  integer,
  type_id  integer not null,
  content  varchar2(4000),
  constraint TM_TOPIC_NAME_pkey primary key (id)
);

create table TM_ASSOCIATION_ROLE (
  id  integer not null,
  assoc_id  integer not null,
  topicmap_id  integer not null,
  reifier_id  integer,
  type_id  integer,
  player_id  integer,
  constraint TM_ASSOCIATION_ROLE_pkey primary key (id)
);

create table TM_SUBJECT_IDENTIFIERS (
  topic_id  integer not null,
  address  varchar2(512) not null
);

create table TM_SUBJECT_LOCATORS (
  topic_id  integer not null,
  address  varchar2(512) not null
);

create table TM_ASSOCIATION (
  id  integer not null,
  topicmap_id  integer not null,
  reifier_id  integer,
  type_id  integer,
  constraint TM_ASSOCIATION_pkey primary key (id)
);

create table TM_ADMIN_SEQUENCE (
  seq_name  varchar2(32) not null,
  seq_count  integer not null,
  constraint TM_ADMIN_SEQUENCE_pkey primary key (seq_name)
);

create table TM_TOPIC_MAP (
  id  integer not null,
  reifier_id  integer,
  title  varchar2(128),
  base_address  varchar2(512),
  comments  varchar2(4000),
  constraint TM_TOPIC_MAP_pkey primary key (id)
);

create table TM_ITEM_IDENTIFIERS (
  class  varchar2(1) not null,
  tmobject_id  integer not null,
  topicmap_id  integer not null,
  address  varchar2(512) not null
);

create table TM_OCCURRENCE (
  id  integer not null,
  topic_id  integer not null,
  topicmap_id  integer not null,
  reifier_id  integer,
  type_id  integer,
  datatype_address  varchar2(512),
  length  integer,
  hashcode  integer,
  content  clob,
  constraint TM_OCCURRENCE_pkey primary key (id)
);

create table TM_TOPIC_TYPES (
  topic_id  integer not null,
  type_id  integer not null,
  constraint TM_TOPIC_TYPES_pkey primary key (topic_id, type_id)
);

create table TM_TOPIC (
  id  integer not null,
  topicmap_id  integer not null,
  reified_id  varchar2(32),
  constraint TM_TOPIC_pkey primary key (id)
);


/* 
alter table TM_VARIANT_NAME_SCOPE add constraint FK_TM_VARIANT_NAME_SCOPE_1 foreign key (scoped_id) references TM_VARIANT_NAME (id) deferrable initially deferred;
alter table TM_VARIANT_NAME_SCOPE add constraint FK_TM_VARIANT_NAME_SCOPE_2 foreign key (theme_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_TOPIC_NAME_SCOPE add constraint FK_TM_TOPIC_NAME_SCOPE_1 foreign key (scoped_id) references TM_TOPIC_NAME (id) deferrable initially deferred;
alter table TM_TOPIC_NAME_SCOPE add constraint FK_TM_TOPIC_NAME_SCOPE_2 foreign key (theme_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_VARIANT_NAME add constraint FK_TM_VARIANT_NAME_1 foreign key (name_id) references TM_TOPIC_NAME (id) deferrable initially deferred;
alter table TM_VARIANT_NAME add constraint FK_TM_VARIANT_NAME_2 foreign key (topicmap_id) references TM_TOPIC_MAP (id) deferrable initially deferred;
alter table TM_VARIANT_NAME add constraint FK_TM_VARIANT_NAME_3 foreign key (reifier_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_OCCURRENCE_SCOPE add constraint FK_TM_OCCURRENCE_SCOPE_1 foreign key (scoped_id) references TM_OCCURRENCE (id) deferrable initially deferred;
alter table TM_OCCURRENCE_SCOPE add constraint FK_TM_OCCURRENCE_SCOPE_2 foreign key (theme_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_ASSOCIATION_SCOPE add constraint FK_TM_ASSOCIATION_SCOPE_1 foreign key (scoped_id) references TM_ASSOCIATION (id) deferrable initially deferred;
alter table TM_ASSOCIATION_SCOPE add constraint FK_TM_ASSOCIATION_SCOPE_2 foreign key (theme_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_TOPIC_NAME add constraint FK_TM_TOPIC_NAME_1 foreign key (topic_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_TOPIC_NAME add constraint FK_TM_TOPIC_NAME_2 foreign key (topicmap_id) references TM_TOPIC_MAP (id) deferrable initially deferred;
alter table TM_TOPIC_NAME add constraint FK_TM_TOPIC_NAME_3 foreign key (reifier_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_TOPIC_NAME add constraint FK_TM_TOPIC_NAME_4 foreign key (type_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_ASSOCIATION_ROLE add constraint FK_TM_ASSOCIATION_ROLE_1 foreign key (assoc_id) references TM_ASSOCIATION (id) deferrable initially deferred;
alter table TM_ASSOCIATION_ROLE add constraint FK_TM_ASSOCIATION_ROLE_2 foreign key (topicmap_id) references TM_TOPIC_MAP (id) deferrable initially deferred;
alter table TM_ASSOCIATION_ROLE add constraint FK_TM_ASSOCIATION_ROLE_3 foreign key (reifier_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_ASSOCIATION_ROLE add constraint FK_TM_ASSOCIATION_ROLE_4 foreign key (type_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_ASSOCIATION_ROLE add constraint FK_TM_ASSOCIATION_ROLE_5 foreign key (player_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_SUBJECT_IDENTIFIERS add constraint FK_TM_SUBJECT_IDENTIFIERS_1 foreign key (topic_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_SUBJECT_LOCATORS add constraint FK_TM_SUBJECT_LOCATORS_1 foreign key (topic_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_ASSOCIATION add constraint FK_TM_ASSOCIATION_1 foreign key (topicmap_id) references TM_TOPIC_MAP (id) deferrable initially deferred;
alter table TM_ASSOCIATION add constraint FK_TM_ASSOCIATION_2 foreign key (reifier_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_ASSOCIATION add constraint FK_TM_ASSOCIATION_3 foreign key (type_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_TOPIC_MAP add constraint FK_TM_TOPIC_MAP_1 foreign key (reifier_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_ITEM_IDENTIFIERS add constraint FK_TM_ITEM_IDENTIFIERS_1 foreign key (topicmap_id) references TM_TOPIC_MAP (id) deferrable initially deferred;
alter table TM_OCCURRENCE add constraint FK_TM_OCCURRENCE_1 foreign key (topic_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_OCCURRENCE add constraint FK_TM_OCCURRENCE_2 foreign key (topicmap_id) references TM_TOPIC_MAP (id) deferrable initially deferred;
alter table TM_OCCURRENCE add constraint FK_TM_OCCURRENCE_3 foreign key (reifier_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_OCCURRENCE add constraint FK_TM_OCCURRENCE_4 foreign key (type_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_TOPIC_TYPES add constraint FK_TM_TOPIC_TYPES_1 foreign key (topic_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_TOPIC_TYPES add constraint FK_TM_TOPIC_TYPES_2 foreign key (type_id) references TM_TOPIC (id) deferrable initially deferred;
alter table TM_TOPIC add constraint FK_TM_TOPIC_1 foreign key (topicmap_id) references TM_TOPIC_MAP (id) deferrable initially deferred;
*/

create index TM_VARIANT_NAME_SCOPE_IX_hs on TM_VARIANT_NAME_SCOPE(theme_id, scoped_id);
create index TM_TOPIC_NAME_SCOPE_IX_hs on TM_TOPIC_NAME_SCOPE(theme_id, scoped_id);
create index TM_VARIANT_NAME_IX_o on TM_VARIANT_NAME(name_id);
create index TM_VARIANT_NAME_IX_mhi on TM_VARIANT_NAME(topicmap_id, hashcode, id);
create index TM_OCCURRENCE_SCOPE_IX_hs on TM_OCCURRENCE_SCOPE(theme_id, scoped_id);
create index TM_ASSOCIATION_SCOPE_IX_hs on TM_ASSOCIATION_SCOPE(theme_id, scoped_id);
create index TM_TOPIC_NAME_IX_o on TM_TOPIC_NAME(topic_id);
create index TM_TOPIC_NAME_IX_myi on TM_TOPIC_NAME(topicmap_id, type_id, id);
create index TM_TOPIC_NAME_IX_mvi on TM_TOPIC_NAME(topicmap_id, content, id);
create index TM_ASSOCIATION_ROLE_IX_o on TM_ASSOCIATION_ROLE(assoc_id);
create index TM_ASSOCIATION_ROLE_IX_io on TM_ASSOCIATION_ROLE(id, assoc_id);
create index TM_ASSOCIATION_ROLE_IX_t on TM_ASSOCIATION_ROLE(player_id);
create index TM_ASSOCIATION_ROLE_IX_it on TM_ASSOCIATION_ROLE(id, player_id);
create index TM_ASSOCIATION_ROLE_IX_myi on TM_ASSOCIATION_ROLE(topicmap_id, type_id, id);
create index TM_ASSOCIATION_ROLE_IX_mtyio on TM_ASSOCIATION_ROLE(topicmap_id, player_id, type_id, id, assoc_id);
create index TM_SUBJECT_IDENTIFIERS_IX_oa on TM_SUBJECT_IDENTIFIERS(topic_id, address);
create index TM_SUBJECT_IDENTIFIERS_IX_am on TM_SUBJECT_IDENTIFIERS(address, topic_id);
create index TM_SUBJECT_LOCATORS_IX_oa on TM_SUBJECT_LOCATORS(topic_id, address);
create index TM_SUBJECT_LOCATORS_IX_am on TM_SUBJECT_LOCATORS(address, topic_id);
create index TM_ASSOCIATION_IX_myi on TM_ASSOCIATION(topicmap_id, type_id, id);
create index TM_TOPIC_MAP_IX_ai on TM_TOPIC_MAP(base_address, id);
create index TM_ITEM_IDENTIFIERS_IX_o on TM_ITEM_IDENTIFIERS(tmobject_id);
create index TM_ITEM_IDENTIFIERS_IX_maco on TM_ITEM_IDENTIFIERS(topicmap_id, address, class, tmobject_id);
create index TM_OCCURRENCE_IX_o on TM_OCCURRENCE(topic_id);
create index TM_OCCURRENCE_IX_myi on TM_OCCURRENCE(topicmap_id, type_id, id);
create index TM_OCCURRENCE_IX_mhi on TM_OCCURRENCE(topicmap_id, hashcode, id);
create index TM_TOPIC_TYPES_IX_yt on TM_TOPIC_TYPES(type_id, topic_id);
create index TM_TOPIC_IX_im on TM_TOPIC(id, topicmap_id);

insert into TM_ADMIN_SEQUENCE values ('<GLOBAL>', 0);

create or replace function tm_clob_value(val clob)
return varchar2 deterministic as
retval varchar2(4000);
begin
retval := dbms_lob.substr(val, 4000, 1);
return retval;
end;
/
create index CLOB_TM_OCCURRENCE on TM_OCCURRENCE(tm_clob_value(content));
create index CLOB_TM_VARIANT_NAME on TM_VARIANT_NAME(tm_clob_value(content));

