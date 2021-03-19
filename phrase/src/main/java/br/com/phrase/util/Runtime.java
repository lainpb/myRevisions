package br.com.phrase.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Runtime {
    
    public static String currentData (){

        var agora = LocalDateTime.now();         
        var formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        return agora.format(formatter);
    }
}
