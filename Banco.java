import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;


    public String getNome(String meuBanco) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listarNomesClientes() {
        System.out.println("Nomes dos clientes:");
        for (Conta conta : contas) {
            System.out.println(conta.getCliente().getNome());
        }
    }
    public void listarInformacoesClientes(){
        System.out.println("Informaçoẽs dos clientes:");
        for (Conta conta : contas){
            Cliente cliente = conta.getCliente();
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Cpf: " + cliente.getCpf());
            System.out.println("-------------");

        }
        }
    }

