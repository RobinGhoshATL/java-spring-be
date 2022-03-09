# java-spring-be (Boot Framework Release used is 2.4.5)
This is a standard spring java back-end project that can be deployed straight to an existing Azure App Service.
When you create the app service it is important you create with Java 1.8 as the framework and choose server = Embedded or Tomcat x

To compile
$mvn compile

To run the code
$mvn spring-boot:run 

To test the code
http://localhost:8080/swagger-ui.html

To setup the maven plugin into your pom.xml
$mvn azure-config

To deploy to Azure
$mvn package azure-webapp:deploy

To test if your code is working on Azure use and try out the methods from Swagger test

https://{your app name}.azure.websistes.net/swagger-ui.html


