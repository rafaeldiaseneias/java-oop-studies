# 🎓 Sistema de Controle de Notas (Student Grade System)

Este programa foi desenvolvido em **Java** para gerenciar a situação acadêmica de um aluno baseando-se em suas notas trimestrais. O sistema calcula a nota final, verifica a aprovação e, em caso de reprovação, informa quantos pontos faltaram para atingir a meta.

## 🎯 Regras de Negócio

O ano letivo é dividido em três trimestres com pesos diferentes:
* **1º Trimestre:** Vale 30 pontos.
* **2º Trimestre:** Vale 35 pontos.
* **3º Trimestre:** Vale 35 pontos.
* **Meta de Aprovação:** A nota final deve ser igual ou superior a **60.00**.

## 🔨 Funcionalidades

1.  **Entrada de Dados:** Recebe nome e notas do aluno.
2.  **Validação de Dados:** O sistema impede que sejam digitadas notas maiores que o limite de cada trimestre (ex: digitar 40 no primeiro trimestre gera erro e pede nova digitação).
3.  **Cálculo Automático:** Soma as notas cadastradas.
4.  **Relatório Final:** Exibe se o aluno foi `Aprovado` ou `Reprovado` e o cálculo de pontos faltantes se necessário.

## 🛠️ Tecnologias e Conceitos

* **Java** (JDK)
* **POO:** Criação da classe `Student` para representar a entidade aluno.
* **Constantes:** Uso de `static final` para definir a nota mínima.
* **Lógica de Validação:** Uso de laços `while` para garantir integridade dos dados.

## 🚀 Como Executar

1.  Clone este repositório.
2.  Acesse a pasta do projeto.
3.  Execute a classe `Program.java`.

## 💻 Exemplo de Uso

**Cenário 1: Aprovação**
```text
Digite o nome do aluno: Alex Green
Digite a primeira nota do aluno: 27.00
Digite a segunda nota do aluno: 31.00
Digite a terceira nota do aluno: 32.00
Nota final: 90.00
Aprovado!