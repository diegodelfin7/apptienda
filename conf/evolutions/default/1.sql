# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table categoria (
  id                        integer auto_increment not null,
  nombre                    varchar(100),
  categoria_id              integer,
  constraint pk_categoria primary key (id))
;

create table cliente (
  id                        integer auto_increment not null,
  nombre                    varchar(30),
  paterno                   varchar(20),
  materno                   varchar(20),
  dni                       char(8),
  ruc                       char(11),
  cuenta_id                 integer,
  constraint pk_cliente primary key (id))
;

create table cuenta (
  id                        integer auto_increment not null,
  usuario                   varchar(30),
  clave                     varchar(30),
  activo                    int default 1,
  rol                       varchar(20),
  constraint pk_cuenta primary key (id))
;

create table producto (
  id                        integer auto_increment not null,
  modelo                    varchar(100),
  color                     varchar(20),
  marca                     varchar(40),
  precio                    Decimal(8,2),
  descuento                 integer,
  caracteristicas           TEXT,
  especificaciones          TEXT,
  image                     varchar(50),
  categoria_id              integer,
  constraint pk_producto primary key (id))
;

alter table categoria add constraint fk_categoria_sobrecategoria_1 foreign key (categoria_id) references categoria (id) on delete restrict on update restrict;
create index ix_categoria_sobrecategoria_1 on categoria (categoria_id);
alter table cliente add constraint fk_cliente_cuenta_2 foreign key (cuenta_id) references cuenta (id) on delete restrict on update restrict;
create index ix_cliente_cuenta_2 on cliente (cuenta_id);
alter table producto add constraint fk_producto_categoria_3 foreign key (categoria_id) references categoria (id) on delete restrict on update restrict;
create index ix_producto_categoria_3 on producto (categoria_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table categoria;

drop table cliente;

drop table cuenta;

drop table producto;

SET FOREIGN_KEY_CHECKS=1;

