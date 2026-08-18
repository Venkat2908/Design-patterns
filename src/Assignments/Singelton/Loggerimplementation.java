package Assignments.Singelton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Loggerimplementation implements Logger {

    private  static Loggerimplementation instance = null;
    private PrintWriter printWriter;
    private String logfile;


    public Loggerimplementation(){

    }

    public static  Loggerimplementation getInstance(){
        if (instance==null){
            synchronized (Loggerimplementation.class){
                if(instance==null){
                    instance = new Loggerimplementation();
                }
            }
        }
        return instance;
    }

    public static void resetInstance(){
        if (instance !=null){
            instance=null;
        }

    }
    @Override
    public void log(Logger level, String message) {
        if (printWriter!=null){
            printWriter.print(LocalDateTime.now()+ " "+ level +" "+message);
        }

    }

    @Override
    public void setLogFile(String filePath) {

        if (filePath!=null && !filePath.equals(logfile)){
            logfile = filePath;

            if (printWriter!=null){
                printWriter.close();
            }

            try {
                printWriter = new PrintWriter(new FileWriter(logfile,true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    @Override
    public String getLogFile() {
        return logfile;
    }

    @Override
    public void flush() {
        if (printWriter!=null){
            printWriter.flush();
        }

    }

    @Override
    public void close() {
        if (printWriter!=null){
            printWriter.close();
            printWriter=null;
        }

    }
}
