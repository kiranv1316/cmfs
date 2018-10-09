package com.telkom.cmfs.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "orderNumber", "recommendedDecison", "recommendedProduct", "creditLimit", "minRange", "maxRange",
		"decisionDate", "applicationStatus", "fraudSuspected", "fullProcessComplete", "reasonCode1", "reasonCode2",
		"reasonCode3", "reasonCode4", "reasonCode5", "reasonCode6", "reasonCode7", "reasonCode8", "reasonCode9",
		"reasonCode10", "errorCode", "errorDescription", "productTaken" })
public class SaveVettingOutcome implements Serializable {

	@JsonProperty("orderNumber")
	private String orderNumber;
	@JsonProperty("recommendedDecison")
	private String recommendedDecison;
	@JsonProperty("recommendedProduct")
	private String recommendedProduct;
	@JsonProperty("creditLimit")
	private String creditLimit;
	@JsonProperty("minRange")
	private int minRange;
	@JsonProperty("maxRange")
	private int maxRange;
	@JsonProperty("decisionDate")
	private String decisionDate;
	@JsonProperty("applicationStatus")
	private String applicationStatus;
	@JsonProperty("fraudSuspected")
	private String fraudSuspected;
	@JsonProperty("fullProcessComplete")
	private String fullProcessComplete;
	@JsonProperty("reasonCode1")
	private String reasonCode1;
	@JsonProperty("reasonCode2")
	private String reasonCode2;
	@JsonProperty("reasonCode3")
	private String reasonCode3;
	@JsonProperty("reasonCode4")
	private String reasonCode4;
	@JsonProperty("reasonCode5")
	private String reasonCode5;
	@JsonProperty("reasonCode6")
	private String reasonCode6;
	@JsonProperty("reasonCode7")
	private String reasonCode7;
	@JsonProperty("reasonCode8")
	private String reasonCode8;
	@JsonProperty("reasonCode9")
	private String reasonCode9;
	@JsonProperty("reasonCode10")
	private String reasonCode10;
	@JsonProperty("errorCode")
	private String errorCode;
	@JsonProperty("errorDescription")
	private String errorDescription;
	@JsonProperty("productTaken")
	private ProductTaken productTaken = new ProductTaken();
	private final static long serialVersionUID = 4048076069113963911L;

	@JsonProperty("orderNumber")
	public String getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("orderNumber")
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@JsonProperty("recommendedDecison")
	public String getRecommendedDecison() {
		return recommendedDecison;
	}

	@JsonProperty("recommendedDecison")
	public void setRecommendedDecison(String recommendedDecison) {
		this.recommendedDecison = recommendedDecison;
	}

	@JsonProperty("recommendedProduct")
	public String getRecommendedProduct() {
		return recommendedProduct;
	}

	@JsonProperty("recommendedProduct")
	public void setRecommendedProduct(String recommendedProduct) {
		this.recommendedProduct = recommendedProduct;
	}

	@JsonProperty("creditLimit")
	public String getCreditLimit() {
		return creditLimit;
	}

	@JsonProperty("creditLimit")
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	@JsonProperty("minRange")
	public int getMinRange() {
		return minRange;
	}

	@JsonProperty("minRange")
	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	@JsonProperty("maxRange")
	public int getMaxRange() {
		return maxRange;
	}

	@JsonProperty("maxRange")
	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	@JsonProperty("decisionDate")
	public String getDecisionDate() {
		return decisionDate;
	}

	@JsonProperty("decisionDate")
	public void setDecisionDate(String decisionDate) {
		this.decisionDate = decisionDate;
	}

	@JsonProperty("applicationStatus")
	public String getApplicationStatus() {
		return applicationStatus;
	}

	@JsonProperty("applicationStatus")
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	@JsonProperty("fraudSuspected")
	public String getFraudSuspected() {
		return fraudSuspected;
	}

	@JsonProperty("fraudSuspected")
	public void setFraudSuspected(String fraudSuspected) {
		this.fraudSuspected = fraudSuspected;
	}

