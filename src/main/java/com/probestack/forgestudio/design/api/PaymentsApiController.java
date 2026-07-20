package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.PaymentRequest;
import com.probestack.forgestudio.design.model.PaymentResponse;
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
import com.probestack.forgestudio.design.service.PaymentsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-07-20T08:54:29.402912306Z[GMT]")
@Controller
@RequestMapping("${openapi.eRPServices.base-path:/v1}")
public class PaymentsApiController implements PaymentsApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentsApiController.class);

    private final PaymentsService paymentsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public PaymentsApiController(PaymentsService paymentsService, GeneratedRequestValidator generatedRequestValidator) {
        this.paymentsService = paymentsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<PaymentResponse> createPayment(@RequestBody() PaymentRequest paymentRequest) {
        log.info("Processing createPayment request");
        try {
            generatedRequestValidator.validate("createPayment", paymentRequest);
            var response = paymentsService.createPayment(paymentRequest);
            log.info("createPayment completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createPayment: {}", e.getMessage(), e);
            throw e;
        }
    }
}
