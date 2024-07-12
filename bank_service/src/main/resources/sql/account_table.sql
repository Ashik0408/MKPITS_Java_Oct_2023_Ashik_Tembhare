CREATE TABLE `bank_database`.`accounts` (
  `acc_id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `acc_type` VARCHAR(45) NOT NULL,
  `balance` VARCHAR(45) NOT NULL,
  `created_by` INT NULL,
  `created_at` DATETIME NULL,
  `updated_by` INT NULL,
  `updated_at` DATETIME NULL,
  PRIMARY KEY (`acc_id`),
  INDEX `id_idx` (`user_id` ASC),
  CONSTRAINT `id`
    FOREIGN KEY (`user_id`)
    REFERENCES `bank_database`.`user_details` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);