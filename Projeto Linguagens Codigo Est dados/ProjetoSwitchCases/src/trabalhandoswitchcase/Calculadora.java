package trabalhandoswitchcase;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		//exemplo utilizando Strings
		
		String opcao;
		opcao = JOptionPane.showInputDialog("Digite uma opcao: soma, subtrai, multiplica, divide");
		
		int num1, num2,total;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		
		switch(opcao){
			case "soma":
				total = num1 + num2;
				System.out.println("A soma dos números é "+ total);
		    break;
			case "subtrai":
				total = num1 - num2;
				System.out.println(num1 + " - " + num2 +" = " + total);
			    break;
			case "divide":
				total = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			    break;
			case "multiplica":
				total = num1 * num2;
				System.out.println(num1 * num2);
			    break;
		}

	}

}
