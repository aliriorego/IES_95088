# Lab1_2
___

Copiei as classes que o professor disponibilizou para implementar  uma base da app WeatherForecast

`mvn package` tem que estar na pasta weather(onde está o POM)

Testar a partir daqui

Para correr a app o comando do guião teve que ser alterado para: 

```
mvn clean package exec:java -D"exec.mainClass"="ies.app.WeatherStarter"`
```