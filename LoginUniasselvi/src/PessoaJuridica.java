public class PessoaJuridica extends Pessoa {
  private String cnpj;
  
  public PessoaJuridica() {
	  super();
	  this.cnpj = "";
  }

public String getCnpj() {
	return cnpj;
}

public void setCCnpj(String cnpj) {
	this.cnpj = cnpj;
}
  
}
