package com.telkom.cmfs.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "applicationNumber", "recommendedDecision", "recommendedProduct", "recommendedCreditLimit",
		"minRange", "maxRange", "dateApproved", "applicationStatus", "fraudSuspected", "fullProcessComplete",
		"fraudCode", "paymentType", "directorId", "directorTitle", "directorInitials", "directorSurname",
		"directorPosition", "errorCode", "errorDescription" })
public class SaveVettingRequestIn implements Serializable {

	@JsonProperty("applicationNumber")
	private String applicationNumber;
	@JsonProperty("recommendedDecision")
	private String recommendedDecision;
	@JsonProperty("recommendedProduct")
	private String recommendedProduct;
	@JsonProperty("recommendedCreditLimit")
	private String recommendedCreditLimit;
	@JsonProperty("minRange")
	private double minRange;
	@JsonProperty("maxRange")
	private double maxRange;
	@JsonProperty("dateApproved")
	private String dateApproved;
	@JsonProperty("applicationStatus")
	private String applicationStatus;
	@JsonProperty("fraudSuspected")
	private String fraudSuspected;
	@JsonProperty("fullProcessComplete")
	private String fullProcessComplete;
	@JsonProperty("fraudCode")
	private String fraudCode;
	@JsonProperty("paymentType")
	private String paymentType;
	@JsonProperty("directorId")
	private String directorId;
	@JsonProperty("directorTitle")
	private String directorTitle;
	@JsonProperty("directorInitials")
	private String directorInitials;
	@JsonProperty("directorSurname")
	private String directorSurname;
	@JsonProperty("directorPosition")
	private String directorPosition;
	@JsonProperty("errorCode")
	private String errorCode;
	@JsonProperty("errorDescription")
	private String errorDescription;
	private final static long serialVersionUID = -2648804824230093210L;

	@JsonProperty("applicationNumber")
	public String getApplicationNumber() {
		return applicationNumber;
	}

	@JsonProperty("applicationNumber")
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	@JsonProperty("recommendedDecision")
	public String getRecommendedDecision() {
		return recommendedDecision;
	}

	@JsonProperty("recommendedDecision")
	public void setRecommendedDecision(String recommendedDecision) {
		this.recommendedDecision = recommendedDecision;
	}

	@JsonProperty("recommendedProduct")
	public String getRecommendedProduct() {
		return recommendedProduct;
	}

	@JsonProperty("recommendedProduct")
	public void setRecommendedProduct(String recommendedProduct) {
		this.recommendedProduct = recommendedProduct;
	}

	@JsonProperty("recommendedCreditLimit")
	public String getRecommendedCreditLimit() {
		return recommendedCreditLimit;
	}

	@JsonProperty("recommendedCreditLimit")
	public void setRecommendedCreditLimit(String recommendedCreditLimit) {
		this.recommendedCreditLimit = recommendedCreditLimit;
	}

	@JsonProperty("minRange")
	public double getMinRange() {
		return minRange;
	}

	@JsonProperty("minRange")
	public void setMinRange(double minRange) {
		this.minRange = minRange;
	}

	@JsonProperty("maxRange")
	public double getMaxRange() {
		return maxRange;
	}

	@JsonProperty("maxRange")
	public void setMaxRange(double maxRange) {
		this.maxRange = maxRange;
	}

	@JsonProperty("dateApproved")
	public String getDateApproved() {
		return dateApproved;
	}

	@JsonProperty("dateApproved")
	public void setDateApproved(String dateApproved) {
		this.dateApproved = dateApproved;
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

	@JsonProperty("fraudCode")
	public String getFraudCode() {
		return fraudCode;
	}

	@JsonProperty("fraudCode")
	public void setFraudCode(String fraudCode) {
		this.fraudCode = fraudCode;
	}

	@JsonProperty("paymentType")
	public String getPaymentType() {
		return paymentType;
	}

	@JsonProperty("paymentType")
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@JsonProperty("directorId")
	public String getDirectorId() {
		return directorId;
	}

	@JsonProperty("directorId")
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}

	@JsonProperty("directorTitle")
	public String getDirectorTitle() {
		return directorTitle;
	}

	@JsonProperty("directorTitle")
	public void setDirectorTitle(String directorTitle) {
		this.directorTitle = directorTitle;
	}

	@JsonProperty("directorInitials")
	public String getDirectorInitials() {
		return directorInitials;
	}

	@JsonProperty("directorInitials")
	public void setDirectorInitials(String directorInitials) {
		this.directorInitials = directorInitials;
	}

	@JsonProperty("directorSurname")
	public String getDirectorSurname() {
		return directorSurname;
	}

	@JsonProperty("directorSurname")
	public void setDirectorSurname(String directorSurname) {
		this.directorSurname = directorSurname;
	}

	@JsonProperty("directorPosition")
	public String getDirectorPosition() {
		return directorPosition;
	}

	@JsonProperty("directorPosition")
	public void setDirectorPosition(String directorPosition) {
		this.directorPosition = directorPosition;
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

}