public class PessoaFisica extends Pessoa {
	private String cpf;
	private String data_nascimento;
	private String genero;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getData_nascimento() {
		return data_nascimento;
	}
	
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", data_nascimento=" + data_nascimento + ", genero=" + genero + "]";
	}

}
