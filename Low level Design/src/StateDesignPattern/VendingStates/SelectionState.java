package StateDesignPattern.VendingStates;

import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.SourceDataLine;


public class SelectionState implements State {
    public SelectionState() {
        System.out.println("Currently Vending Machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("cannot click on insert coin button in Selection State");
    }

    @Override
    public void clickOnStartProductsSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("cannot insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item = machine.getInventory.getItem(codeNumber);

        int paidByUser = 0;
        for(Coin coin: machine.getCoinList){
            paidByUser =  paidByUser + coin.value;
        }


        if(paidByUser < item.getPrice())
        {
            System.out.println("Insufficent amount");
            refundFulllMoney(machine);
            throw new Exception("INsufficient fund");
        }
        else
        {
            if(paidByUser > item.getPrice())
            {
                getChange(paidByUser - item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
         
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("refund the change " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public List<Coin> refundFulllMoney(VendingMachine machine) throws Exception {
        System.out.println(:"Returned the full amount back");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("cannot be dispensed in selection state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw  new Exception("cannot be update in selection state");
    }
}
