package br.com.diome.contabanco.models;

import java.math.BigDecimal;

import br.com.diome.contabanco.exceptions.AgenciaInvalidaException;
import br.com.diome.contabanco.exceptions.ContaInvalidaException;
import br.com.diome.contabanco.exceptions.NomeInvalidoException;
import br.com.diome.contabanco.exceptions.ValorNegativoException;

public class Conta {
	
	public String agencia;
	
	private int numeroConta;
	
	private String nomeCliente;
	
	private BigDecimal saldo = BigDecimal.ZERO;
	
	public Conta() {		
	}
	
	public void defineAgencia(String agencia) {		
		if(agencia == null || agencia.isEmpty()) {
			throw new AgenciaInvalidaException("A agência deve ser informada");
		}
		this.agencia = agencia;
	}
	
	public void defineNumeroConta(int numeroConta) {
		if(numeroConta <= 0) {
			throw new ContaInvalidaException("O número da conta deve ser positivo");
		}
		this.numeroConta = numeroConta;
	}
	
	public void defineNomeCliente(String nomeCliente) {
		if(nomeCliente == null || nomeCliente.isEmpty()) {
			throw new NomeInvalidoException("O nome do cliente deve ser informado");
		}
		this.nomeCliente = nomeCliente;
	}
	
	public void adiocionaSaldo (Double valor) {
		BigDecimal b = new BigDecimal(valor);
		
		if(b.compareTo(BigDecimal.ZERO) < 0) {
			throw new ValorNegativoException("O valor deve ser positivo");
		}
		this.saldo = this.saldo.add(b);
	}
	
    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }
}
