package trabalhandoswitchcase;

import javax.swing.JOptionPane;

public class ContaCorrente {

	public static void main(String[] args) {
		String nome;
		String conta;
		int opcao;
		double deposito;
		double saque;
		double saldo = 0;
		
		nome = JOptionPane.showInputDialog("Informe seu nome");
		conta = JOptionPane.showInputDialog("informe sua conta");
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: \n1-Deposito \n2-Saque \n3-saldo"));
	  
		switch(opcao) {
		case 1:
			deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a depositar"));
			saldo = saldo + deposito;
			//saldo +=deposito; // faz a mesma coisa que a linha anterior
			break;
        case 2:
			saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
			if (saldo >= saque) {
				saldo = saldo - saque;
			}else {
				JOptionPane.showMessageDialog(null, "saldo insuficiente");
			}
			break;
        case 3:
        	System.out.println("saldo " + saldo);
        	JOptionPane.showMessageDialog(null, "saldo: " + saldo);
			break;	
			
		default:
			System.out.println("Opcao invalida");
			break;
	
	}
	}
}
