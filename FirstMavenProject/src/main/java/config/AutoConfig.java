package config;


import api.IPizza;
import implementation.ExoticPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.List;


@Configuration  //Ustawienie tej klasy jako klasy konfiguracyjnej
@ComponentScan("implementation")  //Przeszukiwanie komponentów. W nawiasie paczka z klasami
@Import(Config.class)  //Importowanie pliku konfiguracyjnego
public class AutoConfig {

    @Bean
    public List<IPizza> listOfPizza(){
        List<IPizza> listOfPizza = new ArrayList<IPizza>();
        listOfPizza.add(new ExoticPizza(15, "exotic"));
        listOfPizza.add(new ExoticPizza(50, "duża"));
        return listOfPizza;
    }

}
