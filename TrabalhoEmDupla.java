package trabalhos;

import java.awt.Dialog.ModalExclusionType;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TrabalhoEmDupla {

	//Dupla Paulo Ricardo e Maicon Cogorni
	
	
	//Cadastrar / Alterar / Listar dados dos Funcionarios
	//Cadastrar / Alterar / Listar dados dos Clientes
	//Cadastrar / Alterar / Listar dados dos Serviços
	// Efetuar Vendas de Serviços para Cliente
	// Listar Vendas

	//Funcionario
	static ArrayList<String> funcionarios = new ArrayList<String>();
	static ArrayList<String> cpfs = new ArrayList<String>();
	static ArrayList<Double> vendasfuncionarios = new ArrayList<Double>();
	//Cliente
	static ArrayList<String> clientes = new ArrayList<String>();
	static ArrayList<String> telefoneClientes = new ArrayList<String>();
	static ArrayList<String> emailsclientes = new ArrayList<String>();
	static ArrayList<String> compraClientes = new ArrayList<String>();
	//Servicos
	static ArrayList<String> servicos = new ArrayList<String>();
	static ArrayList<Double> valoresServicos = new ArrayList<Double>();
	//Vendas
	static ArrayList<Integer> vendasFuncionariosInt = new ArrayList<Integer>();
	static ArrayList<Integer> vendasClientes = new ArrayList<Integer>();
	static ArrayList<Integer> vendasServicos = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		
		//variaveis Funcionario
			Integer indiceFuncionario = -1;	
			String nome = "";
			String cpf = "";
			Double vendasFuncionario = 0.0;
		//variaveis Cliente
			Integer indiceCliente = -1;
			String cliente = "";
			String telefone = "";
			String email = "";
			String compra = "";		
		//variaveis serviços
			Integer indiceServico = -1;
			
			
			
	int controlePrincipal = -1;
	StringBuffer menuPrincipal = new StringBuffer();
	menuPrincipal.append("1 - Funcionarios");
	menuPrincipal.append("\n");
	menuPrincipal.append("2 - Clientes");
	menuPrincipal.append("\n");
	menuPrincipal.append("3 - Serviços");
	menuPrincipal.append("\n");
	menuPrincipal.append("4 - Vendas");
	menuPrincipal.append("\n");
	menuPrincipal.append("0 - Sair");
	
	int controleSecundario = -1;
	StringBuffer menuSecundario = new StringBuffer();
	menuSecundario = new StringBuffer();
	menuSecundario.append("1 - Adicionar");
	menuSecundario.append("\n");
	menuSecundario.append("2 - Remover");
	menuSecundario.append("\n");
	menuSecundario.append("3 - Listar");
	menuSecundario.append("\n");
	menuSecundario.append("0 - Retornar");

	
	
	
	while (controlePrincipal !=0) {
		
		controlePrincipal = jopInt(menuPrincipal.toString());
		controleSecundario = -1;
		
		switch (controlePrincipal) {
		case 1:
			
			//funcionarios
			
			while (controleSecundario !=0) {
				controleSecundario = jopInt("FUNCIONARIOS:\n"+menuSecundario.toString());
				switch (controleSecundario) {
				case 1:
					//adicionar
					nome = jopStr("Informe o nome do funcionário.");
					cpf = jopStr("Informe o CPF do funcionário");
					vendasFuncionario = Double.parseDouble(jopStr("Informe as vendas do funcionário"));					
					
					//adicionar as listas
					addFuncionario(nome, cpf, vendasFuncionario);
					
					break;
				case 2:
					//remover
					jop(listarIndiceFuncionario());
					indiceFuncionario = jopInt("Informe o Indice para remover.");
					remFuncionario(indiceFuncionario);
					break;
				case 3:	
					//listar
					jop(listarFuncionario());
					break;
				case 0:
					//retornar 
					
						break;

				default:
					//invalido
					jop("Opção Inválida");
					break;
				}
			}
	
			break;
		case 2:
			
			//Clientes
			
			while (controleSecundario !=0) {
				controleSecundario = jopInt("CLIENTES:\n"+menuSecundario.toString());
				switch (controleSecundario) {
				case 1:
					//adicionar
					cliente = jopStr("Informe o Nome do cliente.");		
					telefone = jopStr("Informe o numero de telefone do cliente.");
					email = jopStr("informe o email do cliente");
					compra =  jopStr("Informe a compra do cliente");
					//adicionar as listas
					addCliente(cliente, telefone, email, compra);
					
					break;
				case 2:
					//remover
					jop(listarIndiceCliente());
					indiceCliente = jopInt("Informe o Indice para remover.");
					remCliente(indiceCliente);
					break;
				case 3:	
					//listar
					jop(listarCliente());
					break;
				case 0:
					//retornar 
					
						break;

				default:
					//invalido
					jop("Opção Inválida");
					break;
				}
			}
			
			break;
		case 3:
			
			//Serviços
			//add as listar diretamente
			servicos.add("5MB");
			valoresServicos.add(30.0);
			servicos.add("10MB");
			valoresServicos.add(50.0);
			servicos.add("25MB");
			valoresServicos.add(80.0);
			servicos.add("50MB");
			valoresServicos.add(100.0);
			servicos.add("100MB");
			valoresServicos.add(130.0);
			jop(listarServicos());
			jopInt("Informe o serviço para adquirir");
			
			break;
		case 4:
			//Vendas
			break;
		case 0:
			//Saindo
			jop("Saindo do sistema.");
			break;
		default:
			//opcao Invalida
			jop("Opção Inválida");
			break;
		}
	
	}
	
}
	public static String listarIndiceFuncionario() {
		StringBuffer lista = new StringBuffer();
		lista.append("Listar Indices:");
		lista.append("\n");
		lista.append("-------------------");
		lista.append("\n");
		
		for (int i = 0; i < funcionarios.size(); i++) {
			lista.append("Indices: "+i);
			lista.append(" "+funcionarios.get(i));
			lista.append("\n");
			lista.append("---------------------------");
			lista.append("\n");	
		}
		return lista.toString();
	}	
	public static String listarIndiceCliente() {
		StringBuffer lista = new StringBuffer();
		lista.append("Listar Indices:");
		lista.append("\n");
		lista.append("-------------------");
		lista.append("\n");
		
		for (int i = 0; i < clientes.size(); i++) {
			lista.append("Indices: "+i);
			lista.append(" "+clientes.get(i));
			lista.append("\n");
			lista.append("---------------------------");
			lista.append("\n");	
		}
		return lista.toString();
	}
	public static String listarServicos() {
		StringBuffer lista = new StringBuffer();
		lista.append("Listar Serviços:");
		lista.append("\n");
		lista.append("-------------------");
		lista.append("\n");
		
		for (int i = 0; i < servicos.size(); i++) {
			lista.append(i+" Serviço: ");
			lista.append(" "+servicos.get(i));
			lista.append("\n");
			lista.append("Valor: ");
			lista.append(" "+valoresServicos.get(i));
			lista.append("\n");
			lista.append("---------------------------");
			lista.append("\n");	
		}
		return lista.toString();
	}
	public static String listarFuncionario() {
		StringBuffer lista = new StringBuffer();
		lista.append("Listar Funcionario:");
		lista.append("\n");
		lista.append("-------------------");
		lista.append("\n");
		
		for (int i = 0; i < funcionarios.size(); i++) {
			lista.append("Indice: "+i);
			lista.append(" "+funcionarios.get(i));
			lista.append("\n");
			lista.append("CPF: ");
			lista.append(" "+cpfs.get(i));
			lista.append("\n");
			lista.append("Vendas: ");
			lista.append(" "+vendasfuncionarios.get(i));
			lista.append("\n");
			lista.append("---------------------------");
			lista.append("\n");	
		}
		return lista.toString();
		
		
	}
	public static String listarCliente() {
		StringBuffer lista = new StringBuffer();
		lista.append("Listar Cliente:");
		lista.append("\n");
		lista.append("-------------------");
		lista.append("\n");
		
		for (int i = 0; i < clientes.size(); i++) {
			lista.append("Cliente: "+i);
			lista.append(" "+clientes.get(i));
			lista.append("\n");
			lista.append("Email: ");
			lista.append(" "+emailsclientes.get(i));
			lista.append("\n");
			lista.append("Telefone: ");
			lista.append(" "+telefoneClientes.get(i));
			lista.append("\n");
			lista.append("Compra: ");
			lista.append(" "+compraClientes.get(i));
			lista.append("\n");
			lista.append("---------------------------");
			lista.append("\n");	
		}
		return lista.toString();
		
		
	}
	public static void addFuncionario(String nome,
			String cpf,Double vendasfuncionario) {
		funcionarios.add(nome);
		cpfs.add(cpf);
		vendasfuncionarios.add(vendasfuncionario);
		jop(nome+" Adicionado com Sucesso!");
	} 
	public static void addCliente(String cliente, String telefone,String email,String compra) {
		clientes.add(cliente);
		telefoneClientes.add(telefone);
		emailsclientes.add(email);
		compraClientes.add(compra);
		jop(cliente+" Adicionado com sucesso");
	}
	public static void remFuncionario(Integer indice) {
		funcionarios.remove(funcionarios.get(indice));
		cpfs.remove(cpfs.get(indice));
		vendasfuncionarios.remove(vendasfuncionarios.get(indice));
		jop(indice+" Removido com sucesso!");
	}
	public static void remCliente(Integer indice) {
		clientes.remove(clientes.get(indice));
		emailsclientes.remove(emailsclientes.get(indice));
		telefoneClientes.remove(telefoneClientes.get(indice));
		compraClientes.remove(compraClientes.get(indice));
		jop(indice+" Removido com sucesso!");
	}	
public static void compraServico(Integer indice){
	

}
	public static void jop(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	public static String jopStr(String mensagem) {
		String retorno = "";
		retorno = JOptionPane.showInputDialog(mensagem);
		return retorno;
	}
	public static Integer jopInt(String msg) {

	int numero = 0;
	numero = Integer.parseInt(JOptionPane.showInputDialog(msg));
	return numero;
	}
	public static void alterarFun(){
		
		
	}

}
