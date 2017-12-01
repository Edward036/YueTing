# Extend spring boot image
FROM ibmjava:8
RUN mkdir /var/app
WORKDIR /var/app/
ADD ./build/libs /var/app/libs
EXPOSE 8083
CMD ["java","-jar","libs/app-0.0.1-SNAPSHOT-shadow.jar"]
#CMD ["java","-cp","libs/YueTing-0.0.1-SNAPSHOT.jar", "com.keyi.yueting.YuetingApplication"]

#FROM java:openjdk-8-alpine
#VOLUME /tmp
#ADD YueTing-0.0.1-SNAPSHOT.jar app.jar
#RUN sh -c 'touch /app.jar'
##ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]