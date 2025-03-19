package interfaces;

import models.Request;

public interface ValidateRequest {
    void setNextRequestValidation (ValidateRequest nextValidateRequest);
    String validateRequest(Request request);
}
