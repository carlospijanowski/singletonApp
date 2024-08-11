package br.com.seteideias.singletonapp;

import br.com.seteideias.singletonapp.configuration.PrecisaFazerApenasUmaVez;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingletonAppApplication.class, args);

        PrecisaFazerApenasUmaVez.apenasUmaVez();
        PrecisaFazerApenasUmaVez.apenasUmaVez(); // tentando mandar executar uma segunda vez
        PrecisaFazerApenasUmaVez.apenasUmaVez(); // tentando mandar executar uma terceira vez

    }

}
