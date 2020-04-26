
public class Gerente extends Funcionario {
	private int senha;
	private int numeroFuncionariosGerenciados;
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getNumeroFuncionariosGerenciados() {
		return numeroFuncionariosGerenciados;
	}

	public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
		this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
	}

	public double getBonificacao() {
		return super.getBonificacao() + 1000.0;
	}
	
	public String toString() {
		return super.toString() + " / Senha: " + this.getSenha() + " / Numero de Funcionarios Gerenciados: " + this.getNumeroFuncionariosGerenciados();
	}
}
