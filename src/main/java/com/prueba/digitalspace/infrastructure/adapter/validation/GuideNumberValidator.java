package com.prueba.digitalspace.infrastructure.adapter.validation;

public class GuideNumberValidator {
    public static boolean validPlaque(String guideNumber) {
        return guideNumber != null && guideNumber.matches("^\\d{10}$");
    }
}
