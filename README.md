# Favourite Movies Library
Spring Boot application based on external RESTful API with management of a custom
movie library. The application consists of:
- Movie search,
- CRUD operations, excluding update (not used in the project).

## API info:
- The OMDb API is a RESTful web service togit  obtain movie
information, all content and images on the site are 
contributed and maintained by our users. 
- URL address: http://www.omdbapi.com/,
- The version in use is limited to 1000 data requests per day.


## Made with:
- JDK 8 SE,
- Spring Boot v. 1.5.8,
- MySQL DB v. 5.7.21 Community Edition,
- Maven v. 4.0.0,
- Thymeleaf v. 2.0.1,
- HTML 5,
- Bootstrap 4.0,
- JPA v. 1.5.8,
- Jackson v. 2.6.3,
- JUnit v. 4.12,
- Mockito.


## Usage:
1. Import the Maven project to your Java IDE,
2. Create a database named "omdb",
3. Update the database admin credentials in "src\main\resources\application.properties" file,
4. Run the project,
5. Open the browser of your choice, pointing to the address:
http://localhost:8080/,
6. If necessary, change the "8080" part
of the address to the one matching the port Tomcat starts on
(check the IDE console for more info).