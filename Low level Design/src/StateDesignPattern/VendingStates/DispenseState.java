package StateDesignPattern.VendingStates;

import java.util.ArrayList;
import java.util.List;

public class DispenseState {

    DispenseState(VendingMachine machine, int codeNumber)
    {
        System.out.println("In Dispense State");
        dispenseProduct(machine, codeNumber);
    }
    
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("cannot in dispense state");
    }

    @Override
    public void clickOnStartProductsSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("cannot in dispense state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("cannot insert coin in dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("cannot choose a product in dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new Exception("can not get change in dispense state");
    }

    @Override
    public List<Coin> refundFulllMoney(VendingMachine machine) throws Exception {
        throw new Exception("no refund in dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("cannot update in dispense state");
    }

}
