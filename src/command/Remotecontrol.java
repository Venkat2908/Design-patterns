package command;

public class Remotecontrol {
    private  Command oncommand;
    private  Command offcommand;

    public void setOncommand(Command oncommand){
        this.oncommand= oncommand;
    }
    public  void setOffcommand(Command offcommand){
        this.offcommand = offcommand;
    }
    public  void pressonbutton(){
        oncommand.execute();

    }

    public  void pressoffbutton(){
        offcommand.execute();
    }
}
