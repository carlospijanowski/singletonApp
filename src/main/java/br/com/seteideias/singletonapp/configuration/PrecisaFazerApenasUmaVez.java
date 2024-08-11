package br.com.seteideias.singletonapp.configuration;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Slf4j
@Configuration
public class PrecisaFazerApenasUmaVez {

    private static PrecisaFazerApenasUmaVez getInstance;

    public static void apenasUmaVez(){
        synchronized (PrecisaFazerApenasUmaVez.class){
            if (Objects.isNull(getInstance)){
                log.info("criando a primeira vez");
                getInstance = new PrecisaFazerApenasUmaVez();
                return;
            }
        }
                log.info("ja existe instancia");
    }



}
