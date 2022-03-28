package com.epam.melnikov.app;

import com.epam.melnikov.list.LinkedList;

import static com.epam.melnikov.utilities.StringUtils.join;
import static com.epam.melnikov.utilities.StringUtils.split;
import static com.epam.melnikov.app.MessageUtils.getMessage;
import static com.epam.melnikov.utilities.Utils.isAllPositiveNumbers;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        //LinkedList tokens;
        //tokens = split(getMessage());
        //String result = join(tokens);
        //System.out.println(WordUtils.capitalize(result));

        System.out.println(isAllPositiveNumbers("12", "79"));

    }
}
