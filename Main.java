import com.sun.source.tree.CaseLabelTree;

import java.util.Arrays;

public class Main {

    public static void main(String[]args){
        Cliente cliente1 = new Cliente("Beltrano", "123456789", "111.222.333-44");


        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        Banco banco = new Banco();
        banco.getNome("Meu Banco");
        banco.setContas(Arrays.asList(contaCorrente, contaPoupanca));


        System.out.println("Nomes dos clientes:");
        for (Conta conta : banco.getContas()) {
            System.out.println(conta.getCliente().getNome());
        }

        System.out.println("Informações dos clientes:");
        for (Conta conta : banco.getContas()) {
            Cliente cliente = conta.getCliente();
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Cpf: " + cliente.getCpf());
            System.out.println("-------------");
        }
    }

    }

