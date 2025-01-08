package StateDesignPattern.VendingStates;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine machine)throws Exception;

    public void clickOnStartProductsSelectionButton(VendingMachine machine)throws Exception;

    public void insertCoin(VendingMachine machine, Coin coin)throws Exception;

    public void chooseProduct(VendingMachine machine, int codeNumber)throws Exception;

    public int getChange(int returnChangeMoney)throws Exception;

    public Item dispenseProduct(VendingMachine machine, int codeNumber)throws Exception;

    public List<Coin> refundFulllMoney(VendingMachine machine)throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber)throws Exception;

}
