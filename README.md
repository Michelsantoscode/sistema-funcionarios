# Sistema de Funcionários em Java

Projeto desenvolvido em **Java** para praticar conceitos de **Programação Orientada a Objetos (POO)**.

O sistema permite gerenciar funcionários de uma empresa, utilizando herança e polimorfismo para calcular bônus de diferentes cargos.

---

## 📚 Conceitos aplicados

Este projeto utiliza conceitos fundamentais de Java:

* Programação Orientada a Objetos (POO)
* Herança
* Polimorfismo
* Encapsulamento
* Collections (`List` e `ArrayList`)
* Organização em **packages**
* Sobrescrita de métodos (`@Override`)

---

## 📦 Estrutura do projeto

```
src
 └─ com
    └─ michel
       ├─ main
       │   └─ Main.java
       │
       ├─ model
       │   ├─ Funcionario.java
       │   ├─ Gerente.java
       │   └─ Desenvolvedor.java
       │
       └─ service
           └─ Empresa.java
```

---

* ⚙️ Funcionalidades

Adicionar funcionário

Remover funcionário

Listar funcionários

Calcular bônus de funcionários

O cálculo de bônus utiliza polimorfismo, permitindo que cada tipo de funcionário tenha uma regra diferente.

Exemplo:

Gerente → bônus baseado no salário

Desenvolvedor → bônus baseado no salário com outra porcentagem

🚀 Como executar o projeto

Clone o repositório

git clone https://github.com/Michelsantoscode/sistema-funcionarios.git

Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)

Execute a classe:

Main.java
🎯 Objetivo do projeto

Este projeto foi criado com o objetivo de praticar conceitos fundamentais de Java e desenvolver habilidades em programação orientada a objetos.

👨‍💻 Autor

Michel Santos
