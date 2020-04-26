package trabalhandoswitchcase;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Lanchonete {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		int codigo;
		int qtde;
		double valorTotal=0;
		
		codigo= Integer.parseInt(JOptionPane.showInputDialog(null,"Especificacao Codigo  Preco\nCachorro Quente 100   R$1,20"
				+ "\nBauru simples      101   R$1,30 \nBauru com ovo     102   R$1,50 "));

		qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		
		switch (codigo) {
		case 100:
			valorTotal = qtde * 1.2;
			break;
        case 101:
        	valorTotal = qtde * 1.3;
			break;
         case 102:
        	 valorTotal = qtde * 1.5;
			break;
		default:
			System.out.println("Codigo informado inválido");
			break;
		}
		System.out.println("O valor total: " +df.format(valorTotal));
		//System.out.println("O valor total: " + String.format("%.2f",valorTotal));
		}
	}

