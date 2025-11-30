# 📦 Sistema de Inventário de Produtos (Stock System)

Este projeto consiste em um sistema de gerenciamento de produtos desenvolvido em **Java**. O objetivo é simular o controle de estoque de uma loja, permitindo adicionar produtos, listar o inventário e atualizar quantidades em tempo real.

O exercício foca na utilização de **Listas (Collections)** e **Menus Interativos** para criar uma experiência de usuário dinâmica.

## 🔨 Funcionalidades

O sistema oferece um menu interativo com as seguintes opções:

1.  **Adicionar Produto:** Registra um novo produto com nome, preço e quantidade inicial.
2.  **Listar Produtos:** Exibe todos os produtos cadastrados, mostrando o valor unitário e o valor total em estoque de cada um.
3.  **Remover Quantidade:** Dá baixa em itens do estoque (simulação de venda/saída).
4.  **Adicionar Quantidade:** Reabastece o estoque (simulação de compra/entrada).
5.  **Sair:** Encerra a execução.

## 🛠️ Tecnologias e Conceitos

* **Java** (JDK)
* **POO:** Classes, Construtores, Encapsulamento e `toString`.
* **Collections:** Uso da classe `ArrayList` para armazenar múltiplos produtos dinamicamente.
* **Controle de Fluxo:** Estruturas `while` e `switch/case` para navegação no menu.

## 🚀 Como Executar

1.  Clone este repositório.
2.  Acesse a pasta do projeto.
3.  Execute a classe `Program.java`.

## 💻 Exemplo de Uso

```text
1 - Adicionar produto
2 - Listar produtos
3 - Remover quantidade
4 - Adicionar quantidade
5 - Sair do sistema
1

Nome: TV 4K
Preço: 2500.00
Quantidade: 10

1 - Adicionar produto
...
2

Informações do produto:
Nome: TV 4K
Preço: R$ 2500.00
Quantidade em estoque: 10 unidades
Total: R$ 25000.00
--------------------------------