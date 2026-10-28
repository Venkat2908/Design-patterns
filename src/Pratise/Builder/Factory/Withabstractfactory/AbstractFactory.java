package Pratise.Builder.Factory.Withabstractfactory;

public class AbstractFactory {
    public  static  void  main (String [] args){
        ThemeFactory light = new DarkTheme();

       Button l1= light.createButton();
       TextField l2 = light.CreateField();

       l1.display();
       l2.display();
    }
}
