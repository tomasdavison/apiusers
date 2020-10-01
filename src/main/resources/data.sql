CREATE TABLE IF NOT EXISTS `loans`(
  `id` int(11) NOT NULL,
  `total` decimal(19,2) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO loans VALUES (1, 150.00, 1);
INSERT INTO loans VALUES (2, 100.00, 1);
INSERT INTO loans VALUES (3, 250.00, 1);
INSERT INTO loans VALUES (4, 170.00, 1);
INSERT INTO loans VALUES (5, 210.00, 1);
INSERT INTO loans VALUES (6, 3900.00, 2);
INSERT INTO loans VALUES (7, 110.00, 2);
INSERT INTO loans VALUES (8, 50.00, 2);
INSERT INTO loans VALUES (9, 70.00, 2);
INSERT INTO loans VALUES (10, 90.00, 2);

INSERT INTO users VALUES (1, 'test1@email.com', 'Tomás', 'Davison');
INSERT INTO users VALUES (2, 'test2@email.com', 'Daniel', 'Pérez');
INSERT INTO users VALUES (3, 'test3@email.com', 'Leandro', 'González');
INSERT INTO users VALUES (4, 'test4@email.com', 'Nicolás', 'Giménez');
INSERT INTO users VALUES (5, 'test5@email.com', 'Ignacio', 'Suárez');
INSERT INTO users VALUES (6, 'test6@email.com', 'Juan', 'Fernández');
