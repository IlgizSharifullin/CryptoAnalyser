package ru.javarush.cryptoanalyser.sharifullin.commands;

import ru.javarush.cryptoanalyser.sharifullin.entity.Result;
import ru.javarush.cryptoanalyser.sharifullin.entity.ResultCode;
import ru.javarush.cryptoanalyser.sharifullin.exception.ApplicationException;
import ru.javarush.cryptoanalyser.sharifullin.util.PathFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static ru.javarush.cryptoanalyser.sharifullin.costants.Strings.ALPHABET;

public class Decoder implements Action {
    @Override
    public Result execute(String[] parameters) {
        String fileToDec = parameters[0];
        String decodedFile = parameters[1];
        int code = Integer.parseInt(parameters[2]);
        Path pathRead = Path.of(PathFinder.getRoot() + fileToDec);
        Path pathWrite = Path.of(PathFinder.getRoot() + decodedFile);
        try {
            String read = Files.readString(pathRead);
            StringBuilder write = new StringBuilder();
            for (int i = 0; i < read.length(); i++) {
                int numberofletter = ALPHABET.indexOf(read.charAt(i));
                int deVal = (numberofletter - code) % ALPHABET.length();
                if (deVal < 0){
                    deVal = ALPHABET.length() + deVal;
                }
                char value = ALPHABET.charAt(deVal);
                write.append(value);
            }
            Files.writeString(pathWrite, write.toString());
        } catch (IOException e) {
            throw new ApplicationException("IO error", e);
        }
        return new Result(ResultCode.OK, "The file is encoded. Path for file " + pathWrite);
    }
}
