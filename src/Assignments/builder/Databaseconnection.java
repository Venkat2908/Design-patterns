package Assignments.builder;

import Assignments.Singelton.DatabaseConnection;

public class Databaseconnection {

    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;


    private  Databaseconnection (builder b){
        this.databaseUrl= b.databaseUrl;
        this.username = b.username;
        this.password = b.password;
        this.maxConnections = b.maxConnections;
        this.enableCache = b.enableCache;
        this.isReadOnly = b.isReadOnly;
    }
    public  static builder getbuilder(){
        return  new builder();
    }

    public  static  class  builder{
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public builder databaseUrl(String b){
            this.databaseUrl = b;
            return this;
        }

        public  builder username(String b){
            this.username = b;
            return this;
        }

        public builder password (String b){
            this.password = b;
            return  this;
        }

        public  builder macConnections(int b){
            this.maxConnections =b;
            return  this;
        }
        public builder enableCache(boolean b){
            this.enableCache=b;
            return this;
        }
        public builder isreadonly (boolean b){
            this.isReadOnly = b;
            return this;
        }

        public Databaseconnection build (){
            return  new Databaseconnection(this);
        }

    }
}
