package br.com.diome.contabanco.exceptions;

public class ContaInvalidaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContaInvalidaException(String mensagem) {
		super(mensagem);
	}

}
