package com.lemoentjiez.mastermind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.TextAlignment;
import javax.swing.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

public class MEvents implements Initializable {

    @FXML
    private String getWord() {
        // y yellow, b blue, g green, r red, z black, x brown
        char[] COLORS = {'Y', 'B', 'G', 'R', 'Z', 'X'};
        Random rand = new Random();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 4; i++) str.append(COLORS[rand.nextInt(0, 6)]);
        System.out.println(str);
        return str.toString();
    }

    private String SEQ = getWord();
    @FXML
    private Circle circ11;
    @FXML
    private Circle circ12;
    @FXML
    private Circle circ13;
    @FXML
    private Circle circ14;
    @FXML
    private Circle circ21;
    @FXML
    private Circle circ22;
    @FXML
    private Circle circ23;
    @FXML
    private Circle circ24;
    @FXML
    private Circle circ31;
    @FXML
    private Circle circ32;
    @FXML
    private Circle circ33;
    @FXML
    private Circle circ34;
    @FXML
    private Circle circ41;
    @FXML
    private Circle circ42;
    @FXML
    private Circle circ43;
    @FXML
    private Circle circ44;
    @FXML
    private Circle circ51;
    @FXML
    private Circle circ52;
    @FXML
    private Circle circ53;
    @FXML
    private Circle circ54;
    @FXML
    private Circle circ61;
    @FXML
    private Circle circ62;
    @FXML
    private Circle circ63;
    @FXML
    private Circle circ64;
    @FXML
    private Circle circ71;
    @FXML
    private Circle circ72;
    @FXML
    private Circle circ73;
    @FXML
    private Circle circ74;
    @FXML
    private Circle circ81;
    @FXML
    private Circle circ82;
    @FXML
    private Circle circ83;
    @FXML
    private Circle circ84;
    @FXML
    private Circle tcirc1;
    @FXML
    private Circle tcirc2;
    @FXML
    private Circle tcirc3;
    @FXML
    private Circle tcirc4;
    @FXML
    private ChoiceBox<String> color1;
    @FXML
    private ChoiceBox<String> color2;
    @FXML
    private ChoiceBox<String> color3;
    @FXML
    private ChoiceBox<String> color4;
    @FXML
    private Label row1;
    @FXML
    private Label row2;
    @FXML
    private Label row3;
    @FXML
    private Label row4;
    @FXML
    private Label row5;
    @FXML
    private Label row6;
    @FXML
    private Label row7;
    @FXML
    private Label row8;
    @FXML
    private Label maintext;
    @FXML
    private Label winsl;
    @FXML
    private Label losesl;
    private final String[] colors = {"YELLOW", "BLUE", "RED", "GREEN", "BLACK", "BROWN"};
    String cc1, cc2, cc3, cc4;
    boolean gameFinished = false;
    int counter = 1;
    int wins = 0;
    int loses = 0;
    public static HashMap<String, Color> str_colors;
    static {
        str_colors = new HashMap<>();
        str_colors.put("YELLOW", Color.YELLOW);
        str_colors.put("BLUE", Color.BLUE);
        str_colors.put("RED", Color.RED);
        str_colors.put("GREEN", Color.GREEN);
        str_colors.put("BLACK", Color.BLACK);
        str_colors.put("BROWN", Color.BROWN);
    }
    public static HashMap<Color, String> str_index;
    static {
        str_index = new HashMap<>();
        str_index.put(Color.YELLOW, "Y");
        str_index.put(Color.BLUE, "B");
        str_index.put(Color.RED, "R");
        str_index.put(Color.GREEN, "G");
        str_index.put(Color.BLACK, "Z");
        str_index.put(Color.BROWN, "X");
    }
    public void startNew() {
        counter = 1;
        gameFinished = false;
        maintext.setText("");
        SEQ = getWord();
        row1.setText("");
        row2.setText("");
        row3.setText("");
        row4.setText("");
        row5.setText("");
        row6.setText("");
        row7.setText("");
        row8.setText("");
        circ11.setFill(Color.web("#e2ecf5"));
        circ12.setFill(Color.web("#e2ecf5"));
        circ13.setFill(Color.web("#e2ecf5"));
        circ14.setFill(Color.web("#e2ecf5"));
        circ21.setFill(Color.web("#e2ecf5"));
        circ22.setFill(Color.web("#e2ecf5"));
        circ23.setFill(Color.web("#e2ecf5"));
        circ24.setFill(Color.web("#e2ecf5"));
        circ31.setFill(Color.web("#e2ecf5"));
        circ32.setFill(Color.web("#e2ecf5"));
        circ33.setFill(Color.web("#e2ecf5"));
        circ34.setFill(Color.web("#e2ecf5"));
        circ41.setFill(Color.web("#e2ecf5"));
        circ42.setFill(Color.web("#e2ecf5"));
        circ43.setFill(Color.web("#e2ecf5"));
        circ44.setFill(Color.web("#e2ecf5"));
        circ51.setFill(Color.web("#e2ecf5"));
        circ52.setFill(Color.web("#e2ecf5"));
        circ53.setFill(Color.web("#e2ecf5"));
        circ54.setFill(Color.web("#e2ecf5"));
        circ61.setFill(Color.web("#e2ecf5"));
        circ62.setFill(Color.web("#e2ecf5"));
        circ63.setFill(Color.web("#e2ecf5"));
        circ64.setFill(Color.web("#e2ecf5"));
        circ71.setFill(Color.web("#e2ecf5"));
        circ72.setFill(Color.web("#e2ecf5"));
        circ73.setFill(Color.web("#e2ecf5"));
        circ74.setFill(Color.web("#e2ecf5"));
        circ81.setFill(Color.web("#e2ecf5"));
        circ82.setFill(Color.web("#e2ecf5"));
        circ83.setFill(Color.web("#e2ecf5"));
        circ84.setFill(Color.web("#e2ecf5"));
    }
    public void cheat() {
        maintext.setText(SEQ);
    }
    public void enter() {
        winsl.setText("Wins: " + wins);
        losesl.setText("Loses: " + loses);
        if (counter == -1 || gameFinished) {
            startNew();
            return;
        }
        if (counter <= 8 && counter > 0) {
            if (!Objects.equals(cc1, null) && !Objects.equals(cc2, null) && !Objects.equals(cc3, null) && !Objects.equals(cc4, null) &&
            !Objects.equals(cc1, "") && !Objects.equals(cc2, "") && !Objects.equals(cc3, "") && !Objects.equals(cc4, "")) {
                tcirc1.setFill(Color.web("#e2ecf5"));
                tcirc2.setFill(Color.web("#e2ecf5"));
                tcirc3.setFill(Color.web("#e2ecf5"));
                tcirc4.setFill(Color.web("#e2ecf5"));
                if (counter == 1) {
                    circ11.setFill(str_colors.get(cc1));
                    circ12.setFill(str_colors.get(cc2));
                    circ13.setFill(str_colors.get(cc3));
                    circ14.setFill(str_colors.get(cc4));
                }
                if (counter == 2) {
                    circ21.setFill(str_colors.get(cc1));
                    circ22.setFill(str_colors.get(cc2));
                    circ23.setFill(str_colors.get(cc3));
                    circ24.setFill(str_colors.get(cc4));
                }
                if (counter == 3) {
                    circ31.setFill(str_colors.get(cc1));
                    circ32.setFill(str_colors.get(cc2));
                    circ33.setFill(str_colors.get(cc3));
                    circ34.setFill(str_colors.get(cc4));
                }
                if (counter == 4) {
                    circ41.setFill(str_colors.get(cc1));
                    circ42.setFill(str_colors.get(cc2));
                    circ43.setFill(str_colors.get(cc3));
                    circ44.setFill(str_colors.get(cc4));
                }
                if (counter == 5) {
                    circ51.setFill(str_colors.get(cc1));
                    circ52.setFill(str_colors.get(cc2));
                    circ53.setFill(str_colors.get(cc3));
                    circ54.setFill(str_colors.get(cc4));
                }
                if (counter == 6) {
                    circ61.setFill(str_colors.get(cc1));
                    circ62.setFill(str_colors.get(cc2));
                    circ63.setFill(str_colors.get(cc3));
                    circ64.setFill(str_colors.get(cc4));
                }
                if (counter == 7) {
                    circ71.setFill(str_colors.get(cc1));
                    circ72.setFill(str_colors.get(cc2));
                    circ73.setFill(str_colors.get(cc3));
                    circ74.setFill(str_colors.get(cc4));
                }
                if (counter == 8) {
                    circ81.setFill(str_colors.get(cc1));
                    circ82.setFill(str_colors.get(cc2));
                    circ83.setFill(str_colors.get(cc3));
                    circ84.setFill(str_colors.get(cc4));
                }
                checkColors();
                cc1 = "";
                cc2 = "";
                cc3 = "";
                cc4 = "";
                color1.setValue("");
                color2.setValue("");
                color3.setValue("");
                color4.setValue("");
                counter++;
                tcirc1.setFill(Color.web("#e2ecf5"));
                tcirc2.setFill(Color.web("#e2ecf5"));
                tcirc3.setFill(Color.web("#e2ecf5"));
                tcirc4.setFill(Color.web("#e2ecf5"));
            }
        } else if (counter >= 8) {
            counter = -1;
            loses++;
            maintext.setTextFill(Color.RED);
            maintext.setText("YOU LOST :(  TO PLAY AGAIN PRESS ENTER...");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        color1.getItems().addAll(colors);
        color1.setOnAction(this::updateColor1);
        color2.getItems().addAll(colors);
        color2.setOnAction(this::updateColor2);
        color3.getItems().addAll(colors);
        color3.setOnAction(this::updateColor3);
        color4.getItems().addAll(colors);
        color4.setOnAction(this::updateColor4);
        winsl.setText("Wins: " + wins);
        losesl.setText("Loses: " + loses);
    }
    public void updateColor1(ActionEvent e) {
        cc1 = color1.getValue();
        tcirc1.setFill(str_colors.get(cc1));
    }
    public void updateColor2(ActionEvent e) {
        cc2 = color2.getValue();
        tcirc2.setFill(str_colors.get(cc2));
    }
    public void updateColor3(ActionEvent e) {
        cc3 = color3.getValue();
        tcirc3.setFill(str_colors.get(cc3));
    }
    public void updateColor4(ActionEvent e) {
        cc4 = color4.getValue();
        tcirc4.setFill(str_colors.get(cc4));
    }
    public void checkColors() {
        String created = str_index.get(str_colors.get(cc1)) + str_index.get(str_colors.get(cc2)) +
                str_index.get(str_colors.get(cc3)) + str_index.get(str_colors.get(cc4));
        updateGame(created);
    }
    public void updateGame(String crt) {
        int count = 0;
        for (int i = 0; i < 4; i++)
            if (crt.charAt(i) == SEQ.charAt(i)) count++;
        if (counter == 1) row1.setText(count + " right");
        if (counter == 2) row2.setText(count + " right");
        if (counter == 3) row3.setText(count + " right");
        if (counter == 4) row4.setText(count + " right");
        if (counter == 5) row5.setText(count + " right");
        if (counter == 6) row6.setText(count + " right");
        if (counter == 7) row7.setText(count + " right");
        if (counter == 8) row8.setText(count + " right");
        if (count == 4) {
            maintext.setTextFill(Color.GREEN);
            wins++;
            maintext.setText("YOU WON! TO PLAY AGAIN PRESS ENTER...");
            counter = -1;
            gameFinished = true;
        }
    }
}
