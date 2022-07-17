package ru.javarush.cryptoanalyser.sharifullin.costants;

public class Strings {
    private static final String rus = "אבגדהו¸זחטיךכלםמןנסעףפץצקשרüתû‎‏ÿ";
    private static final String eng = "qwertyuiopasdfghjklzxcvbnm";
    private static final String cyphers = "1234567890";
    private static final String symbols = "\n!@:;]['#$%^&*()_-? ";
    public static final String ALPHABET = rus + rus.toUpperCase() + eng + eng.toUpperCase()+ cyphers
            + cyphers.toUpperCase() + symbols;
}
