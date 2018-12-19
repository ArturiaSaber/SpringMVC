CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `jobs` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`customer` (`id`, `userName`, `jobs`, `phone`) VALUES ('1', '客户1', 'IT', '12312312312');
INSERT INTO `test`.`customer` (`id`, `userName`, `jobs`, `phone`) VALUES ('2', '客户2', 'doctor', 'phone2');
