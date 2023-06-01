package com.formalization.digital.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRequest {

  @JsonProperty("customerName")
  private String customerName;

  @JsonProperty("address")
  private String address;

  @JsonProperty("rg")
  private String rg;

  @JsonProperty("cpf")
  private String cpf;

  @JsonProperty("telephone")
  private String telephone;

  @JsonProperty("email")
  private String email;

  @JsonProperty("genere")
  private String genere;

  @JsonProperty("stateCivil")
  private String stateCivil;

  @JsonProperty("product")
  private String product;

  @JsonProperty("limitCredit")
  private Float limitCredit;


    public Float getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(Float limitCredit) {
        this.limitCredit = limitCredit;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getStateCivil() {
        return stateCivil;
    }

    public void setStateCivil(String stateCivil) {
        this.stateCivil = stateCivil;
    }
}
