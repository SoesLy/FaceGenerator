package com.example.facegenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static int width = 600;
    static int height = 600;
    static Canvas canvas = new Canvas(width, height);
    static GraphicsContext gc = canvas.getGraphicsContext2D();


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Group root = new Group();
        Scene scene = new Scene(root, width, height);
        stage.setTitle("Face");
        stage.setScene(scene);

        gc.clearRect(0, 0, width, height);
        root.getChildren().add(canvas);

        drawPrimitiveFace();

        stage.show();
    }
    public static void drawPrimitiveFace() {
        drawShape();
        drawCheeks();
        drawHair();
        drawMouth(50);
        drawEyes();
        drawEyebrows();
        drawNose(25);
        drawEars(70);
        drawPupil();
    }

    private static void drawNose(int noseSize) {
        gc.setFill(Color.LIGHTPINK);
        gc.strokeOval(290, 300, noseSize, noseSize);
        gc.fillOval(300,300, noseSize, noseSize);
    }


    private static void drawEars(int earSize) {
        gc.setFill(Color.LIGHTPINK);
        gc.fillOval(150, 150, earSize, earSize);
        gc.fillOval(375,150, earSize, earSize);
    }

    public static void drawShape() {
        gc.setFill(Color.LIGHTPINK);
        gc.fillOval(150, 150, 300,300);
    }
    private static void drawCheeks() {
        gc.setFill(Color.HOTPINK);
        gc.fillOval(180,300,50,50);
        gc.fillOval(370, 300, 50, 50);
    }
    private static void drawHair() {
        gc.setFill(Color.YELLOW);
        gc.fillOval(10,18,30,31);
    }

    public static void drawMouth(int mouthSize) {
        //String mood = "Shocked"
        //if (mood.equals("Shocked"))
        gc.setFill(Color.BLACK);
        gc.fillOval(280, 370, mouthSize, mouthSize);

    }

    public static void drawEyes() {
        gc.setFill(Color.BLACK);
        gc.fillOval(220,220,20,20);
        gc.fillOval(360,220,20,20);
    }
    private static void drawPupil() {
        gc.setFill(Color.WHITE);
        gc.fillOval(230,230,5,5);
        gc.fillOval(370,230,5,5);
    }

    private static void drawEyebrows() {
        gc.strokeLine(210, 210, 240 , 200);
        gc.strokeLine(350, 200, 380,210);
    }


    public static void main(String[] args) {

        launch();
    }


}