FROM tomcat:latest

RUN cp -R /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps/

EXPOSE 8080
RUN catalina.sh run
CMD ["java -jar", "-Dspring.profiles.active=dev", "userService-0.0.1-SNAPSHOT.war"]