FROM registry.access.redhat.com/ubi9/openjdk-11:1.20


USER root



ADD ./target/*.jar /opt/csmt-biz-bureau-operation-2511-1.0.0.jar

CMD ["java", "-Xmx200m", "-jar", "/opt/csmt-biz-bureau-operation-2511-1.0.0.jar"]

EXPOSE 8080

