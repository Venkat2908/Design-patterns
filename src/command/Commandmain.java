package command;

public class Commandmain {
    public static void main(String[] args) {

        Tv tv = new  Tv();

        Command command = new TvTurnOn(tv);
        Command command1 = new Adjustvolume(tv,"5");
        RemoteControl remote = new RemoteControl(command);
        remote.remotetvon();
        RemoteControl remote1 = new RemoteControl(command1);
        remote1.remotetvoff();

        RemoteControl remote2 = new RemoteControl(command1,"5");
        remote2.changevol();

    }
}
