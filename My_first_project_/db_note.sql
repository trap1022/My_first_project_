create table member(
	userid varchar(20) not null,
	userpass varchar(40) not null,
	userbirth date,
	constraint pk_member_userId primary key(userid)
);
desc member;

insert into member values('user2','user2','1998-10-23');