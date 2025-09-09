# Projeto de Demonstração: Princípio da Substituição de Liskov (LSP) em Java

## 1. Visão Geral

Este é um projeto didático em Java criado para ilustrar a aplicação correta do **Princípio da Substituição de Liskov (LSP)**, o "L" do acrônimo SOLID.

O objetivo é demonstrar como um design que utiliza interfaces para definir contratos de comportamento (`ContaComSaque`) é superior a uma hierarquia de herança rígida que pode levar a erros em tempo de execução. O código simula um sistema bancário simples com diferentes tipos de contas.

## 2. O Conceito: Resolvendo um Problema Clássico de Design

Muitos desenvolvedores, ao modelar um sistema bancário, podem cair na seguinte armadilha:

1.  Criar uma classe base `ContaBancaria` com os métodos `depositar()` e `sacar()`.
2.  Criar uma subclasse `ContaPoupanca` que herda de `ContaBancaria`.
3.  Perceber que a `ContaPoupanca` não deveria permitir saques. A "solução" comum (e incorreta) é sobrescrever o método `sacar()` para lançar uma exceção, como `UnsupportedOperationException`.

Isso **viola o LSP**, que afirma que um objeto de uma subclasse deve poder substituir um objeto da superclasse sem quebrar a aplicação. Ao lançar uma exceção inesperada, a `ContaPoupanca` quebra o "contrato" estabelecido pela `ContaBancaria`, tornando-a um substituto inválido.

## 3. A Solução Implementada

Este projeto demonstra a abordagem correta através da **Segregação de Interfaces**.

Em vez de uma herança inadequada, o design adota a seguinte estratégia:

-   Uma classe abstrata `Conta` define o comportamento comum a todas as contas (`saldo`, `depositar()`).
-   Uma interface `ContaComSaque` define um contrato explícito para qualquer conta que **pode** realizar saques.
-   A classe `ContaBancaria` implementa `ContaComSaque`, cumprindo o contrato.
-   A classe `ContaPoupanca` **não** implementa a interface, pois não possui o comportamento de saque.
