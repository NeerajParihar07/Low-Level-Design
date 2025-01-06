package BridgeDesignPattern.Implementation;

public class Radio implements Device{
    boolean power = false;
    int volume = 0;
    int channel = 0;

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        System.out.println("Radio Power is checked");
        return power;
    }

    @Override
    public void enable() {
        power = true;
    }

    @Override
    public void disable() {
        power = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

   @Override
   public int getChannel() {
       // TODO Auto-generated method stub
       return channel;
   }

   @Override
   public void setChannel(int channel) {
       this.channel = channel;
   }

}
