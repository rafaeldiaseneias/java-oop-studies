# 💼 Sistema de Cálculo de Salário de Funcionários

Este projeto foi desenvolvido como um exercício prático de **Programação Orientada a Objetos (POO)** em Java. O objetivo é criar um sistema que gerencia dados de um funcionário, calcula o salário líquido descontando impostos e aplica aumentos salariais baseados em porcentagem.

## 📝 Descrição do Desafio

O programa deve ler os dados de um funcionário (Nome, Salário Bruto e Imposto). Em seguida, deve realizar as seguintes operações:
1.  Mostrar o nome e o salário líquido.
2.  Solicitar uma porcentagem de aumento.
3.  Atualizar o **Salário Bruto** com a porcentagem dada.
4.  Exibir os dados atualizados do funcionário.

## 🛠️ Tecnologias e Conceitos Utilizados

* **Java** (JDK)
* **POO**: Encapsulamento, Classes, Métodos e Atributos.
* **Manipulação de Strings** e formatação numérica.
* **Lógica de Condicionais** (`if/else`) para interação com o usuário.

## 📂 Estrutura do Projeto

O código está organizado em dois pacotes principais para separar as responsabilidades:

* `entities`: Contém a classe `Employee` (objeto de domínio), responsável pela lógica de negócio (cálculos de salário).
* `application`: Contém a classe `Program`, responsável pela interação com o usuário (entrada e saída de dados).

## 🚀 Como Executar

1.  Clone este repositório.
2.  Abra o projeto em sua IDE Java de preferência (Eclipse, IntelliJ, VS Code).
3.  Execute a classe `Program.java`.

## 💻 Exemplo de Uso

```bash
Nome: Joao Silva
Salário bruto: R$ 6000.00
Imposto: R$ 1000.00
Funcionário: Joao Silva, R$ 5000.00

Deseja aumentar o salário? (s/n)? s
Qual a porcentagem do aumento salarial? 10

Dados atualizados do funcionário: Joao Silva, R$ 5600.00
