package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controller {
    public TextArea mainTextArea;

    public void clickOnExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void clickNew(ActionEvent actionEvent) {
        mainTextArea.clear();
    }

    public void clickLoad(ActionEvent actionEvent) throws FileNotFoundException {
        String document = "/Users/i.nefedov/Documents/Java Projects/untitled/src/1.txt";
        FileReader fr = new FileReader(document);
        try (BufferedReader br = new BufferedReader(fr)) {
            String s;
            mainTextArea.clear();
            while ((s = br.readLine()) != null) {
                mainTextArea.appendText(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
