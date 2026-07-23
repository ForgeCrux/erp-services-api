package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateTransactionRequest;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import com.probestack.forgestudio.design.model.Transaction;
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
import com.probestack.forgestudio.design.service.TransactionsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-23T09:02:07.306969492Z[GMT]")
@Controller
@RequestMapping("${openapi.eRPServices.base-path:/v1}")
public class TransactionsApiController implements TransactionsApi {

    private static final Logger log = LoggerFactory.getLogger(TransactionsApiController.class);

    private final TransactionsService transactionsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public TransactionsApiController(TransactionsService transactionsService, GeneratedRequestValidator generatedRequestValidator) {
        this.transactionsService = transactionsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Transaction> createTransaction(@RequestBody() CreateTransactionRequest createTransactionRequest) {
        log.info("Processing createTransaction request");
        try {
            generatedRequestValidator.validate("createTransaction", createTransactionRequest);
            var response = transactionsService.createTransaction(createTransactionRequest);
            log.info("createTransaction completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createTransaction: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Transaction>> listTransactions(@RequestParam() String accountId, @RequestParam() LocalDate startDate, @RequestParam() LocalDate endDate) {
        log.info("Processing listTransactions request");
        try {
            var response = transactionsService.listTransactions(accountId, startDate, endDate);
            log.info("listTransactions completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listTransactions: {}", e.getMessage(), e);
            throw e;
        }
    }
}
