# Refatoração de Modem

Este projeto demonstra a aplicação do **Princípio da Responsabilidade Única (SRP)** e do **Princípio da Segregação de Interfaces** do SOLID, refatorando uma interface de modem monolítica em interfaces com responsabilidades bem definidas.

## Princípios de Design

A interface `Modem` original, que violava o SRP, foi dividida em duas interfaces menores e coesas:
* `GerenciaConexao`: Responsável por iniciar e encerrar conexões.
* `ComunicaDados`: Responsável por enviar e receber dados.

Esta abordagem torna o código mais flexível, manutenível e fácil de testar, permitindo que classes implementem apenas as capacidades que realmente precisam.

## Estrutura do Projeto

O código está organizado em pacotes para refletir a separação de responsabilidades:
-   `interfaces`: Contém os contratos (as interfaces) que definem as capacidades do sistema.
-   `impl`: Contém as classes concretas que implementam as interfaces.
-   `main`: Contém a classe principal que demonstra o uso das interfaces.
