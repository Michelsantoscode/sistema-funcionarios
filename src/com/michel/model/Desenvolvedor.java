package com.michel.model;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor (String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double calcularBonus() {
        double bonus = getSalario() * 0.2;
        return bonus;
    }


}
