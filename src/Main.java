import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
<<<<<<< Updated upstream
        Interfejs interfejs = new Klasaimplementujaca();
        System.out.println(Klasaimplementujaca.class);
        Object obj = interfejs;
        Class<?> cl = obj.getClass();

=======
>>>>>>> Stashed changes

    }
}
interface Interfejs {
    private void metodaPrywatna(String a) {
        System.out.println(a);
    }
    static int metodaStatyczna() {
        return 1;
    }

    default void metodaDomyslna() {
        System.out.println("metoda domyslna");
        metodaPrywatna("Elo");
    }
    int zwroc();
    int poleprywatne = 10;
}
class Klasaimplementujaca implements Interfejs{
    @Override
    public int zwroc() {
        return 10;
    }

}
