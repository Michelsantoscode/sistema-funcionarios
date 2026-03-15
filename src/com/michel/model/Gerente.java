package com.michel.model;

public class Gerente extends Funcionario{

    public Gerente (String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double calcularBonus() {
        double bonus = getSalario() * 0.5;
        return bonus;
    }

}
