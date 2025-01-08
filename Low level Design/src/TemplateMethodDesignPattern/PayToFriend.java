package TemplateMethodDesignPattern;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit Amount Logic of PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fee charged");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amount credite to friend");
    }
}
