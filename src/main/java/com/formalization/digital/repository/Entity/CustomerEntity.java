package com.formalization.digital.repository.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="CUSTOMER_UID")
    private Long customerUid;

    @Column(name ="CUSTOMER_NAME")
    private String customerName;

    @Column(name ="ADDRESS")
    private String address;

    @Column(name ="RG")
    private String rg;

    @Column(name ="CPF")
    private String cpf;

    @Column(name ="EMAIL")
    private String email;

    @Column(name ="GENERE")
    private String genere;

    @Column(name ="STATE_CIVIL")
    private String stateCivil;

    @Column(name ="TELEPHONE")
    private String telephone;

    @Column(name ="PRODUCT")
    private String product;

    @Column(name ="LIMITCREDIT")
    private Float limitCredit;

    @Column(name ="CONTRACTFORMALIZATION")
    private String contractFormalization;

    @Column(name ="SIGNATURE")
    private String signature;


    public Long getCustomerUid() {
        return customerUid;
    }

    public void setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Float getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(Float limitCredit) {
        this.limitCredit = limitCredit;
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
