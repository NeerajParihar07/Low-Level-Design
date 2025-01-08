package TemplateMethodDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow obj = new PayToFriend();
        PaymentFlow obj2 = new PayToMerchant();

        obj.sendMoney();
        obj2.sendMoney();
    }
}
