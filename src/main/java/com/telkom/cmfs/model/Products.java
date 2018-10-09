
package com.telkom.cmfs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "IProduct" })
public class Products implements Serializable {

	@JsonProperty("IProduct")
	private List<IProduct> iProduct = new ArrayList<>();
	private final static long serialVersionUID = 4280376778873957521L;

	@JsonProperty("IProduct")
	public List<IProduct> getIProduct() {
		return iProduct;
	}

	@JsonProperty("IProduct")
	public void setIProduct(List<IProduct> iProduct) {
		this.iProduct = iProduct;
	}

}