	@JsonProperty("fullProcessComplete")
	public String getFullProcessComplete() {
		return fullProcessComplete;
	}

	@JsonProperty("fullProcessComplete")
	public void setFullProcessComplete(String fullProcessComplete) {
		this.fullProcessComplete = fullProcessComplete;
	}

	@JsonProperty("reasonCode1")
	public String getReasonCode1() {
		return reasonCode1;
	}

	@JsonProperty("reasonCode1")
	public void setReasonCode1(String reasonCode1) {
		this.reasonCode1 = reasonCode1;
	}

	@JsonProperty("reasonCode2")
	public String getReasonCode2() {
		return reasonCode2;
	}

	@JsonProperty("reasonCode2")
	public void setReasonCode2(String reasonCode2) {
		this.reasonCode2 = reasonCode2;
	}

	@JsonProperty("reasonCode3")
	public String getReasonCode3() {
		return reasonCode3;
	}

	@JsonProperty("reasonCode3")
	public void setReasonCode3(String reasonCode3) {
		this.reasonCode3 = reasonCode3;
	}

	@JsonProperty("reasonCode4")
	public String getReasonCode4() {
		return reasonCode4;
	}

	@JsonProperty("reasonCode4")
	public void setReasonCode4(String reasonCode4) {
		this.reasonCode4 = reasonCode4;
	}

	@JsonProperty("reasonCode5")
	public String getReasonCode5() {
		return reasonCode5;
	}

	@JsonProperty("reasonCode5")
	public void setReasonCode5(String reasonCode5) {
		this.reasonCode5 = reasonCode5;
	}

	@JsonProperty("reasonCode6")
	public String getReasonCode6() {
		return reasonCode6;
	}

	@JsonProperty("reasonCode6")
	public void setReasonCode6(String reasonCode6) {
		this.reasonCode6 = reasonCode6;
	}

	@JsonProperty("reasonCode7")
	public String getReasonCode7() {
		return reasonCode7;
	}

	@JsonProperty("reasonCode7")
	public void setReasonCode7(String reasonCode7) {
		this.reasonCode7 = reasonCode7;
	}

	@JsonProperty("reasonCode8")
	public String getReasonCode8() {
		return reasonCode8;
	}

	@JsonProperty("reasonCode8")
	public void setReasonCode8(String reasonCode8) {
		this.reasonCode8 = reasonCode8;
	}

	@JsonProperty("reasonCode9")
	public String getReasonCode9() {
		return reasonCode9;
	}

	@JsonProperty("reasonCode9")
	public void setReasonCode9(String reasonCode9) {
		this.reasonCode9 = reasonCode9;
	}

	@JsonProperty("reasonCode10")
	public String getReasonCode10() {
		return reasonCode10;
	}

	@JsonProperty("reasonCode10")
	public void setReasonCode10(String reasonCode10) {
		this.reasonCode10 = reasonCode10;
	}

	@JsonProperty("errorCode")
	public String getErrorCode() {
		return errorCode;
	}

	@JsonProperty("errorCode")
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@JsonProperty("errorDescription")
	public String getErrorDescription() {
		return errorDescription;
	}

	@JsonProperty("errorDescription")
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	@JsonProperty("productTaken")
	public ProductTaken getProductTaken() {
		return productTaken;
	}

	@JsonProperty("productTaken")
	public void setProductTaken(ProductTaken productTaken) {
		this.productTaken = productTaken;
	}

	public static class Builder {
		private String orderNumber;
		private String recommendedDecison;
		private String recommendedProduct;
		private String creditLimit;
		private int minRange;
		private int maxRange;
		private String decisionDate;
		private String applicationStatus;
		private String fraudSuspected;
		private String fullProcessComplete;
		private String reasonCode1;
		private String reasonCode2;
		private String reasonCode3;
		private String reasonCode4;
		private String reasonCode5;
		private String reasonCode6;
		private String reasonCode7;
		private String reasonCode8;
		private String reasonCode9;
		private String reasonCode10;
		private String errorCode;
		private String errorDescription;
		private ProductTaken productTaken;

