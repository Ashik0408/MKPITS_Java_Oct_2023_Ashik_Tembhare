CREATE TABLE `bank_database`.`user_details` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `full_name` VARCHAR(45) NOT NULL,
  `user_email` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(6) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `mobile_number` VARCHAR(10) NOT NULL,
  `created_by` INT ,
  `created_at` DATETIME ,
  `updated_by` INT ,
  `updated_at` DATETIME ,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_email_UNIQUE` (`user_email` ASC));
