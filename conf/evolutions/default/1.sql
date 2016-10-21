# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table coupon (
  used                      boolean)
;

create table item (
  name                      varchar(255),
  value                     double)
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists coupon;

drop table if exists item;

SET REFERENTIAL_INTEGRITY TRUE;

