# Exemplo do Princípio Aberto/Fechado (OCP) em Java

Este repositório contém um exemplo prático e didático que demonstra a aplicação do **Princípio Aberto/Fechado (Open/Closed Principle - OCP)**, um dos cinco princípios SOLID de design de software orientado a objetos.

O projeto ilustra a refatoração de um código que viola o OCP para uma solução elegante e extensível que o respeita, usando interfaces e polimorfismo.

## 🎯 Objetivo

O objetivo principal é mostrar como uma má prática de programação comum (uso de `if-else` com `instanceof` para tratar diferentes tipos de objetos) pode ser substituída por um design que permite a extensão do sistema com novas funcionalidades sem a necessidade de modificar o código existente.

## 💡 Conceitos Demonstrados

-   **Princípio Aberto/Fechado (OCP)**: O software deve ser aberto para extensão, mas fechado para modificação.
-   **Polimorfismo**: A capacidade de um método se comportar de maneiras diferentes dependendo do objeto que o invoca.
-   **Programação Orientada a Interfaces**: Codificar para uma abstração (`interface`) em vez de uma implementação concreta (`classe`).
-   **Baixo Acoplamento**: Redução da dependência entre o código cliente (`Main`) e as classes concretas (`Circle`, `Square`).

---

## 🏗️ Estrutura do Projeto

O código está dividido nos seguintes arquivos:

-   `Shape.java`: A interface que define o contrato comum para todas as formas. Exige que qualquer forma implemente o método `draw()`.
-   `Circle.java`: Implementação concreta da interface `Shape`.
-   `Square.java`: Implementação concreta da interface `Shape`.
-   `Triangle.java`: Uma nova implementação para demonstrar a extensibilidade do código refatorado.
-   `Main.java`: A classe principal que contém o ponto de entrada da aplicação.

---

