package br.com.seteideias.singletonapp.configuration;


import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class PrecisaFazerApenasUmaVez {

    private static PrecisaFazerApenasUmaVez getInstance;

    public static void apenasUmaVez(){
        synchronized (PrecisaFazerApenasUmaVez.class){
            if (Objects.isNull(getInstance)){
                log.info("criando a primeira vez");
                getInstance = new PrecisaFazerApenasUmaVez();
                //TODO CRIE OU CHAME METODOS PARA SEREM EXECUTADOS APENAS UMA VEZ AQUI
                log.info("TODO CRIE OU CHAME METODOS PARA SEREM EXECUTADOS APENAS UMA VEZ AQUI");
                return;
            }
        }
                log.info("ja existe instancia");
    }



}