		public Builder orderNumber(String orderNumber) {
			this.orderNumber = orderNumber;
			return this;
		}

		public Builder recommendedDecison(String recommendedDecison) {
			this.recommendedDecison = recommendedDecison;
			return this;
		}

		public Builder recommendedProduct(String recommendedProduct) {
			this.recommendedProduct = recommendedProduct;
			return this;
		}

		public Builder creditLimit(String creditLimit) {
			this.creditLimit = creditLimit;
			return this;
		}

		public Builder minRange(int minRange) {
			this.minRange = minRange;
			return this;
		}

		public Builder maxRange(int maxRange) {
			this.maxRange = maxRange;
			return this;
		}

		public Builder decisionDate(String decisionDate) {
			this.decisionDate = decisionDate;
			return this;
		}

		public Builder applicationStatus(String applicationStatus) {
			this.applicationStatus = applicationStatus;
			return this;
		}

		public Builder fraudSuspected(String fraudSuspected) {
			this.fraudSuspected = fraudSuspected;
			return this;
		}

		public Builder fullProcessComplete(String fullProcessComplete) {
			this.fullProcessComplete = fullProcessComplete;
			return this;
		}

		public Builder reasonCode1(String reasonCode1) {
			this.reasonCode1 = reasonCode1;
			return this;
		}

		public Builder reasonCode2(String reasonCode2) {
			this.reasonCode2 = reasonCode2;
			return this;
		}

		public Builder reasonCode3(String reasonCode3) {
			this.reasonCode3 = reasonCode3;
			return this;
		}

		public Builder reasonCode4(String reasonCode4) {
			this.reasonCode4 = reasonCode4;
			return this;
		}

		public Builder reasonCode5(String reasonCode5) {
			this.reasonCode5 = reasonCode5;
			return this;
		}

		public Builder reasonCode6(String reasonCode6) {
			this.reasonCode6 = reasonCode6;
			return this;
		}

		public Builder reasonCode7(String reasonCode7) {
			this.reasonCode7 = reasonCode7;
			return this;
		}

		public Builder reasonCode8(String reasonCode8) {
			this.reasonCode8 = reasonCode8;
			return this;
		}

		public Builder reasonCode9(String reasonCode9) {
			this.reasonCode9 = reasonCode9;
			return this;
		}

		public Builder reasonCode10(String reasonCode10) {
			this.reasonCode10 = reasonCode10;
			return this;
		}

		public Builder errorCode(String errorCode) {
			this.errorCode = errorCode;
			return this;
		}

		public Builder errorDescription(String errorDescription) {
			this.errorDescription = errorDescription;
			return this;
		}

		public Builder productTaken(ProductTaken productTaken) {
			this.productTaken = productTaken;
			return this;
		}

		public SaveVettingOutcome build() {
			return new SaveVettingOutcome(this);
		}
	}

	private SaveVettingOutcome(Builder builder) {
		this.orderNumber = builder.orderNumber;
		this.recommendedDecison = builder.recommendedDecison;
		this.recommendedProduct = builder.recommendedProduct;
		this.creditLimit = builder.creditLimit;
		this.minRange = builder.minRange;
		this.maxRange = builder.maxRange;
		this.decisionDate = builder.decisionDate;
		this.applicationStatus = builder.applicationStatus;
		this.fraudSuspected = builder.fraudSuspected;
		this.fullProcessComplete = builder.fullProcessComplete;
		this.reasonCode1 = builder.reasonCode1;
		this.reasonCode2 = builder.reasonCode2;
		this.reasonCode3 = builder.reasonCode3;
		this.reasonCode4 = builder.reasonCode4;
		this.reasonCode5 = builder.reasonCode5;
		this.reasonCode6 = builder.reasonCode6;
		this.reasonCode7 = builder.reasonCode7;
		this.reasonCode8 = builder.reasonCode8;
		this.reasonCode9 = builder.reasonCode9;
		this.reasonCode10 = builder.reasonCode10;
		this.errorCode = builder.errorCode;
		this.errorDescription = builder.errorDescription;
		this.productTaken = builder.productTaken;
	}
}