package Pratise.Builder.command;

public class Turnoffcommand implements Command {
    private Tv tv;

    public  Turnoffcommand (Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
    tv.tvoff();
    }
}
