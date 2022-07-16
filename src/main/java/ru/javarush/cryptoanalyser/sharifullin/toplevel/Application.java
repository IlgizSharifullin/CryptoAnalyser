package ru.javarush.cryptoanalyser.sharifullin.toplevel;

import ru.javarush.cryptoanalyser.sharifullin.entity.Result;
import ru.javarush.cryptoanalyser.sharifullin.controller.MainController;

import java.util.Arrays;

public class Application {
    private final MainController mainController;

    public Application(MainController mainController) {
        this.mainController = mainController;
    }


    public Result run(String[] args) {
        //encode text.txt encoded.txt 45

        String command = args[0]; //encode
        String[] parameters = Arrays.copyOfRange(args, 1, args.length); //text.txt encoded.txt 45
        return mainController.execute(command,parameters);
    }

}
