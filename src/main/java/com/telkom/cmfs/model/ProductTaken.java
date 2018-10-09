package com.telkom.cmfs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "IProduct" })
public class ProductTaken implements Serializable {

	private final static long serialVersionUID = 7867923914612695775L;
	@JsonProperty("IProduct")
	private List<IProduct> iProduct = new ArrayList<>();

	@JsonProperty("IProduct")
	public List<IProduct> getIProduct() {
		return iProduct;
	}

	@JsonProperty("IProduct")
	public void setIProduct(List<IProduct> iProduct) {
		this.iProduct = iProduct;
	}

}
