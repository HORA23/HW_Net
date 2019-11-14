- auto-generated definition
create table MY_POST
(
    POST_ID NUMBER not null,
    TITLE   VARCHAR2(255),
    TEXT    VARCHAR2(255)
)
/

create unique index MY_POST_POST_ID_UINDEX
    on MY_POST (POST_ID)
/

alter table MY_POST
    add constraint MY_POST_PK
        primary key (POST_ID)
/


-- auto-generated definition
create table COMMENTS
(
    COM_ID    NUMBER not null,
    POST_ID   NUMBER not null,
    TEXT      VARCHAR2(255),
    USER_NAME VARCHAR2(255)
)
/

create unique index COMMENTS_COM_ID_UINDEX
    on COMMENTS (COM_ID)
/

alter table COMMENTS
    add constraint COMMENTS_PK
        primary key (COM_ID)
/
