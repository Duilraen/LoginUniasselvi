
public class Empresa extends PessoaJuridica {
	private String registroEmpresa;
	
	public Empresa() {
		super();
		this.registroEmpresa = "";
    }
     
 	public String getRegistroEmpresa(){
 	    return this.registroEmpresa;
 	}
 	public void setRegistroEmpresa(String registroEmpresa){
 	    this.registroEmpresa = registroEmpresa;
 	}
  	

	 
}
