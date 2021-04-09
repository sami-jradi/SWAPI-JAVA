# SWAPI-JAVA

The goal of this exercise is to develop a microservice to manage information consumed from a third-party API.

**AS A** Star Wars fan  
**I WANT** to see the information about PEOPLE and STARSHIPS being able to sort the information and search by too  
**SO THAT I** can have fun searching about Star Wars information.

##### Acceptance Criteria

 - The microservice must read data from SWAPI (https://swapi.dev/).
 - The microservice should implement and expose endpoints that return the information as
   follows:
     - Information about the Starships used by a Character, given the character's name.
     - List of inhabitants' names of a given Planet, given the planet's name.
 - The response from the endpoints should be in JSON format
  both cases**.
 - Provides a Dockerfile to be able to deploy the application as a Docker container on port 6969
 
 #### Requirements before using
 
 - JDK 1.8
 - Gradle
 - run `gradle clean build`
 
 #### How to use
 
 After building the application and running, click on the following links to test the endpoints:
 
 - To get Starships used by a character (ex. Luke Skywalker): http://localhost:8080/starship/luke
 - To get list of inhabitants of a planet (ex. Tatooine): http://localhost:8080/inhabitants/Tatooine
 
 #### Building a Docker image
 
 -To build a docker image from the Dockerfile, please run this command is the directory of the project:
 run `docker-compose build`
 
 -To run an instance of the image (container):
 run `docker-compose build`
 
 note: The docker container runs on port `6969`.
