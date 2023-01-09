package com.lemoentjiez.mastermind;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.media.AudioClip;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import javax.swing.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

public class MEvents implements Initializable {
    int currentPos1 = -1;
    int currentPos2 = -1;
    int currentPos3 = -1;
    int currentPos4 = -1;
    @FXML
    private String getWord() {
        // y yellow, b blue, g green, r red, z black, x brown
        // this comment is made ->
        // -> to accomplish ->
        // -> 1000 lines of code
        // hehehhehe
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
    private Circle sm11;
    @FXML
    private Circle sm12;
    @FXML
    private Circle sm13;
    @FXML
    private Circle sm14;
    @FXML
    private Circle sm21;
    @FXML
    private Circle sm22;
    @FXML
    private Circle sm23;
    @FXML
    private Circle sm24;
    @FXML
    private Circle sm31;
    @FXML
    private Circle sm32;
    @FXML
    private Circle sm33;
    @FXML
    private Circle sm34;
    @FXML
    private Circle sm41;
    @FXML
    private Circle sm42;
    @FXML
    private Circle sm43;
    @FXML
    private Circle sm44;
    @FXML
    private Circle sm51;
    @FXML
    private Circle sm52;
    @FXML
    private Circle sm53;
    @FXML
    private Circle sm54;
    @FXML
    private Circle sm61;
    @FXML
    private Circle sm62;
    @FXML
    private Circle sm63;
    @FXML
    private Circle sm64;
    @FXML
    private Circle sm71;
    @FXML
    private Circle sm72;
    @FXML
    private Circle sm73;
    @FXML
    private Circle sm74;
    @FXML
    private Circle sm81;
    @FXML
    private Circle sm82;
    @FXML
    private Circle sm83;
    @FXML
    private Circle sm84;
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
    @FXML
    private ImageView winimg;
    @FXML
    private ImageView loseimg;
    private final String[] colors = {"YELLOW", "BLUE", "RED", "GREEN", "ZBLACK", "XBROWN"};
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
        str_colors.put("ZBLACK", Color.BLACK);
        str_colors.put("XBROWN", Color.BROWN);
    }
    public static HashMap<String, Integer> str_colors_c;
    static {
        str_colors_c = new HashMap<>();
        str_colors_c.put("W", -1);
        str_colors_c.put("Y", 0);
        str_colors_c.put("B", 1);
        str_colors_c.put("R", 2);
        str_colors_c.put("G", 3);
        str_colors_c.put("Z", 4);
        str_colors_c.put("X", 5);
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
    public static HashMap<Integer, Color> str_color_index;
    static {
        str_color_index = new HashMap<>();
        str_color_index.put(-1, Color.WHITE);
        str_color_index.put(0, Color.YELLOW);
        str_color_index.put(1, Color.BLUE);
        str_color_index.put(2, Color.RED);
        str_color_index.put(3, Color.GREEN);
        str_color_index.put(4, Color.BLACK);
        str_color_index.put(5, Color.BROWN);
    }

    public static HashMap<Integer, String> str_color_string;
    static {
        str_color_string = new HashMap<>();
        str_color_string.put(-1, "W");
        str_color_string.put(0, "Y");
        str_color_string.put(1, "B");
        str_color_string.put(2, "R");
        str_color_string.put(3, "G");
        str_color_string.put(4, "Z");
        str_color_string.put(5, "X");
    }

    public static HashMap<String, Integer> str_color_string_reverse;
    static {
        str_color_string_reverse = new HashMap<>();
        str_color_string_reverse.put("W", -1);
        str_color_string_reverse.put("Y", 0);
        str_color_string_reverse.put("B", 1);
        str_color_string_reverse.put("R", 2);
        str_color_string_reverse.put("G", 3);
        str_color_string_reverse.put("Z", 4);
        str_color_string_reverse.put("X", 5);
    }

    public static HashMap<Character, String> str_color_names;
    static {
        str_color_names = new HashMap<>();
        str_color_names.put('W', "WHITE");
        str_color_names.put('Y', "YELLOW");
        str_color_names.put('B', "BLUE");
        str_color_names.put('R', "RED");
        str_color_names.put('G', "GREEN");
        str_color_names.put('Z', "BLACK");
        str_color_names.put('X', "BROWN");
    }
    public void startNew() {
        tcirc1.setFill(Color.web("#e2ecf5"));
        tcirc2.setFill(Color.web("#e2ecf5"));
        tcirc3.setFill(Color.web("#e2ecf5"));
        tcirc4.setFill(Color.web("#e2ecf5"));
        counter = 1;
        currentPos1 = -1;
        currentPos2 = -1;
        currentPos3 = -1;
        currentPos4 = -1;
        circ11.setOpacity(1);
        circ12.setOpacity(1);
        circ13.setOpacity(1);
        circ14.setOpacity(1);
        circ21.setOpacity(1);
        circ22.setOpacity(1);
        circ23.setOpacity(1);
        circ24.setOpacity(1);
        circ31.setOpacity(1);
        circ32.setOpacity(1);
        circ33.setOpacity(1);
        circ34.setOpacity(1);
        circ41.setOpacity(1);
        circ42.setOpacity(1);
        circ43.setOpacity(1);
        circ44.setOpacity(1);
        circ51.setOpacity(1);
        circ52.setOpacity(1);
        circ53.setOpacity(1);
        circ54.setOpacity(1);
        circ61.setOpacity(1);
        circ62.setOpacity(1);
        circ63.setOpacity(1);
        circ64.setOpacity(1);
        circ71.setOpacity(1);
        circ72.setOpacity(1);
        circ73.setOpacity(1);
        circ74.setOpacity(1);
        circ81.setOpacity(1);
        circ82.setOpacity(1);
        circ83.setOpacity(1);
        circ84.setOpacity(1);
        sm11.setOpacity(1);
        sm12.setOpacity(1);
        sm13.setOpacity(1);
        sm14.setOpacity(1);
        sm21.setOpacity(1);
        sm22.setOpacity(1);
        sm23.setOpacity(1);
        sm24.setOpacity(1);
        sm31.setOpacity(1);
        sm32.setOpacity(1);
        sm33.setOpacity(1);
        sm34.setOpacity(1);
        sm41.setOpacity(1);
        sm42.setOpacity(1);
        sm43.setOpacity(1);
        sm44.setOpacity(1);
        sm51.setOpacity(1);
        sm52.setOpacity(1);
        sm53.setOpacity(1);
        sm54.setOpacity(1);
        sm61.setOpacity(1);
        sm62.setOpacity(1);
        sm63.setOpacity(1);
        sm64.setOpacity(1);
        sm71.setOpacity(1);
        sm72.setOpacity(1);
        sm73.setOpacity(1);
        sm74.setOpacity(1);
        sm81.setOpacity(1);
        sm82.setOpacity(1);
        sm83.setOpacity(1);
        sm84.setOpacity(1);
        sm11.setFill(Color.WHITE);
        sm12.setFill(Color.WHITE);
        sm13.setFill(Color.WHITE);
        sm14.setFill(Color.WHITE);
        sm21.setFill(Color.WHITE);
        sm22.setFill(Color.WHITE);
        sm23.setFill(Color.WHITE);
        sm24.setFill(Color.WHITE);
        sm31.setFill(Color.WHITE);
        sm32.setFill(Color.WHITE);
        sm33.setFill(Color.WHITE);
        sm34.setFill(Color.WHITE);
        sm41.setFill(Color.WHITE);
        sm42.setFill(Color.WHITE);
        sm43.setFill(Color.WHITE);
        sm44.setFill(Color.WHITE);
        sm51.setFill(Color.WHITE);
        sm52.setFill(Color.WHITE);
        sm53.setFill(Color.WHITE);
        sm54.setFill(Color.WHITE);
        sm61.setFill(Color.WHITE);
        sm62.setFill(Color.WHITE);
        sm63.setFill(Color.WHITE);
        sm64.setFill(Color.WHITE);
        sm71.setFill(Color.WHITE);
        sm72.setFill(Color.WHITE);
        sm73.setFill(Color.WHITE);
        sm74.setFill(Color.WHITE);
        sm81.setFill(Color.WHITE);
        sm82.setFill(Color.WHITE);
        sm83.setFill(Color.WHITE);
        sm84.setFill(Color.WHITE);
        row1.setOpacity(1);
        row2.setOpacity(1);
        row3.setOpacity(1);
        row4.setOpacity(1);
        row5.setOpacity(1);
        row6.setOpacity(1);
        row7.setOpacity(1);
        row8.setOpacity(1);
        winimg.setOpacity(0);
        loseimg.setOpacity(0);
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
        String cheatCode = "";
        for (int i = 0; i < SEQ.length(); i++) {
            cheatCode += str_color_names.get(SEQ.charAt(i)) + " ";
        }
        maintext.setText(cheatCode);
        maintext.setTextFill(Color.AQUAMARINE);
    }
    public void enter() {
        winsl.setText("Wins: " + wins);
        losesl.setText("Loses: " + loses);
        if (counter == -1 || gameFinished) {
            startNew();
            return;
        }
        if (counter <= 8 && counter > 0) {
            if (!Objects.equals(currentPos1, null) && !Objects.equals(currentPos2, null) && !Objects.equals(currentPos3, null) && !Objects.equals(currentPos4, null) &&
            !Objects.equals(currentPos1, -1) && !Objects.equals(currentPos2, -1) && !Objects.equals(currentPos3, -1) && !Objects.equals(currentPos4, -1)) {
                FadeTransition ft1 = new FadeTransition(Duration.millis(500), circ11);
                FadeTransition ft2 = new FadeTransition(Duration.millis(500), circ12);
                FadeTransition ft3 = new FadeTransition(Duration.millis(500), circ13);
                FadeTransition ft4 = new FadeTransition(Duration.millis(500), circ14);
                FadeTransition ft5 = new FadeTransition(Duration.millis(500), circ21);
                FadeTransition ft6 = new FadeTransition(Duration.millis(500), circ22);
                FadeTransition ft7 = new FadeTransition(Duration.millis(500), circ23);
                FadeTransition ft8 = new FadeTransition(Duration.millis(500), circ24);
                FadeTransition ft9 = new FadeTransition(Duration.millis(500), circ31);
                FadeTransition ft10 = new FadeTransition(Duration.millis(500), circ32);
                FadeTransition ft11 = new FadeTransition(Duration.millis(500), circ33);
                FadeTransition ft12 = new FadeTransition(Duration.millis(500), circ34);
                FadeTransition ft13 = new FadeTransition(Duration.millis(500), circ41);
                FadeTransition ft14 = new FadeTransition(Duration.millis(500), circ42);
                FadeTransition ft15 = new FadeTransition(Duration.millis(500), circ43);
                FadeTransition ft16 = new FadeTransition(Duration.millis(500), circ44);
                FadeTransition ft17 = new FadeTransition(Duration.millis(500), circ51);
                FadeTransition ft18 = new FadeTransition(Duration.millis(500), circ52);
                FadeTransition ft19 = new FadeTransition(Duration.millis(500), circ53);
                FadeTransition ft20 = new FadeTransition(Duration.millis(500), circ54);
                FadeTransition ft21 = new FadeTransition(Duration.millis(500), circ61);
                FadeTransition ft22 = new FadeTransition(Duration.millis(500), circ62);
                FadeTransition ft23 = new FadeTransition(Duration.millis(500), circ63);
                FadeTransition ft24 = new FadeTransition(Duration.millis(500), circ64);
                FadeTransition ft25 = new FadeTransition(Duration.millis(500), circ71);
                FadeTransition ft26 = new FadeTransition(Duration.millis(500), circ72);
                FadeTransition ft27 = new FadeTransition(Duration.millis(500), circ73);
                FadeTransition ft28 = new FadeTransition(Duration.millis(500), circ74);
                FadeTransition ft29 = new FadeTransition(Duration.millis(500), circ81);
                FadeTransition ft30 = new FadeTransition(Duration.millis(500), circ82);
                FadeTransition ft31 = new FadeTransition(Duration.millis(500), circ83);
                FadeTransition ft32 = new FadeTransition(Duration.millis(500), circ84);
                ft1.setFromValue(1.0);
                ft1.setToValue(0.3);
                ft1.setCycleCount(2);
                ft1.setAutoReverse(true);
                ft2.setFromValue(1.0);
                ft2.setToValue(0.3);
                ft2.setCycleCount(2);
                ft2.setAutoReverse(true);
                ft3.setFromValue(1.0);
                ft3.setToValue(0.3);
                ft3.setCycleCount(2);
                ft3.setAutoReverse(true);
                ft4.setFromValue(1.0);
                ft4.setToValue(0.3);
                ft4.setCycleCount(2);
                ft4.setAutoReverse(true);
                ft5.setFromValue(1.0);
                ft5.setToValue(0.3);
                ft5.setCycleCount(2);
                ft5.setAutoReverse(true);
                ft6.setFromValue(1.0);
                ft6.setToValue(0.3);
                ft6.setCycleCount(2);
                ft6.setAutoReverse(true);
                ft7.setFromValue(1.0);
                ft7.setToValue(0.3);
                ft7.setCycleCount(2);
                ft7.setAutoReverse(true);
                ft8.setFromValue(1.0);
                ft8.setToValue(0.3);
                ft8.setCycleCount(2);
                ft8.setAutoReverse(true);
                ft9.setFromValue(1.0);
                ft9.setToValue(0.3);
                ft9.setCycleCount(2);
                ft9.setAutoReverse(true);
                ft10.setFromValue(1.0);
                ft10.setToValue(0.3);
                ft10.setCycleCount(2);
                ft10.setAutoReverse(true);
                ft11.setFromValue(1.0);
                ft11.setToValue(0.3);
                ft11.setCycleCount(2);
                ft11.setAutoReverse(true);
                ft12.setFromValue(1.0);
                ft12.setToValue(0.3);
                ft12.setCycleCount(2);
                ft12.setAutoReverse(true);
                ft13.setFromValue(1.0);
                ft13.setToValue(0.3);
                ft13.setCycleCount(2);
                ft13.setAutoReverse(true);
                ft14.setFromValue(1.0);
                ft14.setToValue(0.3);
                ft14.setCycleCount(2);
                ft14.setAutoReverse(true);
                ft15.setFromValue(1.0);
                ft15.setToValue(0.3);
                ft15.setCycleCount(2);
                ft15.setAutoReverse(true);
                ft16.setFromValue(1.0);
                ft16.setToValue(0.3);
                ft16.setCycleCount(2);
                ft16.setAutoReverse(true);
                ft17.setFromValue(1.0);
                ft17.setToValue(0.3);
                ft17.setCycleCount(2);
                ft17.setAutoReverse(true);
                ft18.setFromValue(1.0);
                ft18.setToValue(0.3);
                ft18.setCycleCount(2);
                ft18.setAutoReverse(true);
                ft19.setFromValue(1.0);
                ft19.setToValue(0.3);
                ft19.setCycleCount(2);
                ft19.setAutoReverse(true);
                ft20.setFromValue(1.0);
                ft20.setToValue(0.3);
                ft20.setCycleCount(2);
                ft20.setAutoReverse(true);
                ft21.setFromValue(1.0);
                ft21.setToValue(0.3);
                ft21.setCycleCount(2);
                ft21.setAutoReverse(true);
                ft22.setFromValue(1.0);
                ft22.setToValue(0.3);
                ft22.setCycleCount(2);
                ft22.setAutoReverse(true);
                ft23.setFromValue(1.0);
                ft23.setToValue(0.3);
                ft23.setCycleCount(2);
                ft23.setAutoReverse(true);
                ft24.setFromValue(1.0);
                ft24.setToValue(0.3);
                ft24.setCycleCount(2);
                ft24.setAutoReverse(true);
                ft25.setFromValue(1.0);
                ft25.setToValue(0.3);
                ft25.setCycleCount(2);
                ft25.setAutoReverse(true);
                ft26.setFromValue(1.0);
                ft26.setToValue(0.3);
                ft26.setCycleCount(2);
                ft26.setAutoReverse(true);
                ft27.setFromValue(1.0);
                ft27.setToValue(0.3);
                ft27.setCycleCount(2);
                ft27.setAutoReverse(true);
                ft28.setFromValue(1.0);
                ft28.setToValue(0.3);
                ft28.setCycleCount(2);
                ft28.setAutoReverse(true);
                ft29.setFromValue(1.0);
                ft29.setToValue(0.3);
                ft29.setCycleCount(2);
                ft29.setAutoReverse(true);
                ft30.setFromValue(1.0);
                ft30.setToValue(0.3);
                ft30.setCycleCount(2);
                ft30.setAutoReverse(true);
                ft31.setFromValue(1.0);
                ft31.setToValue(0.3);
                ft31.setCycleCount(2);
                ft31.setAutoReverse(true);
                ft32.setFromValue(1.0);
                ft32.setToValue(0.3);
                ft32.setCycleCount(2);
                ft32.setAutoReverse(true);
                tcirc1.setFill(Color.web("#e2ecf5"));
                tcirc2.setFill(Color.web("#e2ecf5"));
                tcirc3.setFill(Color.web("#e2ecf5"));
                tcirc4.setFill(Color.web("#e2ecf5"));
                if (counter == 1) {
                    if (currentPos1 == str_colors_c.get(Character.toString(SEQ.charAt(0)))) sm11.setFill(str_color_index.get(currentPos1));
                    if (currentPos2 == str_colors_c.get(Character.toString(SEQ.charAt(1)))) sm12.setFill(str_color_index.get(currentPos2));
                    if (currentPos3 == str_colors_c.get(Character.toString(SEQ.charAt(2)))) sm13.setFill(str_color_index.get(currentPos3));
                    if (currentPos4 == str_colors_c.get(Character.toString(SEQ.charAt(3)))) sm14.setFill(str_color_index.get(currentPos4));
                    circ11.setFill(str_color_index.get(currentPos1));
                    circ12.setFill(str_color_index.get(currentPos2));
                    circ13.setFill(str_color_index.get(currentPos3));
                    circ14.setFill(str_color_index.get(currentPos4));
                    ft1.play();
                    ft2.play();
                    ft3.play();
                    ft4.play();
                }
                if (counter == 2) {
                    if (currentPos1 == str_colors_c.get(Character.toString(SEQ.charAt(0)))) sm21.setFill(str_color_index.get(currentPos1));
                    if (currentPos2 == str_colors_c.get(Character.toString(SEQ.charAt(1)))) sm22.setFill(str_color_index.get(currentPos2));
                    if (currentPos3 == str_colors_c.get(Character.toString(SEQ.charAt(2)))) sm23.setFill(str_color_index.get(currentPos3));
                    if (currentPos4 == str_colors_c.get(Character.toString(SEQ.charAt(3)))) sm24.setFill(str_color_index.get(currentPos4));
                    circ21.setFill(str_color_index.get(currentPos1));
                    circ22.setFill(str_color_index.get(currentPos2));
                    circ23.setFill(str_color_index.get(currentPos3));
                    circ24.setFill(str_color_index.get(currentPos4));
                    ft5.play();
                    ft6.play();
                    ft7.play();
                    ft8.play();
                }
                if (counter == 3) {
                    if (currentPos1 == str_colors_c.get(Character.toString(SEQ.charAt(0)))) sm31.setFill(str_color_index.get(currentPos1));
                    if (currentPos2 == str_colors_c.get(Character.toString(SEQ.charAt(1)))) sm32.setFill(str_color_index.get(currentPos2));
                    if (currentPos3 == str_colors_c.get(Character.toString(SEQ.charAt(2)))) sm33.setFill(str_color_index.get(currentPos3));
                    if (currentPos4 == str_colors_c.get(Character.toString(SEQ.charAt(3)))) sm34.setFill(str_color_index.get(currentPos4));
                    circ31.setFill(str_color_index.get(currentPos1));
                    circ32.setFill(str_color_index.get(currentPos2));
                    circ33.setFill(str_color_index.get(currentPos3));
                    circ34.setFill(str_color_index.get(currentPos4));
                    ft9.play();
                    ft10.play();
                    ft11.play();
                    ft12.play();
                }
                if (counter == 4) {
                    if (currentPos1 == str_colors_c.get(Character.toString(SEQ.charAt(0)))) sm41.setFill(str_color_index.get(currentPos1));
                    if (currentPos2 == str_colors_c.get(Character.toString(SEQ.charAt(1)))) sm42.setFill(str_color_index.get(currentPos2));
                    if (currentPos3 == str_colors_c.get(Character.toString(SEQ.charAt(2)))) sm43.setFill(str_color_index.get(currentPos3));
                    if (currentPos4 == str_colors_c.get(Character.toString(SEQ.charAt(3)))) sm44.setFill(str_color_index.get(currentPos4));
                    circ41.setFill(str_color_index.get(currentPos1));
                    circ42.setFill(str_color_index.get(currentPos2));
                    circ43.setFill(str_color_index.get(currentPos3));
                    circ44.setFill(str_color_index.get(currentPos4));
                    ft13.play();
                    ft14.play();
                    ft15.play();
                    ft16.play();
                }
                if (counter == 5) {
                    if (currentPos1 == str_colors_c.get(Character.toString(SEQ.charAt(0)))) sm51.setFill(str_color_index.get(currentPos1));
                    if (currentPos2 == str_colors_c.get(Character.toString(SEQ.charAt(1)))) sm52.setFill(str_color_index.get(currentPos2));
                    if (currentPos3 == str_colors_c.get(Character.toString(SEQ.charAt(2)))) sm53.setFill(str_color_index.get(currentPos3));
                    if (currentPos4 == str_colors_c.get(Character.toString(SEQ.charAt(3)))) sm54.setFill(str_color_index.get(currentPos4));
                    circ51.setFill(str_color_index.get(currentPos1));
                    circ52.setFill(str_color_index.get(currentPos2));
                    circ53.setFill(str_color_index.get(currentPos3));
                    circ54.setFill(str_color_index.get(currentPos4));
                    ft17.play();
                    ft18.play();
                    ft19.play();
                    ft20.play();
                }
                if (counter == 6) {
                    if (currentPos1 == str_colors_c.get(Character.toString(SEQ.charAt(0)))) sm61.setFill(str_color_index.get(currentPos1));
                    if (currentPos2 == str_colors_c.get(Character.toString(SEQ.charAt(1)))) sm62.setFill(str_color_index.get(currentPos2));
                    if (currentPos3 == str_colors_c.get(Character.toString(SEQ.charAt(2)))) sm63.setFill(str_color_index.get(currentPos3));
                    if (currentPos4 == str_colors_c.get(Character.toString(SEQ.charAt(3)))) sm64.setFill(str_color_index.get(currentPos4));
                    circ61.setFill(str_color_index.get(currentPos1));
                    circ62.setFill(str_color_index.get(currentPos2));
                    circ63.setFill(str_color_index.get(currentPos3));
                    circ64.setFill(str_color_index.get(currentPos4));
                    ft21.play();
                    ft22.play();
                    ft23.play();
                    ft24.play();
                }
                if (counter == 7) {
                    if (currentPos1 == str_colors_c.get(Character.toString(SEQ.charAt(0)))) sm71.setFill(str_color_index.get(currentPos1));
                    if (currentPos2 == str_colors_c.get(Character.toString(SEQ.charAt(1)))) sm72.setFill(str_color_index.get(currentPos2));
                    if (currentPos3 == str_colors_c.get(Character.toString(SEQ.charAt(2)))) sm73.setFill(str_color_index.get(currentPos3));
                    if (currentPos4 == str_colors_c.get(Character.toString(SEQ.charAt(3)))) sm74.setFill(str_color_index.get(currentPos4));
                    circ71.setFill(str_color_index.get(currentPos1));
                    circ72.setFill(str_color_index.get(currentPos2));
                    circ73.setFill(str_color_index.get(currentPos3));
                    circ74.setFill(str_color_index.get(currentPos4));
                    ft25.play();
                    ft26.play();
                    ft27.play();
                    ft28.play();
                }
                if (counter == 8) {
                    if (currentPos1 == str_colors_c.get(Character.toString(SEQ.charAt(0)))) sm81.setFill(str_color_index.get(currentPos1));
                    if (currentPos2 == str_colors_c.get(Character.toString(SEQ.charAt(1)))) sm82.setFill(str_color_index.get(currentPos2));
                    if (currentPos3 == str_colors_c.get(Character.toString(SEQ.charAt(2)))) sm83.setFill(str_color_index.get(currentPos3));
                    if (currentPos4 == str_colors_c.get(Character.toString(SEQ.charAt(3)))) sm84.setFill(str_color_index.get(currentPos4));
                    circ81.setFill(str_color_index.get(currentPos1));
                    circ82.setFill(str_color_index.get(currentPos2));
                    circ83.setFill(str_color_index.get(currentPos3));
                    circ84.setFill(str_color_index.get(currentPos4));
                    ft29.play();
                    ft30.play();
                    ft31.play();
                    ft32.play();
                }
                checkColors();
                cc1 = "";
                cc2 = "";
                cc3 = "";
                cc4 = "";
                counter++;
                tcirc1.setFill(Color.web("#e2ecf5"));
                tcirc2.setFill(Color.web("#e2ecf5"));
                tcirc3.setFill(Color.web("#e2ecf5"));
                tcirc4.setFill(Color.web("#e2ecf5"));
            }
        } else if (counter >= 8) {
            counter = -1;
            tcirc1.setFill(Color.web("#e2ecf5"));
            tcirc2.setFill(Color.web("#e2ecf5"));
            tcirc3.setFill(Color.web("#e2ecf5"));
            tcirc4.setFill(Color.web("#e2ecf5"));
            loses++;
            sm11.setOpacity(0);
            sm12.setOpacity(0);
            sm13.setOpacity(0);
            sm14.setOpacity(0);
            sm21.setOpacity(0);
            sm22.setOpacity(0);
            sm23.setOpacity(0);
            sm24.setOpacity(0);
            sm31.setOpacity(0);
            sm32.setOpacity(0);
            sm33.setOpacity(0);
            sm34.setOpacity(0);
            sm41.setOpacity(0);
            sm42.setOpacity(0);
            sm43.setOpacity(0);
            sm44.setOpacity(0);
            sm51.setOpacity(0);
            sm52.setOpacity(0);
            sm53.setOpacity(0);
            sm54.setOpacity(0);
            sm61.setOpacity(0);
            sm62.setOpacity(0);
            sm63.setOpacity(0);
            sm64.setOpacity(0);
            sm71.setOpacity(0);
            sm72.setOpacity(0);
            sm73.setOpacity(0);
            sm74.setOpacity(0);
            sm81.setOpacity(0);
            sm82.setOpacity(0);
            sm83.setOpacity(0);
            sm84.setOpacity(0);
            circ11.setOpacity(0);
            circ12.setOpacity(0);
            circ13.setOpacity(0);
            circ14.setOpacity(0);
            circ21.setOpacity(0);
            circ22.setOpacity(0);
            circ23.setOpacity(0);
            circ24.setOpacity(0);
            circ31.setOpacity(0);
            circ32.setOpacity(0);
            circ33.setOpacity(0);
            circ34.setOpacity(0);
            circ41.setOpacity(0);
            circ42.setOpacity(0);
            circ43.setOpacity(0);
            circ44.setOpacity(0);
            circ51.setOpacity(0);
            circ52.setOpacity(0);
            circ53.setOpacity(0);
            circ54.setOpacity(0);
            circ61.setOpacity(0);
            circ62.setOpacity(0);
            circ63.setOpacity(0);
            circ64.setOpacity(0);
            circ71.setOpacity(0);
            circ72.setOpacity(0);
            circ73.setOpacity(0);
            circ74.setOpacity(0);
            circ81.setOpacity(0);
            circ82.setOpacity(0);
            circ83.setOpacity(0);
            circ84.setOpacity(0);
            row1.setOpacity(0);
            row2.setOpacity(0);
            row3.setOpacity(0);
            row4.setOpacity(0);
            row5.setOpacity(0);
            row6.setOpacity(0);
            row7.setOpacity(0);
            row8.setOpacity(0);
            loseimg.setOpacity(1);
            maintext.setTextFill(Color.RED);
            maintext.setText("TO PLAY AGAIN PRESS ENTER...");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tcirc1.setOnMouseClicked(event -> {
            currentPos1++;
            if (currentPos1 > 5) currentPos1 = 0;
            tcirc1.setFill(str_color_index.get(currentPos1));
        });
        tcirc2.setOnMouseClicked(event -> {
            currentPos2++;
            if (currentPos2 > 5) currentPos2 = 0;
            tcirc2.setFill(str_color_index.get(currentPos2));
        });
        tcirc3.setOnMouseClicked(event -> {
            currentPos3++;
            if (currentPos3 > 5) currentPos3 = 0;
            tcirc3.setFill(str_color_index.get(currentPos3));
        });
        tcirc4.setOnMouseClicked(event -> {
            currentPos4++;
            if (currentPos4 > 5) currentPos4 = 0;
            tcirc4.setFill(str_color_index.get(currentPos4));
        });
        maintext.setTextFill(Color.AQUAMARINE);
        maintext.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        winsl.setText("Wins: " + wins);
        winsl.setTextFill(Color.AQUAMARINE);
        losesl.setTextFill(Color.AQUAMARINE);
        winsl.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        losesl.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        row1.setTextFill(Color.AQUAMARINE);
        row2.setTextFill(Color.AQUAMARINE);
        row3.setTextFill(Color.AQUAMARINE);
        row4.setTextFill(Color.AQUAMARINE);
        row5.setTextFill(Color.AQUAMARINE);
        row6.setTextFill(Color.AQUAMARINE);
        row7.setTextFill(Color.AQUAMARINE);
        row8.setTextFill(Color.AQUAMARINE);
        row1.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        row2.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        row3.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        row4.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        row5.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        row6.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        row7.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        row8.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
        sm11.setFill(Color.WHITE);
        sm12.setFill(Color.WHITE);
        sm13.setFill(Color.WHITE);
        sm14.setFill(Color.WHITE);
        sm21.setFill(Color.WHITE);
        sm22.setFill(Color.WHITE);
        sm23.setFill(Color.WHITE);
        sm24.setFill(Color.WHITE);
        sm31.setFill(Color.WHITE);
        sm32.setFill(Color.WHITE);
        sm33.setFill(Color.WHITE);
        sm34.setFill(Color.WHITE);
        sm41.setFill(Color.WHITE);
        sm42.setFill(Color.WHITE);
        sm43.setFill(Color.WHITE);
        sm44.setFill(Color.WHITE);
        sm51.setFill(Color.WHITE);
        sm52.setFill(Color.WHITE);
        sm53.setFill(Color.WHITE);
        sm54.setFill(Color.WHITE);
        sm61.setFill(Color.WHITE);
        sm62.setFill(Color.WHITE);
        sm63.setFill(Color.WHITE);
        sm64.setFill(Color.WHITE);
        sm71.setFill(Color.WHITE);
        sm72.setFill(Color.WHITE);
        sm73.setFill(Color.WHITE);
        sm74.setFill(Color.WHITE);
        sm81.setFill(Color.WHITE);
        sm82.setFill(Color.WHITE);
        sm83.setFill(Color.WHITE);
        sm84.setFill(Color.WHITE);
        losesl.setText("Loses: " + loses);
    }
    public void checkColors() {
        String created = str_color_string.get(currentPos1) + str_color_string.get(currentPos2) +
                str_color_string.get(currentPos3) + str_color_string.get(currentPos4);
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
        currentPos1 = -1;
        currentPos2 = -1;
        currentPos3 = -1;
        currentPos4 = -1;
        if (count == 4) {
            maintext.setTextFill(Color.GREEN);
            wins++;
            tcirc1.setFill(Color.web("#e2ecf5"));
            tcirc2.setFill(Color.web("#e2ecf5"));
            tcirc3.setFill(Color.web("#e2ecf5"));
            tcirc4.setFill(Color.web("#e2ecf5"));
            row1.setOpacity(0);
            row2.setOpacity(0);
            row3.setOpacity(0);
            row4.setOpacity(0);
            row5.setOpacity(0);
            row6.setOpacity(0);
            row7.setOpacity(0);
            row8.setOpacity(0);
            winimg.setOpacity(1);
            circ11.setOpacity(0);
            circ12.setOpacity(0);
            circ13.setOpacity(0);
            circ14.setOpacity(0);
            circ21.setOpacity(0);
            circ22.setOpacity(0);
            circ23.setOpacity(0);
            circ24.setOpacity(0);
            circ31.setOpacity(0);
            circ32.setOpacity(0);
            circ33.setOpacity(0);
            circ34.setOpacity(0);
            circ41.setOpacity(0);
            circ42.setOpacity(0);
            circ43.setOpacity(0);
            circ44.setOpacity(0);
            circ51.setOpacity(0);
            circ52.setOpacity(0);
            circ53.setOpacity(0);
            circ54.setOpacity(0);
            circ61.setOpacity(0);
            circ62.setOpacity(0);
            circ63.setOpacity(0);
            circ64.setOpacity(0);
            circ71.setOpacity(0);
            circ72.setOpacity(0);
            circ73.setOpacity(0);
            circ74.setOpacity(0);
            circ81.setOpacity(0);
            circ82.setOpacity(0);
            circ83.setOpacity(0);
            circ84.setOpacity(0);
            sm11.setOpacity(0);
            sm12.setOpacity(0);
            sm13.setOpacity(0);
            sm14.setOpacity(0);
            sm21.setOpacity(0);
            sm22.setOpacity(0);
            sm23.setOpacity(0);
            sm24.setOpacity(0);
            sm31.setOpacity(0);
            sm32.setOpacity(0);
            sm33.setOpacity(0);
            sm34.setOpacity(0);
            sm41.setOpacity(0);
            sm42.setOpacity(0);
            sm43.setOpacity(0);
            sm44.setOpacity(0);
            sm51.setOpacity(0);
            sm52.setOpacity(0);
            sm53.setOpacity(0);
            sm54.setOpacity(0);
            sm61.setOpacity(0);
            sm62.setOpacity(0);
            sm63.setOpacity(0);
            sm64.setOpacity(0);
            sm71.setOpacity(0);
            sm72.setOpacity(0);
            sm73.setOpacity(0);
            sm74.setOpacity(0);
            sm81.setOpacity(0);
            sm82.setOpacity(0);
            sm83.setOpacity(0);
            sm84.setOpacity(0);
            maintext.setText("TO PLAY AGAIN PRESS ENTER...");
            counter = -1;
            gameFinished = true;
        }
    }
}
