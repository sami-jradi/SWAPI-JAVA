FROM adoptopenjdk/openjdk8:debian-slim
RUN mkdir app
RUN ["chmod", "+rwx", "/app"]
WORKDIR /app
COPY --chown=0:0 build/libs/swapi-0.0.1-SNAPSHOT.jar /app/
EXPOSE 6969
RUN java -version
CMD java -jar swapi-0.0.1-SNAPSHOT.jar