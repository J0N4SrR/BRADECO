# Projeto de Demonstração: Princípio da Inversão de Dependência (DIP)

## 1. Visão Geral

Este projeto implementa um sistema de termostato simples para demonstrar a aplicação prática do **Princípio da Inversão de Dependência (DIP)**, o "D" do acrônimo SOLID.

O objetivo é mostrar como desacoplar a lógica de negócio de alto nível dos detalhes de implementação de baixo nível (como interações com hardware), resultando em um código mais flexível, testável e manutenível.

## 2. O Princípio Arquitetural: Inversão de Dependência

O DIP estabelece duas regras principais:
1.  Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.
2.  Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

Neste projeto, isso é aplicado da seguinte forma:

-   **Módulo de Alto Nível (a regra de negócio):** A classe `Regulator`, que contém a lógica de quando ligar ou desligar o aquecedor.
-   **Módulos de Baixo Nível (os detalhes de implementação):** As classes `IOChannelThermometer` e `IOChannelHeater`, que sabem como interagir com o hardware específico.
-   **Abstrações (os contratos):** As interfaces `Thermometer` e `Heater`.

A classe `Regulator` não depende diretamente das classes `IOChannel...`. Em vez disso, ela depende das interfaces.
