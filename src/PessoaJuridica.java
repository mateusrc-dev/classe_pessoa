public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String razao_social;
	private String data_fundacao;
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazao_social() {
		return razao_social;
	}
	
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	
	public String getData_fundacao() {
		return data_fundacao;
	}
	
	public void setData_fundacao(String data_fundacao) {
		this.data_fundacao = data_fundacao;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", razao_social=" + razao_social + ", data_fundacao=" + data_fundacao
				+ "]";
	}
	
}
