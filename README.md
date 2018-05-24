# Favourite Movies Library
Spring Boot application based on external RESTful API with management of a custom
movie library. The application consists of:
- Movie search
- CRUD operations, excluding update (not used in the project)

## API info:
- The OMDb API is a RESTful web service to obtain movie 
information, all content and images on the site are 
contributed and maintained by our users. 
- URL address: http://www.omdbapi.com/
- The version in use is limited to 1000 data requests per day


## Made with:
- JDK 8 SE
- Spring Boot v. 1.5.8
- MySQL 5.7.21 Community Edition

## Usage:
1. Import the Maven project to your Java IDE,
2. Create a database named "omdb",
3. Run the project,
4. Open the browser of your choice, pointing to the address: 
http://localhost:8080/
5. If necessary, change the "8080" part 
of the address to the one matching the port Tomcat starts on
(check the IDE console for more info).