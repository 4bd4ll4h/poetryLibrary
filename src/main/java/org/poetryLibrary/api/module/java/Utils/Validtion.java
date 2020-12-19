package org.poetryLibrary.api.module.java.Utils;

import java.text.Normalizer;
import java.util.concurrent.ThreadLocalRandom;

public class Validtion {
    public static final int MIN=2;
    public static final int MAX=619516;
    public static boolean validNumber(Integer num){
        return num > 0;
    }
    public static boolean validText(String text){

return true;
    }
    public static Integer random(){
        return  ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
    }

    public static String normalize(String input){

        input = Normalizer.normalize(input, Normalizer.Form.NFKD)
                .replaceAll("\\p{M}", "");

        return input.trim();
    }
}
