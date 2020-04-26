public class PessoaFisica extends Pessoa {
     private String cpf;
     
     public PessoaFisica() {
    	 super();
    	 this.cpf = "";
     }

	public void getCpf() {
		 this.cpf = cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
     
}
