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

___

na alínea b) segui o artigo que está no guião para criar uma nova app (gs-serving-web-content-main)

- download do zip que já traz as dependências necessárias: thymeleaf, spring web e boot devtools

- Criei o controller que estava lá
- Criei o greeting.html
- Criei a home page(index.html)

- modifiquei o application.properties para alterar a porta para 8081

- correr o `mvn package`
- correr `java -jar target/serving-web-content-initial-0.0.1-SNAPSHOT.jar`

- entrar no endereço `http://localhost:8081/` e aparece a página em branco com a mensagem "Hello, World!"
