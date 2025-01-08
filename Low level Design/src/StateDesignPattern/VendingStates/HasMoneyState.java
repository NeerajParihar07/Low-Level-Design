package StateDesignPattern.VendingStates;

import java.util.ArrayList;
import java.util.List;


public class HasMoneyState implements State {
    public HasMoneyState() {
        System.out.println("Currently Vending Machine is in IdleState");
    }
    
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductsSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin in hasMoneyState");
        machine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("cannot choose a product in hasMoney state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new Exception("can not get change in hasMoney state");
    }

    @Override
    public List<Coin> refundFulllMoney(VendingMachine machine) throws Exception {
        System.out.println("Refund Initiated");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("cannot be dispensed in hasMoney state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
