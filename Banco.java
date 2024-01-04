package Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	 private List<Conta> contas;

	 public Banco() {
		 this.contas = new ArrayList<>();
	 }
	 
	 //Adiciona uma conta a uma lista de contas
	 public void adicionarConta(Conta conta) {
		 contas.add(conta);
	 }
	 
	 //Abre uma conta nova
	 public void abrirConta(Conta conta) {
	        adicionarConta(conta);
	        System.out.println("Conta aberta com sucesso!");
	    }
	 
	 //Fecha a uma determinada conta pelo número dela
	 public void fecharConta(int numeroConta) {
	        for (Conta conta : contas) {
	            if (conta.getNumeroConta() == numeroConta) { 
	                contas.remove(conta);
	                System.out.println("Conta fechada com sucesso!");
	                return;
	            }
	        }
	        System.out.println("Conta não encontrada.");
	    }
	 
	 //Atualiza as contas Poupança ou Corrente
	 public void atualizarContas() {
	        for (Conta conta : contas) {
	            if (conta instanceof ContaPoupanca) {
	                ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
	                contaPoupanca.calcularRendimento();
	                System.out.println(contaPoupanca);
	                contaPoupanca.print();
	            } else if (conta instanceof ContaCorrente) {
	                ContaCorrente contaCorrente = (ContaCorrente) conta;
	                System.out.println(contaCorrente);

	                if (contaCorrente.getSaldo() < 0) {
	                    System.out.println("Aviso: Conta Corrente em condição de Cheque Especial!");
	                }
	                contaCorrente.print();
	            }
	        }
	    }
	 
	 //Paga boleto
	 public void pagarBoleto(int numeroConta, double valor) {
	        for (Conta conta : contas) {
	            if (conta.getNumeroConta() == numeroConta) {
	                conta.saque(valor);
	                System.out.println("Boleto pago com sucesso!");
	                return;
	            }
	        }
	        System.out.println("Conta não encontrada.");
	    }
	 
	 //Exibe as contas
	 public void mostrarContas() {
	     for (Conta conta : contas) {
	    	 System.out.println(conta);
	     }
	 }
}
