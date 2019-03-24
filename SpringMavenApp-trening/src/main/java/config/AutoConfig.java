package config;

import api.IPancake;
import implementation.PancakeStandard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("implementation")
@Import(Config.class)
public class AutoConfig {

    @Bean
    public List<IPancake> listOfPancake(){
        List<IPancake> listOfPancake = new ArrayList<>();
        listOfPancake.add(new PancakeStandard(8, "mały"));
        listOfPancake.add(new PancakeStandard(16, "średni"));
        return listOfPancake;
    }

}
