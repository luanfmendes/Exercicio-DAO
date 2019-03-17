package br.com.fiap.teste;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.impl.VeiculoDAOImpl;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

class VeiculoTeste {
	private static VeiculoDAO dao;
	
	private Veiculo veiculo;
	
	@BeforeEach
	public void arrange() {
		veiculo = new Veiculo(1,"DZB-9871", "Vermelho", 1995);
		try {
			dao.cadastrar(veiculo);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no teste...");
		}
	}
	
	@BeforeAll
	public static void inicializar() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("teste");
		EntityManager em = fabrica.createEntityManager();
		dao = new VeiculoDAOImpl(em);
	}
	
	@Test
	@DisplayName("Teste de cadastro de Veiculo com sucesso")
	void cadastroTest() {
		// Assert - validar o resultado
		// valida se foi gerado um c�digo pela sequence
		assertNotEquals(0, veiculo.getCodigo());
	}
	
	@Test
	@DisplayName("Teste de Atualização de Veiculo com sucesso")
	public void atualizaTest() {
		Veiculo veiculo2 = new Veiculo(veiculo.getCodigo(),"AAA-1234", "LARANJA", 1995);
		try {
			dao.atualizar(veiculo2);
			dao.commit();
			
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no teste");
		}
		
		try {
			Veiculo veiculo3 = dao.pesquisar(veiculo2.getCodigo());
			assertEquals("AAA-1234", veiculo3.getDs_placa());
			assertEquals(veiculo2.getDs_placa(), veiculo3.getDs_placa());
		} catch (CodigoInexistenteException e) {
			e.printStackTrace();
			fail("Falha no teste");
		}

	}
	
	@Test
	@DisplayName("Teste de pesquisa de veiculo com sucesso")
	void pesquisaTest() {
		try {
			Veiculo busca = dao.pesquisar(veiculo.getCodigo());
			assertNotNull(busca);
			assertEquals(busca.getCodigo(), veiculo.getCodigo());
			
		} catch (CodigoInexistenteException e) {
			e.printStackTrace();
			fail("Erro na pesquisa");
		}
	}
	
	@Test
	@DisplayName("Teste de remoção de Veiculo com sucesso")
	void removeTest() {
		//Remove
		try {
			dao.excluir(veiculo.getCodigo());
			dao.commit();
		} catch (CodigoInexistenteException | CommitException e) {
			e.printStackTrace();
			fail("Falha no teste");
		}
		assertThrows(CodigoInexistenteException.class, 
			()-> dao.pesquisar(veiculo.getCodigo()));
	
		
	}
	
}
