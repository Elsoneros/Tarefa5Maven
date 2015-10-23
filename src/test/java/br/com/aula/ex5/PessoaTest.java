package br.com.aula.ex5;

import org.junit.Test;

import junit.framework.Assert;

public class PessoaTest {
	@Test
	public void cpfDeveSerValido() {
		final Pessoa joao = new Pessoa("Joao", "VALIDO");
		Assert.assertEquals("VALIDO", joao.getCPF());
	}

	@Test(expected = IllegalArgumentException.class)
	public void cpfDeveSerInvalido() {
		final Pessoa sujismundo = new Pessoa("Sujismundo", "INVALIDO");
		Assert.fail("Nao deve deixar o Sujismundo no Estelionato");
	}

}
