package com.prueba.digitalspace.infrastructure.adapter.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlaqueValidator {
    public static boolean validPlaque(String vehicleNumber) {
        String valid = "^[A-Z]{3}\\d{3}$";

        Pattern pattern = Pattern.compile(valid);

        Matcher matcher = pattern.matcher(vehicleNumber);
        return matcher.matches();
    }
    public static boolean validFleet(String vehicleNumber){
        String valid = "^[A-Z]{3}\\d{4}[A-Z]$";

        Pattern pattern = Pattern.compile(valid);

        Matcher matcher = pattern.matcher(vehicleNumber);
        return matcher.matches();
    }
}
