FROM tomcat:latest
ADD target/app.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]
