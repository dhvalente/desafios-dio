package br.com.diome.contabanco.exceptions;

public class ValorNegativoException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorNegativoException (String mensagem) {
		super(mensagem);
	}
}
