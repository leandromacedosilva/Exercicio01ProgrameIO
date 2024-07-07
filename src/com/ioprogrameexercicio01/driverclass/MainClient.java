package com.ioprogrameexercicio01.driverclass;

import com.ioprogrameexercicio01.model.Pessoa;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class MainClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream so = System.out;
        
        so.println("INFORME OS DADOS DO CLIENTE");
        so.print("NOME: ");
        String nome = input.nextLine();
        so.print("CPF: " );
        String cpf = input.nextLine();
        so.print("RG: ");
        String rg = input.nextLine();
        so.print("Ano de nascimento: ");
        int anoDeNascimento = input.nextInt();
        so.print("Ano corrente: ");
        int anoAtual = input.nextInt();
        so.print("Grupo sanguineo: ");
        input.nextLine();
        String grupoSanguineo = input.nextLine();
        
        so.println("============ INFORMACOES DO CLIENTE ============");
        Pessoa pessoa = new Pessoa(nome, cpf, rg, anoDeNascimento, anoAtual, grupoSanguineo);
        pessoa.informacoesPessoa();
        so.println("============ FIM INFORMACOES DO CLIENTE ============");
        so.println();
        //Cliente cliente = new Cliente();
        //cliente.informacoesCliente();
    }
}