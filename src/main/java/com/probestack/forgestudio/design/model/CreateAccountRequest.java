package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * CreateAccountRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T02:57:18.537920193Z[GMT]")
@Document(collection = "erp_services_api_accounts")
public class CreateAccountRequest {

    private String customerName;

    private String accountType;

    private String currency;

    public CreateAccountRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CreateAccountRequest(String customerName, String accountType, String currency) {
        this.customerName = customerName;
        this.accountType = accountType;
        this.currency = currency;
    }

    public CreateAccountRequest customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Get customerName
     * @return customerName
     */
    @NotNull
    @Schema(name = "customerName", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CreateAccountRequest accountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     * @return accountType
     */
    @NotNull
    @Schema(name = "accountType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public CreateAccountRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     * @return currency
     */
    @NotNull
    @Schema(name = "currency", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAccountRequest createAccountRequest = (CreateAccountRequest) o;
        return Objects.equals(this.customerName, createAccountRequest.customerName) && Objects.equals(this.accountType, createAccountRequest.accountType) && Objects.equals(this.currency, createAccountRequest.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, accountType, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccountRequest {\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Id()
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
