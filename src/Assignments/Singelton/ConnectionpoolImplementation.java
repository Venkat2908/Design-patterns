package Assignments.Singelton;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class ConnectionpoolImplementation implements  ConnectionPool {

    private   static  ConnectionPool instance = null;
     private int maxconnections ;
     public List<DatabaseConnection> availableconnections;

     public ConnectionpoolImplementation(int maxconnections){
         this.maxconnections = maxconnections;
         this.availableconnections = new ArrayList<>(maxconnections);
     }

     public static synchronized ConnectionPool getinstance (int maxconnections){

         if (instance==null){
             instance = new ConnectionpoolImplementation(maxconnections);
         }
         return instance;

     }

     public  static  void reseinstance(){

         if (instance!=null){
             instance = null;

         }
     }

    @Override
    public void initializePool() {

         for (int i =0;i<maxconnections;i++){
             DatabaseConnection connection = createConnection();
             availableconnections.add(connection);
         }

    }

    private DatabaseConnection createConnection(){
         return  new DatabaseConnection();
    }

    @Override
    public DatabaseConnection getConnection() {

         if (availableconnections.isEmpty()){
             throw new RuntimeException("No available conncetion present");
         }
        return availableconnections.removeFirst();
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {

         if (connection!=null && availableconnections.size()< maxconnections){
             availableconnections.add(connection);
         }

    }

    @Override
    public int getAvailableConnectionsCount() {
        return availableconnections.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxconnections;
    }
}
