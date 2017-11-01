package br.com.myhouse;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        String value = "Bla Bla Bla";
        String capitalize = StringUtils.deleteWhitespace(value);
        System.out.println(capitalize);

        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "renault");
        try {
            String s = objectMapper.writeValueAsString(car);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
