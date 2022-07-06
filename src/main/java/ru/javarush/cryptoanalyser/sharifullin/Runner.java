package ru.javarush.cryptoanalyser.sharifullin;

import com.sun.tools.javac.Main;
import ru.javarush.cryptoanalyser.sharifullin.app.Application;
import ru.javarush.cryptoanalyser.sharifullin.controller.MainController;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result = application.run(args);
    }
}
