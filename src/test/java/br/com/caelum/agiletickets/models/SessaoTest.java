package br.com.caelum.agiletickets.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SessaoTest {

	static int x = 1; 
	int y = 0; 

	@BeforeClass
	public static void testBeforeClass() {
		x = 1;
	}

	@Before
	public void testBefore() {
		y = 1;
	}
	
	@Test
	public void xDeveSer1() throws Exception {
        Assert.assertEquals(x, 1);
	}

	@Test
	public void yDeveSer1() throws Exception {
		Assert.assertEquals(y, 1);
	}
	
	@Test
	public void deveVender1ingressoSeHa1vagas() throws Exception {
		Sessao sessao = new Sessao();
        sessao.setTotalIngressos(1);

        Assert.assertTrue(sessao.podeReservar(1));
	}
	
	@Test
	public void deveVender1ingressoSeHa2vagas() throws Exception {
		Sessao sessao = new Sessao();
        sessao.setTotalIngressos(2);

        Assert.assertTrue(sessao.podeReservar(1));
	}

	@Test
	public void naoDeveVender3ingressoSeHa2vagas() throws Exception {
		Sessao sessao = new Sessao();
		sessao.setTotalIngressos(2);

		Assert.assertFalse(sessao.podeReservar(3));
	}

	@Test
	public void reservarIngressosDeveDiminuirONumeroDeIngressosDisponiveis() throws Exception {
		Sessao sessao = new Sessao();
		sessao.setTotalIngressos(5);

		sessao.reserva(3);
		Assert.assertEquals(2, sessao.getIngressosDisponiveis().intValue());
	}
}
