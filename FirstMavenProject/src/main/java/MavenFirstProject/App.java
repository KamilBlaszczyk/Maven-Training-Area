package MavenFirstProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Blaszczyk Kamil
 */
// rodzaj beana (typu klasy zarządzanej przez Spring)
@RestController
public class App { // nazwa klasy

    // wskazanie pod jakim adresem dostępna jest metoda
    @RequestMapping("/hello")
    // sygnatura metody
    public String hello() {
        // zwracana wartość przez przeglądarkę
        return "Hello World! :)";
    }

    @RequestMapping("/hey")
    public String hey() {
        // zwracana wartość przez przeglądarkę
        return "Yeah :)";
    }

}
