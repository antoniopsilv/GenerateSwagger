package br.com.indra.generate.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Product {
	
	@NotNull 
	private Integer id;
	@NotNull @NotEmpty
	private String description;
	@NotNull 
	private Double weight;
	@NotNull @NotEmpty
	private String barCode;
	

}
