# Lab2_3
___

- na alínea a), usei o Spring initializr com as seguintes configurações:
      - Project: Maven
      - Language: Java
      - Spring Boot: 2.7.16
      - Dependencies: Spring web
      - Project Metadata:
            - Group:          ies
            - Artifact:       spring.demo
            - Name:           SpringDemo
            - Description:    Demo Project for spring boot
            - Package name:   ies.spring.demo
            - Packaging:      jar
            - Java:           21

- dentro da pasta spring.demo corre-se o mvn package para criar o target
- depois `mvn install -DskipTests`
- depois `java -jar target\spring.demo-0.0.1-SNAPSHOT.jar`

- a app corre e no endereço `http://localhost:8080/` aparece o white label error como esperado
