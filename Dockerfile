FROM tomcat:9.0
EXPOSE 8080
RUN rm -rf /usr/local/tomcat/webapps/*
COPY demo-0.0.1-SNAPSHOT-plain.war  /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]