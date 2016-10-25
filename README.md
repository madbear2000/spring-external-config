[![Build Status](https://travis-ci.org/madbear2000/spring-external-config.svg)](https://travis-ci.org/madbear2000/spring-external-config)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/5ffac6964c524c749c5e978d3d4cca2b)](https://www.codacy.com/app/aj-dragon/spring-external-config?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=madbear2000/spring-external-config&amp;utm_campaign=Badge_Grade)
[![codebeat badge](https://codebeat.co/badges/158adba8-8660-487c-b387-d764693357ad)](https://codebeat.co/projects/github-com-madbear2000-spring-external-config)

# spring-external-config
Testing out Springs @ConfigurationProperties with spring-boot

## To Run
Default enviroment:  
`mvn spring-boot:run`

Production enviroment:  
`mvn spring-boot:run -Dspring.profiles.active=prod`

Development enviroment:   
`mvn spring-boot:run -Dspring.profiles.active=dev`
