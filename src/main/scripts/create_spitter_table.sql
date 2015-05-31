CREATE TABLE `spitter_web`.`spitter` (
  `id` INT(3) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `fullname` VARCHAR(80) NULL,
  `email` VARCHAR(45) NULL,
  `updatebyemail` TINYINT(1) NULL,
  PRIMARY KEY (`id`));

