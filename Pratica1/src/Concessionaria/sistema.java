package Concessionaria;

public class sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dados da Compra:
		
		Cliente clienteA = new Cliente();
		clienteA.nome = "Elvis";
		clienteA.endereco = "Rua João Martins, 7";
		clienteA.phoneNumber = "(27) 98162-4495";
		clienteA.profissao = "Técnico Jr.";
		clienteA.salario = 1790.00;
		
		Carro carroA = new Carro();
		carroA.Fabricante = "Fiat";
		carroA.Modelo = "Argo";
		carroA.Ano = 2019;
		carroA.Modelo = "Hatch";
		
		Transacao atendimento = new Transacao();
		atendimento.status = "Compra";
		
		System.out.println(clienteA.nome);
		
	}

}
