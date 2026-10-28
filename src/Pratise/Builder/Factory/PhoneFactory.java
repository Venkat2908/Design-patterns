package Pratise.Builder.Factory;

public class PhoneFactory {
    public static Phone getfactory(ModelType type){
        if (type.equals(ModelType.IPHONE)){
            return  new Iphone();
        }
        if (type.equals(ModelType.ANDROID)) {

            return new AndroidPhone();
        }
        return null;
    }
}
