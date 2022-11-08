package br.com.indra.generate.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.indra.generate.model.Product;

@RequestMapping("/produtos")
@Controller
public class ProductController {
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Product>> listar() {
		
		Product produto1 = new Product(100,"Acerola",1.00,"7891002003009");
		Product produto2 = new Product(200,"Cupuaçu",1.50,"7892002003009");
		Product produto3 = new Product(300,"Mangaba",1.00,"7893002003009");
		
		List<Product> produtos = Arrays.asList(produto1,produto2,produto3);
		return ResponseEntity.ok(produtos);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Product> cadastrar(@RequestBody @Valid Product produto, UriComponentsBuilder uriBuilder) {
		
		Product cadastraProduto = new Product(produto.getId(),produto.getDescription(),produto.getWeight(),produto.getBarCode());
		
		URI uri = uriBuilder.path("/produtos/{id}").buildAndExpand(cadastraProduto.getId()).toUri();
		return ResponseEntity.created(uri).body(cadastraProduto);	
		
	} 

}
