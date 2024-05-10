package br.com.diome.contabanco.exceptions;

public class NomeInvalidoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NomeInvalidoException(String mensagem) {
		super(mensagem);
	}

}
