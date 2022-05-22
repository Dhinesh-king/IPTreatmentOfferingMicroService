FROM openjdk:8
EXPOSE 8081
ADD target/IPTreatmentOfferingService.jar IPTreatmentOfferingService.jar
ENTRYPOINT ["java","-jar","/IPTreatmentOfferingService.jar"]