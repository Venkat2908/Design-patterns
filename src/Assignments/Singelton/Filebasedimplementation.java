package Assignments.Singelton;

public class Filebasedimplementation extends FileBasedconfiguration {

    private static  Filebasedimplementation instance = null;

    public  Filebasedimplementation(){
        super();
    }


    @Override
    public String getConfiguration(String key) {

        return (String) properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        return (convert((String) properties.get(key),type));
    }

    @Override
    public void setConfiguration(String key, String value) {

        if (!getProperties().containsKey(key)){
            properties.put(key,value);
        }else {
            properties.replace(key,value);
        }

    }

    @Override
    public <T> void setConfiguration(String key, T value) {

        if (getProperties().containsKey(key)){
            properties.put(key,value);
        }else {
            properties.replace(key,value);

        }

    }

    @Override
    public void removeConfiguration(String key) {

        if (getProperties().containsKey(key)){
            properties.remove(key);
        }

    }

    @Override
    public void clear() {
        properties.clear();
    }

    public  static Filebasedimplementation getInstance(){

        if (instance==null){
            synchronized (Filebasedimplementation.class){
                if (instance==null){

                    instance = new Filebasedimplementation();
                }
            }
        }
        return instance;
    }

    public  static void resetInstance(){
        instance = null;
    }
}
