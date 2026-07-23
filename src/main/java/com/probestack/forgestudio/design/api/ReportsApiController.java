package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.BalanceSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ReportsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T02:57:18.537920193Z[GMT]")
@Controller
@RequestMapping("${openapi.eRPServices.base-path:/v1}")
public class ReportsApiController implements ReportsApi {

    private static final Logger log = LoggerFactory.getLogger(ReportsApiController.class);

    private final ReportsService reportsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ReportsApiController(ReportsService reportsService, GeneratedRequestValidator generatedRequestValidator) {
        this.reportsService = reportsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<BalanceSheet> getBalanceSheet(@RequestParam() Integer fiscalYear) {
        log.info("Processing getBalanceSheet request");
        try {
            var response = reportsService.getBalanceSheet(fiscalYear);
            log.info("getBalanceSheet completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getBalanceSheet: {}", e.getMessage(), e);
            throw e;
        }
    }
}
