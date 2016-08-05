DROP TABLE IF EXISTS MOVIE;
CREATE TABLE MOVIE (
	id Long not null auto_increment, primary key(id),
	name varchar(255),
	description varchar(600),
	director varchar(255),
	release_date Integer,
	leading_actor varchar(255),
	genre varchar(255),
	image_url varchar(600)	
);