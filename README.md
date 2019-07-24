# SpringBoot-microservices
Microservices running on Eureka Server-Client

The three microservices running on a Eureka server

1. CourseInfoService - contains details about the available courses
2. CourseRatingService - contains users in the system and their corresponding rating for the courses available
3. CoureCatalogService - contains a CatalogResourse that consumes the data of CourseRating and 
                        CourseInfo Services to give a combined catalog of courses to rating by users
                        
                   
