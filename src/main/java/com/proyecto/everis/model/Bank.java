package com.proyecto.everis.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Document(collection = "bank")
@Data
@ApiModel(description = "Clase de la colección de producto, puede ser cuentas o créditos")
public class Bank {
	@ApiModelProperty(notes = "ID del producto único")
	private String id;
	@ApiModelProperty(notes = "Nombre del banco")
	@NotNull
	private String nameBank;
	
	@ApiModelProperty(notes = "Cantidad de comisiones internas")
	@NotNull
	private int cantOpeInter;
	
	@ApiModelProperty(notes = "Comisión interna")
	@NotNull
	private Double comInter;
	
	@ApiModelProperty(notes = "Cantidad de comisiones externas")
	@NotNull
	private int cantOpeExter;
	
	@ApiModelProperty(notes = "Comisión externa")
	@NotNull
	private Double comExter;

}
