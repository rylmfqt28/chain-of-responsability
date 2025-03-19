package validations_request;

import company.CompanyInformation;
import interfaces.ValidateRequest;
import models.Request;

public class ValidateBudget implements ValidateRequest {
    private ValidateRequest nextValidateRequest;
    private final int MIN_BUDGET = 100;
    private final String MESSAGE_REJECTED = "Request rejected, there is not enough budget to make the purchase";

    @Override
    public void setNextRequestValidation(ValidateRequest nextValidateRequest) {
        this.nextValidateRequest = nextValidateRequest;
    }

    @Override
    public String validateRequest(Request request) {
        int budget = CompanyInformation.company.getBudget();
        if (isBudgetSufficient(budget, request.getEstimatedExpense())) {
            return this.nextValidateRequest.validateRequest(request);
        }

        return MESSAGE_REJECTED;
    }

    private boolean isBudgetSufficient(int budget, int estimatedExpense) {
        int newBudget = budget - estimatedExpense;
        return newBudget > MIN_BUDGET;
    }
}
