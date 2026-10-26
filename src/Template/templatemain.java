package Template;

public class templatemain {
    public static void main(String[] args) {

        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        tea.prepare();
        coffee.prepare();

    }
}
