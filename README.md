# Apredizado de Máquina Supervisionado (Machine Learning) com Weka - Java

Simples exemplo utilizando Weka para previsão de liberação de empréstimo. O algoritmo utilizado para previsão foi o Naive Bayes, utilizando dados a partir de um arquivo .arff (o que é uma característica de um algoritmo supervisionado).

### Pré-requisitos

É necessário ter instalado

```
Java 8
Maven
```

### Instalando

Após ter todos os pré-requisitos instalados no computador, clone o projeto para sua workspace.

```
git clone https://github.com/renanlJ/machinelearning-weka.git
```

## Executando a projeto

O arquivo com os dados e modelo está na pasta raiz do projeto com o nome "emprestimo.arff". Indico inserir mais dados e validar as saidas para o mesmo "input".
Na pasta do projeto faça a compilação do projeto:
```
mvn compile
```
Então execute a classe Principal com o seguinte comando:
```
mvn exec:java -Dexec.mainClass="br.com.machinelearning_weka.Principal" 
```

## Autor

* **Renan Lemos**

Veja mais projetos no meu portifólio no [github](https://github.com/renanlJ)

## Referências

* Há um bom artigo que explica um pouco do algortimo [Naive Bayes](https://medium.com/cwi-software/introdu%C3%A7%C3%A3o-a-machine-learning-utilizando-o-weka-c38388514c40)

