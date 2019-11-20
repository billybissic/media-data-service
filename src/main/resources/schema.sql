DROP TABLE IF EXISTS `caption_types`;
CREATE TABLE `caption_types` (
  `caption_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `caption_type_name` varchar(255) DEFAULT NULL,
  `caption_type_description` varchar(255) DEFAULT NULL,
  `mime_type_group_id` int(11) DEFAULT NULL, 
  PRIMARY KEY (`caption_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `mime_type_groups`;
CREATE TABLE `mime_type_groups` (
  `mime_type_group_id` int(11) NOT NULL AUTO_INCREMENT,
  `mime_type_group_name` varchar(255) DEFAULT NULL,
  `mime_type_group_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mime_type_group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `mime_types`;
CREATE TABLE `mime_types` (
  `mime_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `mime_type_name` varchar(255) DEFAULT NULL,
  `mime_type_template` varchar(255) DEFAULT NULL,
  `mime_type_description` varchar(255) DEFAULT NULL,
  `mime_type_group_id` int(11) DEFAULT NULL,  
  PRIMARY KEY (`mime_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

