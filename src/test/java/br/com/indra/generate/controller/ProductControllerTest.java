package br.com.indra.generate.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import br.com.indra.generate.model.Product;


class ProductControllerTest {

	@Mock
	private ProductController mock;

	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.openMocks(this);
	}
	
	
	@Test
	void testListar() {
//		ProductController mock = Mockito.mock(ProductController.class);
		ResponseEntity<List<Product>> listar = mock.listar();
		assertTrue(listar == null);
	}

//	@Test
//	void testCadastrar() {
//		fail("Not yet implemented");
//	}

}
