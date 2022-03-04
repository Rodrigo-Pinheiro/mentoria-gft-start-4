package com.company;

import com.company.models.Endereco;
import com.company.models.Gerente;
import com.company.models.OperadorDeCaixa;
import com.company.models.Vendedor;

public class Main {

    public static void main(String[] args) {

      /* Endereco endereco = new Endereco();
        endereco.setRua("endereco para essa rua");
        System.out.println(endereco.getRua());*/
        Endereco endereco = new Endereco("Rua funcionario ","complemento endereco funcionario","bairro funcionario");
         System.out.println("-------");

            Vendedor vendedor = new Vendedor();
            vendedor.setNome("Camila vendedora");
            vendedor.setDocumento("123.456.789-10");
            vendedor.setValorSalario(1000d);
            vendedor.setEndereco(endereco);
            vendedor.calculaBonificacao(2d);

            System.out.println(vendedor);
            System.out.println("-------");

            OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Camila op Caixa","719.654.321.-12",2000d,endereco);
            System.out.println(operadorDeCaixa);

        System.out.println("-------");

         Gerente gerente = new Gerente();
         gerente.setNome("Camila gerente");
         gerente.setDocumento("456.443.211-32");
         gerente.setEndereco(endereco);
         gerente.setHorasTrabalhadas(20);
         gerente.setValorHora(100d);

         gerente.calculaRemuneracao();
         gerente.calculaBonificacao(3d);

         System.out.println(gerente);

    }


}
