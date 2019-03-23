Denis Cabral Lopes
==================

# Teste AWS
Criei esse repositório com uma solução similar a um teste da AWS que fiz.
A solução está em java

A solução consiste em definir a menor rota de entrega de um pacote, 
baseado na latitude e longitude, sem local inicial definido, apenas menor rota em ordem para a maior.

Criei funções para que eleve os números de latitude e longitude ao quadrado e depois some-os,
após a soma, ele é atribuido novamente a sua lista de coordenadas e posteriormente ordernado de forma crescente.
Após ordernado, eu removo o fato de calculo e ordenação que é a soma das coordenadas e devolvo as rotas.

# Pontos a melhorar
* Adicionar testes
* Deixar código mais legivel
* Possibilitar definir coordenada inicial como ponto de partida (esse ponto não faz parte do teste)
