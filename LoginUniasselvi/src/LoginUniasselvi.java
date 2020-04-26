import javax.swing.JOptionPane;

public class LoginUniasselvi {

	public static void main(String[] args) {
		int opcao;
		double Academico = 0;
		double virtual;
		double login = 0;
		double colaborador;
		double empresa;
		double comunidade;
		int senha = 0;
	  do {
		  opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
				  "Digite: \n1-Academico \n2-Academico Sala virtual \n3- Colaborador \n4- Empresa \n5- Comunidade")); 
		switch(opcao) {
		case 1:
			Academico = Double.parseDouble(JOptionPane.showInputDialog("Informe o login"));
			login = login + Academico;
			Academico = Double.parseDouble(JOptionPane.showInputDialog("Informe a senha"));
			senha = senha;
			break;
        case 2:
			virtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o login virtual"));
			virtual = login + Academico;
			virtual = Double.parseDouble(JOptionPane.showInputDialog("Informe a senha"));
			senha = senha;
			break;
        case 3:
        	colaborador = Double.parseDouble(JOptionPane.showInputDialog("Informe o login"));
        	colaborador = login + colaborador;
        	colaborador = Double.parseDouble(JOptionPane.showInputDialog("Informe a senha"));
			senha = senha;
			break;	
        case 4:
        	empresa = Double.parseDouble(JOptionPane.showInputDialog("Informe o cnpj"));
        	empresa = login + empresa;
        	empresa = Double.parseDouble(JOptionPane.showInputDialog("Informe a senha"));
			senha = senha;
			break;
        case 5:
        	comunidade = Double.parseDouble(JOptionPane.showInputDialog("Informe o cpf"));
        	comunidade = login + comunidade;
        	comunidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a senha"));
        	senha = senha;
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
		}while(opcao != 6);
	}
	  
}
