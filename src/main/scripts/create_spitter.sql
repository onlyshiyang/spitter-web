
create TABLE spitter(
  id			INT(3)		NOT NULL,
  usename   	varchar(10)	NOT NULL,
  password		varchar(20) NOT NULL,
  fullname		varchar(30),
  email			varchar(30),
  updatebyemail	BOOL,
  PRIMARY KEY (id)
  );