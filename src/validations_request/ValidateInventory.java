package validations_request;

import interfaces.ValidateRequest;
import models.Request;

public class ValidateInventory implements ValidateRequest {
    private ValidateRequest nextValidateRequest;
    private final int MIN_STOCK_ALLOWED = 10;
    private final String MESSAGE_REJECTED = "Request rejected, current stock is greater than 10";

    @Override
    public void setNextRequestValidation(ValidateRequest nextValidateRequest) {
        this.nextValidateRequest = nextValidateRequest;
    }

    @Override
    public String validateRequest(Request request) {
        if (request.getRequestedProduct().getStock() < MIN_STOCK_ALLOWED) {
            return this.nextValidateRequest.validateRequest(request);
        }

        return MESSAGE_REJECTED;
    }
}
