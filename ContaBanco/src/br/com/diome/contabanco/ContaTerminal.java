package br.com.diome.contabanco;

import java.awt.AWTException;
import java.util.Scanner;

import br.com.diome.contabanco.models.Conta;

public class ContaTerminal {
	public static void main(String[] args) throws AWTException {
		boolean validaAgencia = false;
		boolean validaNumeroConta = false;
		boolean validaNomeCliente = false;
		boolean validaSaldo = false;

		Conta conta = new Conta();
		
		Scanner scanner = new Scanner(System.in);

		while (!validaAgencia) {		
			try {
				System.out.println("Por favor, digite o número da Agência:");
				String agencia = scanner.nextLine();
				conta.defineAgencia(agencia);
				}	
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			validaAgencia = true;	
		
		}
		
		while (!validaNumeroConta) {				
			try {
				System.out.println("Por favor, digite o número da Conta:");
				int numero = Integer.parseInt( scanner.nextLine());
				conta.defineNumeroConta(numero);
			}
			catch (Exception e) {
				System.out.println("O número da conta deve ser um inteiro positivo!!!");
				continue;
			}
			validaNumeroConta = true;		
		}
		
		while (!validaNomeCliente) {
			try {
				System.out.println("Por favor, digite o nome do Cliente:");
				String nomeCliente = scanner.nextLine();
				conta.defineNomeCliente(nomeCliente);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			validaNomeCliente = true;
		}
		
		while (!validaSaldo) {
			try {
				System.out.println("Por favor, digite o saldo:");
				
				Double saldo = Double.parseDouble(scanner.nextLine());
				
				conta.adiocionaSaldo(saldo);
			}catch (Exception e) {
				System.out.println("O valor deve ser positivo!!!");
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
				continue;
			}
			validaSaldo = true;
		}
		scanner.close();
		System.out.println(conta);

	}
}
