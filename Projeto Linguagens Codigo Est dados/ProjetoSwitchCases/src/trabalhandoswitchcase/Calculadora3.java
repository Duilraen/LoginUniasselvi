package trabalhandoswitchcase;
import javax.swing.JOptionPane;
public class Calculadora3 {

	public static void main(String[] args) {
		
		int num1, num2,total;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		
		//exemplo utilizando Strings
		
		int opcao;
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: 1-Somar , 2-Subtrair , 3-Multiplicar , 4-Dividir"));
		
		switch(opcao){
			case 1:
				total = num1 + num2;
				System.out.println("A soma dos n�meros � " + total);
		    break;
			case 2:
				total = num1 - num2;
				System.out.println(num1 + " - " + num2 +" = " + total);
			    break;
			case 3:
				total = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			    break;
			case 4:
				total = num1 * num2;
				System.out.println(num1 * num2);
			    break;
			default:
				System.out.println("Dados invalidos");
				break;
		}

	}

}
