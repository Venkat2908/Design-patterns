package Factory;

import java.util.Optional;

public class AndroidPhone implements Phone {
    @Override
    public void Display() {
        System.out.println("it prints the Iphone");
    }
}
