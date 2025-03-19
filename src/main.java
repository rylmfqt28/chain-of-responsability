import interfaces.ValidateRequest;
import models.Product;
import models.Request;
import models.Supplier;
import validations_request.ValidateBudget;
import validations_request.ValidateInventory;
import validations_request.ValidateWarranty;

public class main {
    public static void main(String[] args) {
        Product product = new Product("Laptop HP", 4, 800);
        Supplier supplier = new Supplier("HP Latam", true);
        Request request = new Request(product,10, 6000, supplier);

        String responseRequest = validateRequest(request);
        System.out.println(responseRequest);
    }

    private static String validateRequest(Request request) {
        ValidateRequest validateInventory = new ValidateInventory();
        ValidateRequest validateBudget = new ValidateBudget();
        ValidateRequest validateWarranty = new ValidateWarranty();

        validateInventory.setNextRequestValidation(validateBudget);
        validateBudget.setNextRequestValidation(validateWarranty);

        return validateInventory.validateRequest(request);
    }
}
