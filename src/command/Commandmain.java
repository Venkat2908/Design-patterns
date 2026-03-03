package command;

public class Commandmain {
    public  static  void main (String [] args){
        Tv tv = new Tv();
        TurnonComman turnon = new TurnonComman(tv);
        Turnoffcommand turnoff = new Turnoffcommand(tv);
        Adjustchannel adjustchannel = new Adjustchannel(tv,5);
        AdjustVolume adjustVolume = new AdjustVolume(tv,6);

        Remotecontrol remotecontrol = new Remotecontrol();
        remotecontrol.setOncommand(turnon);
        remotecontrol.setOffcommand(turnoff);
        remotecontrol.pressonbutton();
        remotecontrol.pressoffbutton();
        adjustchannel.execute();
        adjustVolume.execute();

    }
}
