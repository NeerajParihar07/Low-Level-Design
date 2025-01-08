package StateDesignPattern.VendingStates;

import java.util.ArrayList;
import java.util.List;


public class IdleState implements State{

    public IdleState() {
        System.out.println("Currently Vending Machine is in IdleState");
    }

    public IdleState(VendingMachine machine)
    {
        System.out.println("In Idle State");
        machine.setCoinList(new ArrayList<>());
    }
    
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductsSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("cannot insert coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("cannot choose a product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new Exception("can not get change in idle state");
    }

    @Override
    public List<Coin> refundFulllMoney(VendingMachine machine) throws Exception {
        throw new Exception("no refund in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("cannot be dispensed in idle state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
