package com.epam.melnikov.utilities;

import by.epamtc.melnikov.util.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... args) {
        for (String number : args) {
            if (!StringUtils.isPositiveNumber(number))
                return false;
        }
        return true;
    }

}
