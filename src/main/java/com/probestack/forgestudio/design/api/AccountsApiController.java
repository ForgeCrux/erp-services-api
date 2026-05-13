package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Account;
import com.probestack.forgestudio.design.model.CreateAccountRequest;
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
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.AccountsService;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-13T10:04:10.160096639Z[GMT]")
@Controller
@RequestMapping("${openapi.eRPServices.base-path:/v1}")
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final AccountsService accountsService;

    @Autowired()
    public AccountsApiController(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    @Override()
    public ResponseEntity<Account> createAccount(@Valid() @RequestBody() CreateAccountRequest createAccountRequest) {
        log.info("Processing createAccount request");
        try {
            var response = accountsService.createAccount(createAccountRequest);
            log.info("createAccount completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createAccount: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Account> getAccount(@PathVariable() String accountId) {
        log.info("Processing getAccount request");
        try {
            var response = accountsService.getAccount(accountId);
            log.info("getAccount completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getAccount: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Account>> listAccounts() {
        log.info("Processing listAccounts request");
        try {
            var response = accountsService.listAccounts();
            log.info("listAccounts completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listAccounts: {}", e.getMessage(), e);
            throw e;
        }
    }
}
