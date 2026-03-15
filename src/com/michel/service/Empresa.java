package com.michel.service;

import com.michel.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        funcionarios.forEach(System.out::println);
    }

    public void mostrarBonusFuncionarios () {
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + "\n" +  "Bonus: " + f.calcularBonus() + "\n");
        }
    }

}
