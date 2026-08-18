package Assignments.builder;

public class Querybuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;


    private Querybuilder(Querybuilderclass b){
        this.select = b.select;
        this.from = b.from;
        this.where = b.where;
        this.join = b.join;
        this.orderBy = b.orderBy;
        this.groupBy = b.groupBy;
    }

    public Querybuilderclass getbuilder(){
        return  new Querybuilderclass();
    }


    public  class   Querybuilderclass{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;


        public  Querybuilderclass select(String b){
            this.select = b;
            return  this    ;
        }
        public  Querybuilderclass from (String  b){
            this.from = b;
            return  this;
        }
        public  Querybuilderclass where(String b){
            this.where = b;
            return  this;
        }
        public Querybuilderclass join (String  b){
            this.join = b;
            return  this;
        }
        public Querybuilderclass orderby(String b){
            this.orderBy = b;
            return  this;
        }
        public  Querybuilderclass groupby (String b){
            this.groupBy = b;
            return  this;
        }

        public  Querybuilder build (){
            return  new Querybuilder(this);
        }



    }
}
