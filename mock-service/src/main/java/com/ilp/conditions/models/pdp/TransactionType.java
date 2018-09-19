/*
 * PDP FSP API (Implementation Friendly Version)
 * DRAFT FOR INTERNAL REVIEW ONLY - Based on API Definition.docx updated on 2017-07-06 - Implementation friendly version. [Changes from pervious version (2.7) - maxLength changed to 48 from 32 for IlpCondition and IlpFulfilment Types.]
 *
 * OpenAPI spec version: 2.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ilp.conditions.models.pdp;

import java.util.Objects;

/**
 * Data model for the complex type TransactionType.
 */
public class TransactionType {

  private String scenario = null;

  private String subScenario = null;

  private String initiator = null;

  private String initiatorType = null;

  private Refund refundInfo = null;

  private String balanceOfPayments = null;

  public TransactionType scenario(String scenario) {
    this.scenario = scenario;
    return this;
  }

   /**
   * Deposit, withdrawal, refund, …
   * @return scenario
  **/
  public String getScenario() {
    return scenario;
  }

  public void setScenario(String scenario) {
    this.scenario = scenario;
  }

  public TransactionType subScenario(String subScenario) {
    this.subScenario = subScenario;
    return this;
  }

   /**
   * Possible sub-scenario, defined locally within the scheme.
   * @return subScenario
  **/
  public String getSubScenario() {
    return subScenario;
  }

  public void setSubScenario(String subScenario) {
    this.subScenario = subScenario;
  }

  public TransactionType initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Who is initiating the transaction - Payer or Payee
   * @return initiator
  **/
  public String getInitiator() {
    return initiator;
  }

  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }

  public TransactionType initiatorType(String initiatorType) {
    this.initiatorType = initiatorType;
    return this;
  }

   /**
   * Consumer, agent, business, …
   * @return initiatorType
  **/
  public String getInitiatorType() {
    return initiatorType;
  }

  public void setInitiatorType(String initiatorType) {
    this.initiatorType = initiatorType;
  }

  public TransactionType refundInfo(Refund refundInfo) {
    this.refundInfo = refundInfo;
    return this;
  }

   /**
   * Get refundInfo
   * @return refundInfo
  **/
  public Refund getRefundInfo() {
    return refundInfo;
  }

  public void setRefundInfo(Refund refundInfo) {
    this.refundInfo = refundInfo;
  }

  public TransactionType balanceOfPayments(String balanceOfPayments) {
    this.balanceOfPayments = balanceOfPayments;
    return this;
  }

   /**
   * Balance of Payments code.
   * @return balanceOfPayments
  **/
  public String getBalanceOfPayments() {
    return balanceOfPayments;
  }

  public void setBalanceOfPayments(String balanceOfPayments) {
    this.balanceOfPayments = balanceOfPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionType transactionType = (TransactionType) o;
    return Objects.equals(this.scenario, transactionType.scenario) &&
        Objects.equals(this.subScenario, transactionType.subScenario) &&
        Objects.equals(this.initiator, transactionType.initiator) &&
        Objects.equals(this.initiatorType, transactionType.initiatorType) &&
        Objects.equals(this.refundInfo, transactionType.refundInfo) &&
        Objects.equals(this.balanceOfPayments, transactionType.balanceOfPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenario, subScenario, initiator, initiatorType, refundInfo, balanceOfPayments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionType {\n");
    
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    subScenario: ").append(toIndentedString(subScenario)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    initiatorType: ").append(toIndentedString(initiatorType)).append("\n");
    sb.append("    refundInfo: ").append(toIndentedString(refundInfo)).append("\n");
    sb.append("    balanceOfPayments: ").append(toIndentedString(balanceOfPayments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
