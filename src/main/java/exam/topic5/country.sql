
START TRANSACTION;

CREATE TABLE `city` (
  `id` int(11) NOT NULL,
  `country` varchar(2) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `city`
  ADD PRIMARY KEY (`id`),
  ADD KEY `index_lat` (`latitude`),
  ADD KEY `index_lng` (`longitude`);

COMMIT;
