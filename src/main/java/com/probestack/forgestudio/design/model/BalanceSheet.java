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
 * BalanceSheet
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-20T08:01:51.014269893Z[GMT]")
@Document(collection = "erp_services_api_reports")
public class BalanceSheet {

    private Integer fiscalYear;

    private Double assets;

    private Double liabilities;

    private Double equity;

    public BalanceSheet fiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
        return this;
    }

    /**
     * Get fiscalYear
     * @return fiscalYear
     */
    @Schema(name = "fiscalYear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fiscalYear")
    public Integer getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public BalanceSheet assets(Double assets) {
        this.assets = assets;
        return this;
    }

    /**
     * Get assets
     * @return assets
     */
    @Schema(name = "assets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assets")
    public Double getAssets() {
        return assets;
    }

    public void setAssets(Double assets) {
        this.assets = assets;
    }

    public BalanceSheet liabilities(Double liabilities) {
        this.liabilities = liabilities;
        return this;
    }

    /**
     * Get liabilities
     * @return liabilities
     */
    @Schema(name = "liabilities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("liabilities")
    public Double getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(Double liabilities) {
        this.liabilities = liabilities;
    }

    public BalanceSheet equity(Double equity) {
        this.equity = equity;
        return this;
    }

    /**
     * Get equity
     * @return equity
     */
    @Schema(name = "equity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("equity")
    public Double getEquity() {
        return equity;
    }

    public void setEquity(Double equity) {
        this.equity = equity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BalanceSheet balanceSheet = (BalanceSheet) o;
        return Objects.equals(this.fiscalYear, balanceSheet.fiscalYear) && Objects.equals(this.assets, balanceSheet.assets) && Objects.equals(this.liabilities, balanceSheet.liabilities) && Objects.equals(this.equity, balanceSheet.equity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fiscalYear, assets, liabilities, equity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BalanceSheet {\n");
        sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    liabilities: ").append(toIndentedString(liabilities)).append("\n");
        sb.append("    equity: ").append(toIndentedString(equity)).append("\n");
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
