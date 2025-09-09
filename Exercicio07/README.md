# Projeto de Demonstração: Padrão de Projeto Command e SOLID

## 1. Visão Geral

Este projeto demonstra a implementação do padrão de projeto **Command** em Java, aplicado a um sistema de transações financeiras simuladas (depósito, saque, transferência, etc.).

O objetivo principal é mostrar como encapsular cada operação (transação) em seu próprio objeto, permitindo que o sistema trate todas as operações de maneira uniforme, além de desacoplar a lógica da operação de sua interface com o usuário. O design segue rigorosamente os princípios **SOLID**.

## 2. Padrão de Projeto Principal: Command

O padrão Command encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou registrar solicitações e suportar operações que podem ser desfeitas.

Os componentes do padrão neste projeto são:

-   **Command (Comando Abstrato)**: A classe abstrata `Transaction`. Ela define uma interface única e comum para todas as operações: `execute()`.
-   **Concrete Command (Comando Concreto)**: As classes `DepositTransaction`, `WithdrawalTransaction`, `TransferTransaction`, etc. Cada uma encapsula a lógica específica para executar uma operação.
-   **Invoker (Invocador)**: A classe `Main`. Ela é responsável por iniciar a execução dos comandos (`transaction.execute()`), mas não conhece os detalhes de nenhuma transação específica. Ela apenas sabe que pode "executar" um objeto `Transaction`.
-   **Client (Cliente)**: A classe `Main` também atua como cliente, pois é ela quem monta os objetos de comando, associando uma transação com sua dependência de UI (`new DepositTransaction(new DepositUIImpl())`).

## 3. Princípios SOLID em Ação

Este projeto é um ótimo exemplo de como os princípios SOLID trabalham juntos:

#### S - Princípio da Responsabilidade Única (SRP)
Cada classe tem uma única e bem definida responsabilidade:
-   `DepositTransaction` é responsável apenas por executar a lógica de depósito.
-   `DepositUIImpl` é responsável apenas por obter os dados de entrada para um depósito.
-   `Main` é responsável apenas por configurar e invocar as transações.
