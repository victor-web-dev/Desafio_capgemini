# Desafio de programação Capgemini:

Repositório dedicado ao desafio de programação da Capgemini referente à Academia Técnica _[Capgemini](https://capgemini.proway.com.br/)_;

## Sobre o desafio:

O desafio poderia ser feito em qualquer linguagem de programação, porém, se feito em Java seria considerado um diferencial.
Tendo isso em mente, devido minha afinidade maior com Javascript, iniciei a criação da lógica usando o Javascript e então adaptei a mesma lógica em Java. 

_Mantive o arquivo **desafio.js** disponível para possível análise dos avaliadores. Bastando apenas abrir o arquivo, de preferencia no Visual Studio Code com a Extensão **Code Runner** para execução do mesmo, se for da vontade dos referidos._

- Sobre a aplicação Java

Existem 2 classes:
  Classe questions - onde estão escritas as funções referentes às questões do desafio;
  Classe main - onde a classe question é declarada e suas funções utilizadas;
  Ambas estão no mesmo arquivo de nome _main.java_;

A função referente a **questão 1** está localizada na *linha 11* e sendo chamada na *linha 72*;

A função referente a **questao 2** está localizada na *linha 25* e sendo chamada 3 vezes nas *linhas 74,75,76* para o fim de testar suas saídas;

A função referente a **questão 3** está localizada na linha 43 e sendo chamada na linha 78;

- Funcionamento das Funções:

_Todos os resultados estão sendo exibidos no console do IDE;_
Todas as chamadas das funções estão comentadas;
**É necessário descomentar a função para executa-la**;

- Observação:

A questão 2, *retorna 0* para quando o parâmetro informado for aprovado na avaliação do Regex;
  *Retorna -1* quando o parametro for maior que 6 mas nao corresponder ao padrao correto;
  *Retorna a contagem de caracteres* faltantes quando o parametro informado não corresponde a avaliação do Regex e nem ao tamanho minimo de 6 caracteres;

A questão 3 está incompleta, está retornando somente os caracteres iguais dentro de uma String;



### Técnologias utilizadas:

- Visual Studio Code
- Eclipse IDE
- Java
- Javascript

## Como rodar a aplicação:

Clone o repositório;
Abra a IDE Eclipse;
Vá até a opção File na Toolbar;
Selecione Open Projects from File System;
Importe a pasta __Desafio_Capgemini__;

