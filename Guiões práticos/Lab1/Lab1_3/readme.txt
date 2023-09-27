LAB 1_3

ATENÇÃO!
Não guardei aqui o projeto e acabei por atualizar o projeto que está dentro do Lab1_2 com os logs.


Para sincronziar a pasta local com o repositório usei a extensão Source Control do Visual Studio Code porque já estou habituado a usar dessa forma
Criei a estrutura de pastas e liguei o local com o repositório com os comandos

git init

git remote add origin https://github.com/aliriorego/IES_95088.git

A partir daqui, com a extensã Source Control, ficou logo criada a branch master e fiz o primeiro commit com a app.

Ao usar o comando - mvn clean package exec:java -D"exec.mainClass"="ies.app.WeatherStarter" - a app correu e escreveu na consola os seguintes logs:

//Um print só para testes
Hello, user! 
//Os logs
15:24:14.742 [ies.app.WeatherStarter.main()] ERROR ies.app.WeatherStarter - We've just greeted the user!
15:24:14.745 [ies.app.WeatherStarter.main()] FATAL ies.app.WeatherStarter - We've just greeted the user!

Fiz commit e push para a master. Neste momento fica a branch da origin atualizada com os logs. O repositório da location1 só fica depois do pull da master