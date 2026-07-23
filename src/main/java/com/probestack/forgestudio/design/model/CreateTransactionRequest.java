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
 * CreateTransactionRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T02:57:18.537920193Z[GMT]")
@Document(collection = "erp_services_api_transactions")
public class CreateTransactionRequest {

    private String accountId;

    private Double amount;

    private String transactionType;

    private String description;

    public CreateTransactionRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CreateTransactionRequest(String accountId, Double amount, String transactionType) {
        this.accountId = accountId;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public CreateTransactionRequest accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     * @return accountId
     */
    @NotNull
    @Schema(name = "accountId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public CreateTransactionRequest amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     * @return amount
     */
    @NotNull
    @Schema(name = "amount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CreateTransactionRequest transactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Get transactionType
     * @return transactionType
     */
    @NotNull
    @Schema(name = "transactionType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("transactionType")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public CreateTransactionRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransactionRequest createTransactionRequest = (CreateTransactionRequest) o;
        return Objects.equals(this.accountId, createTransactionRequest.accountId) && Objects.equals(this.amount, createTransactionRequest.amount) && Objects.equals(this.transactionType, createTransactionRequest.transactionType) && Objects.equals(this.description, createTransactionRequest.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, amount, transactionType, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransactionRequest {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
