public class Programa {
	public static void main(String args[]) {
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setCpf("1234567");
		pessoaFisica.setNome("Mateus");
		pessoaFisica.setEmail("mateus@email.com");
		pessoaFisica.setEndereco("Rua top");
		pessoaFisica.setGenero("Masculino");
		pessoaFisica.setData_nascimento("09/02/1995");
		pessoaFisica.setTelefone("086999654617");
		System.out.println(pessoaFisica);
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setCnpj("1234567 123546 123456");
		pessoaJuridica.setNome("Mais Cabelos");
		pessoaJuridica.setEmail("mais_cabelos@email.com");
		pessoaJuridica.setEndereco("Rua Cabelos Lisos");
		pessoaJuridica.setRazao_social("Ajudar os homens calvos...");
		pessoaJuridica.setData_fundacao("09/02/2000");
		pessoaJuridica.setTelefone("086999999999");
		System.out.println(pessoaJuridica);
	}
}
