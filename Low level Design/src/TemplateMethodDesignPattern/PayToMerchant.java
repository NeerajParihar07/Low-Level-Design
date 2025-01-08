package TemplateMethodDesignPattern;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToMerchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount Logic of PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% fee charged");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amount credite to merchant");
    }
}
