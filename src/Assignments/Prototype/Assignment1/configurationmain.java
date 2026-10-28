package Assignments.Prototype.Assignment1;

public class configurationmain {
    public  static  void main (String [] args){

        Configuration c1 = new Configuration();
        c1.setThemeColor("Blue");
        c1.setAutoSave(true);
        c1.setLanguage("English");
        c1.setDarkMode(false);
        c1.setFontSize(14);
        c1.setFontFamily("Arial");
        c1.setType(ConfigurationType.CUSTOM);
        Configuration c2 = new Configuration();

        c2.setThemeColor("Green");
        c2.setAutoSave(true);
        c2.setLanguage("German");
        c2.setDarkMode(true);
        c2.setFontSize(16);
        c2.setFontFamily("Roboto");
        c2.setType(ConfigurationType.BASIC);
        Configuration c3 = new Configuration();

        c3.setThemeColor("Purple");
        c3.setAutoSave(false);
        c3.setLanguage("French");
        c3.setDarkMode(true);
        c3.setFontSize(18);
        c3.setFontFamily("Times New Roman");
        c3.setType(ConfigurationType.ADVANCED);

        try {
            Configuration c4 =  c1.clone();
            System.out.println(System.identityHashCode(c1));
            System.out.println(System.identityHashCode(c4));



        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }




    }
}
