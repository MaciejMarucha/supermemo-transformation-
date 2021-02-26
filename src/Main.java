import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {



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
