package br.com.diome.contabanco.exceptions;

public class AgenciaInvalidaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgenciaInvalidaException (String mensagem) {
		super(mensagem);
	}
}
