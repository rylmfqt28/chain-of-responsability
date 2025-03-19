package validations_request;

import interfaces.ValidateRequest;
import models.Request;

public class ValidateWarranty implements ValidateRequest {
    private ValidateRequest nextValidateRequest;
    private final String MESSAGE_REJECTED = "Request rejected, supplier does not offer warranty on purchased products";
    private final String MESSAGE_ACCEPTED = "Request accepted, we will proceed with the purchase";

    @Override
    public void setNextRequestValidation(ValidateRequest nextValidateRequest) {
        this.nextValidateRequest = nextValidateRequest;
    }

    @Override
    public String validateRequest(Request request) {
        if (request.getSupplier().isOffersWarranty()) {
            return MESSAGE_ACCEPTED;
        }
        return MESSAGE_REJECTED;
    }
}
