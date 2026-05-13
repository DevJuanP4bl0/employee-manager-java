# Sistema de Gerenciamento de Funcionarios

Sistema que realiza o aumento salarial para funcionários, através de uma porcentagem fornecida. 

O sistema não permite repetição de ID no cadastro de funcionários, além de exigir a passagem de um ID existente para se realizar um incremento no salário. Para realizar essas validações, utilizamos um método estático chamado findEmployee, que não depende de uma instância específica para realizar sua operação de encontrar o funcionário com dado ID. Neste método, usamos equals para garantir que a comparação irá retornar um resultado consistente ao invés de "==", devido a referência na memória.

## Tecnologia usada:

- Java
