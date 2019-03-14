package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //Ustawienie tej klasy jako klasy konfiguracyjnej
@ComponentScan("implementation")  //Przeszukiwanie komponentów. W nawiasie paczka z klasami
@Import(Config.class)  //Importowanie pliku konfiguracyjnego
public class AutoConfig {
}
