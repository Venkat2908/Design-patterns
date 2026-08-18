package Assignments.builder;

public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    public  MessageBuilder (){
    }


    public  builder1 getbuilder (){
        return  new builder1();
    }

    public class builder1{

       private  MessageBuilder messageBuilder;

       public  builder1(){
           this.messageBuilder = new MessageBuilder();
       }

       public  builder1 setMessagetype (MessageType messageType){
           messageBuilder.messageType = messageType;
           return  this;
       }
       public  builder1 seContent (String content){
           messageBuilder.content = content;
           return  this;

       }
       public  builder1 setSender(String b){
           messageBuilder.sender = b;
           return  this ;
       }
       public builder1 setRecipient (String  b){
           messageBuilder .recipient = b;
           return  this;
       }
       public  builder1 setIsdelivered (boolean b){
           messageBuilder.isDelivered = b;
           return  this;
       }
       public  builder1 setTimestamp (long b){
           messageBuilder.timestamp = b;
           return  this;
       }

       public  MessageBuilder build(){
           return  messageBuilder;
       }

    }
}
