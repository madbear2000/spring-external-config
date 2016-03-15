[![Build Status](https://travis-ci.org/madbear2000/spring-external-config.svg)](https://travis-ci.org/madbear2000/spring-external-config)

# spring-external-config
Testing out Springs @ConfigurationProperties with spring-boot

## To Run
Default enviroment:  
`mvn spring-boot:run`

Production enviroment:  
`mvn spring-boot:run -Dspring.profiles.active=prod`

Development enviroment:   
`mvn spring-boot:run -Dspring.profiles.active=dev`
