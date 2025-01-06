package AdapterDesignPattern.Client;

import AdapterDesignPattern.Adaptee.WeightMachine;
import AdapterDesignPattern.Adaptee.WeightMachineForKids;
import AdapterDesignPattern.Adapter.WeightMachineAdapter;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImple;

public class Main {
    public static void main(String[] args) {
        

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImple(new WeightMachineForKids());

        System.out.println(weightMachineAdapter.getWeightInKg());

    }
}
