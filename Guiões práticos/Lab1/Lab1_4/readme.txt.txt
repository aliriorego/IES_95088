LAB1_4

Instalar docker e correr o exemplo que eles disponibilizam no site

Fazer download  da getting-started-app

Criar o Dockerfile com o script fornecido

Correr o comando - docker build -t getting-started .
Este comando cria a imagem para podermos executar com o comando

docker run -dp 127.0.0.1:3000:3000 getting-started

No docker desktop já se vê a imagem a correr e no endereço localhost:3000 já tenho a app a correr localmente

docker ps - lista na consola os containers que existem

Depois foi um pequeno exemplo de como atualizar um container. 

Após a alteração do código, deve-se parar o container antigo, eliminar e correr de novo o comando do docker run

Na parte 4 é para publicar o container no repositório do Docker

Foi preciso fazer login na consola para poder fazer o push - docker login -u aliriorego - e de seguida o push - docker push aliriorego/getting-started

Por fim, foi implementar um "volume" para guardar a informação que ficou associada. Assim ao correr o mesmo container noutra máquina, por exemplo, essa informação não é perdida