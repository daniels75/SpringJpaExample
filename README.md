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
http://localhost:8080/SpringJpaExample/data/shopByName?name=test1
http://localhost:8080/SpringJpaExample/data/shopByName?name=test2
http://localhost:8080/SpringJpaExample/data/allEmployees

// join table
http://localhost:8080/SpringJpaExample/data/shopByEmployee?name=test1
http://localhost:8080/SpringJpaExample/data/shopByEmployee?name=Daniels

select s.* from shops s, employee e
where s.emplNumber = e.id
and e.name = "Daniels"