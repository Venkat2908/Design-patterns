package command;

public class RemoteControl {

    private Command command ;
    private String value;
    public RemoteControl(Command command) {
        this.command = command;
    }

    public RemoteControl(Command com,String value) {
        this.command = com;
        this.value = value;

    }

    public void remotetvon() {
        command.execute();
    }
    public void remotetvoff() {
        command.execute();
    }

    public void changevol() {
        command.execute();
    }

    public void changechannel() {
        command.execute();
    }

}
