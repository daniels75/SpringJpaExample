Example of Spring Data JPA application (Hibernate used as implementation of JPA).
http://www.javacodegeeks.com/2013/05/spring-jpa-data-hibernate-mysql-maven.html

Script:

CREATE TABLE `shops` (`id` int(6) NOT NULL AUTO_INCREMENT,
	  `name` varchar(60) NOT NULL,
  `emplNumber` int(6) NOT NULL,
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
	
CREATE TABLE `employee` (`id` int(6) NOT NULL AUTO_INCREMENT,
	  `name` varchar(60) NOT NULL,
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
	
http://localhost:8080/SpringJpaExample/


REST
http://localhost:8080/SpringJpaExample/data/findAll
http://localhost:8080/SpringJpaExample/data/allShops
http://localhost:8080/SpringJpaExample/data/shopByName?name=test
http://localhost:8080/SpringJpaExample/data/allEmployees