# Exercício 4: Princípio do Aberto/Fechado (OCP) com Estratégias de Ordenação

Este projeto é uma solução para um exercício de design de software focado em aplicar o **Princípio Aberto/Fechado (Open-Closed Principle - OCP)** a um sistema de formas geométricas.

## 1. Problema Proposto

O sistema inicial possuía um conjunto de formas geométricas (`Circle`, `Square`, `Triangle`) que podiam ser desenhadas. O desafio da "Questão 4" foi introduzir uma nova funcionalidade: a capacidade de **ordenar essas formas** antes de desenhá-las, de acordo com diferentes critérios (estratégias), sem violar os princípios de um bom design de software.

## 2. Objetivo

O objetivo principal era refatorar o código para que novas regras de ordenação pudessem ser adicionadas ao sistema no futuro **sem a necessidade de modificar o código-fonte existente e já funcional**, como as classes de formas ou o código cliente principal que as utiliza.

## 3. Solução Implementada

A solução adota o **Padrão de Projeto Strategy** para encapsular os diferentes algoritmos de ordenação. Em Java, a interface `java.util.Comparator` é a materialização perfeita deste padrão para o contexto de ordenação.

A lógica atende ao Princípio Aberto/Fechado da seguinte forma:

-   **Fechado para Modificação**: As classes `Shape`, `Circle`, `Square` e `Triangle` não foram alteradas para suportar a ordenação. Elas continuam com sua única responsabilidade de "desenhar".
-   **Aberto para Extensão**: O sistema pode ser facilmente estendido para suportar novas regras de ordenação. Para isso, basta criar **uma nova classe** que implementa `Comparator<Shape>`, definindo um novo comportamento de comparação.

