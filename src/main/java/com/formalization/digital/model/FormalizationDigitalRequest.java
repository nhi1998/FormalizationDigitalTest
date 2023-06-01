package com.formalization.digital.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class FormalizationDigitalRequest {

  @JsonProperty("idCustomer")
  private Long idCustomer;
  @JsonProperty("contractFormalization")
  private String contractFormalization;

  @JsonProperty("signature")
  private String signature;


  public Long getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Long idCustomer) {
    this.idCustomer = idCustomer;
  }

  public String getContractFormalization() {
    return contractFormalization;
  }

  public void setContractFormalization(String contractFormalization) {
    this.contractFormalization = contractFormalization;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }
}
