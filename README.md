# Media Data Service
Media Data Service provides access to meta data for the media used throughout system. It offers a solution to allow CRUD actions to the data offered through this service.

## Pre-Build Tasks
##### Configurations
MediaData.java

In the MediaData class you will find the WebMvcConfigurer. You will need to modify by adding the urls that you would like to have access to the media data service. If you need to specify a port appended it to the url. 

Ex.
```
@Bean
public WebMvcConfigurer corsConfigurer() {
  return new WebMvcConfigurerAdapter() {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/SharedStaticDataServices/**").allowedOrigins(
            "http://someURLsGoHere",
            "http://someOtherUrlGoesHere:80"
        );
    }
  };
}  
```

*This will be moved to the application properties soon. From there you will be able to update a single file for configurations.*

## Build
##### Maven
To build with Maven, simply run maven's package command:

```
mvn package
```

## Installation
Once the package is successful built you should find the war file in the target directory. Install into your tomcat or jetty server.

```
total 49408
drwxr-xr-x 1 197121        0 Nov 20 23:36 maven-status/
drwxr-xr-x 1 197121        0 Nov 20 23:36 generated-sources/
drwxr-xr-x 1 197121        0 Nov 20 23:36 classes/
drwxr-xr-x 1 197121        0 Nov 20 23:36 mediadata-service/
drwxr-xr-x 1 197121        0 Nov 20 23:36 maven-archiver/
-rw-r--r-- 1 197121 28407030 Nov 20 23:36 mediadata-service.war
```
