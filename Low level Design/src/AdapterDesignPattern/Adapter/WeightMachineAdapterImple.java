package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImple implements WeightMachineAdapter{

    WeightMachine weightMachine; // has-a relationship, composition
    // Adapter adapts Adaptee

    public WeightMachineAdapterImple(WeightMachine weightMachine)
    {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg()
    {
        double wp = weightMachine.getWeightInPounds();
        System.out.println("we are sending this value " + wp*.45);
        return wp*.45;
    }
}
