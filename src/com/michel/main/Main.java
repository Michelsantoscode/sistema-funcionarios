package com.michel.main;

import com.michel.model.Desenvolvedor;
import com.michel.model.Gerente;
import com.michel.service.Empresa;

public class Main {
    static void main() {
        Gerente gerente = new Gerente("Michel", 23, 4000);
        Gerente gerente2 = new Gerente("Jose", 23, 6000);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Irailda", 50, 7000);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Michelle", 23, 5600);
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(desenvolvedor);


        empresa.mostrarBonusFuncionarios();

    }
}
