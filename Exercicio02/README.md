# Refatoração com o Padrão de Projeto Facade

Este projeto demonstra a refatoração de uma classe que viola o **Princípio da Responsabilidade Única (SRP)**, utilizando o padrão de projeto **Facade** para separar as responsabilidades de negócio e persistência.

## Princípios de Design

O exercício original mostra uma classe `Employee` que misturava a lógica de negócio (`CalculatePay`) com a lógica de persistência (`Store`). Essa abordagem cria um acoplamento forte, dificultando a manutenção do código.

Para solucionar essa violação do SRP, o padrão **Facade** foi aplicado para:
1.  Isolar a complexidade do subsistema de persistência, criando uma interface simples para o cliente.
2.  Garantir que a classe `Employee` lide apenas com sua responsabilidade de negócio.

A implementação simula um subsistema de persistência em um pacote separado e o expõe através de uma classe **Facade**, que atua como uma interface simplificada para o cliente.

## Estrutura do Projeto

O código está organizado em pacotes, refletindo a separação de responsabilidades:

-   `model`: Contém a classe de domínio `Employee`, com sua lógica de negócio (`calculatePay()`).
-   `persistencia`: Contém o subsistema de persistência, incluindo a interface (`InterfaceEmployeeRepository`) e a implementação (`EmployeeRepository`).
-   `facade`: Contém a classe `EmployeeFacade`, que simplifica a comunicação entre o cliente e o subsistema de persistência.
-   `main`: Contém a classe principal que demonstra o uso da fachada.
