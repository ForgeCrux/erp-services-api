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
 * PaymentRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-20T16:42:10.148583911Z[GMT]")
@Document(collection = "erp_services_api_payments")
public class PaymentRequest {

    private String sourceAccount;

    private String destinationAccount;

    private Double amount;

    private String currency;

    public PaymentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PaymentRequest(String sourceAccount, String destinationAccount, Double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    public PaymentRequest sourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * Get sourceAccount
     * @return sourceAccount
     */
    @NotNull
    @Schema(name = "sourceAccount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sourceAccount")
    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public PaymentRequest destinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
        return this;
    }

    /**
     * Get destinationAccount
     * @return destinationAccount
     */
    @NotNull
    @Schema(name = "destinationAccount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("destinationAccount")
    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public PaymentRequest amount(Double amount) {
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

    public PaymentRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     * @return currency
     */
    @Schema(name = "currency", example = "USD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        PaymentRequest paymentRequest = (PaymentRequest) o;
        return Objects.equals(this.sourceAccount, paymentRequest.sourceAccount) && Objects.equals(this.destinationAccount, paymentRequest.destinationAccount) && Objects.equals(this.amount, paymentRequest.amount) && Objects.equals(this.currency, paymentRequest.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceAccount, destinationAccount, amount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentRequest {\n");
        sb.append("    sourceAccount: ").append(toIndentedString(sourceAccount)).append("\n");
        sb.append("    destinationAccount: ").append(toIndentedString(destinationAccount)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
