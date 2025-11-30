
# 📊 Sistema de Orçamento de Projetos (Project Budget System)

Este software foi desenvolvido em **Java** para auxiliar no gerenciamento financeiro de projetos de software. Ele permite cadastrar um projeto com seu orçamento total e gastos iniciais, monitorando automaticamente se o projeto está dentro da meta ou se excedeu o limite financeiro.

O exercício simula um cenário real de gestão, onde novas despesas podem surgir e alterar o status do projeto dinamicamente.

## 🎯 Regras de Negócio

O sistema avalia o saldo do projeto e define seu status:
* **Under Budget (Dentro do Orçamento):** Quando o total gasto é menor ou igual ao orçamento.
* **Over Budget (Orçamento Estourado):** Quando os gastos superam o valor estipulado.

## 🔨 Funcionalidades

1.  **Cadastro de Projeto:** Recebe nome, orçamento total e valor já gasto.
2.  **Monitoramento de Saldo:** Calcula e exibe o valor restante.
3.  **Atualização de Despesas:** Permite adicionar novos custos ao projeto existente.
4.  **Alerta Automático:** Informa imediatamente se o projeto estourou o orçamento após a inclusão de novos gastos.

## 🛠️ Tecnologias e Conceitos

* **Java** (JDK)
* **POO:** Encapsulamento e Métodos de Classe (`Project`).
* **Lógica Condicional:** Estruturas `if/else` para definir o status do orçamento.
* **Formatação de Strings:** Uso de `String.format("%.2f")` para exibição monetária.

## 🚀 Como Executar

1.  Clone este repositório.
2.  Acesse a pasta do projeto.
3.  Execute a classe `Program.java`.

## 💻 Exemplo de Uso

**Cenário 1: Projeto Estourado**
```text
Nome do projeto: E-Commerce XPTO
Orçamento total: R$ 50000.00
Total gasto: R$ 12000.00
Projeto: E-Commerce XPTO
Restando: R$ 38000.00 (Dentro do orçamento!)

Deseja registrar um novo gasto? (s/n)? s
Novo gasto: R$ 40000.00
Após novas despesas...
Projeto: E-Commerce XPTO
Restando: R$ -2000.00 (Orçamento estourado!)
