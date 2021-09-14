package com.example.facegenerator;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Random;

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
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.1), event -> {
            gc.clearRect(0, 0, width, height);
            try {
                drawPrimitiveFace();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }));
        timeline.setCycleCount(360);
        timeline.play();
    }

    public static void drawPrimitiveFace() {
        drawShape();
        drawCheeks();
        drawMouth(50);
        drawEyes();
        drawPupil();
        drawEyebrows();
        drawNose(25);
        drawEars(70);
        drawHair();
        drawHat();
    }


    public static void drawShape() {
        //First Face
        gc.setFill(Color.LIGHTPINK);
        gc.fillOval(150, 150, 300,300);

        //Second Face
        //gc.setFill(Color.GREENYELLOW);
        //gc.fillOval(100,150,300,300);

        //Third Face
        //gc.setFill(Color.PINK);
        //gc.fillOval(100,100,300,400);
    }
    private static void drawCheeks() {
        //First Face
        gc.setFill(Color.HOTPINK);
        gc.fillOval(180,300,50,50);
        gc.fillOval(370, 300, 50, 50);

        //Second face
        //gc.setFill(Color.LIGHTPINK);
        //gc.fillOval(180,300,50,50);
    }

    public static void drawMouth(int mouthSize) {
        //String mood = "Shocked"
        //if (mood.equals("Shocked"))
        //First Face
        gc.setFill(Color.BLACK);
        gc.fillOval(280, 370, mouthSize, mouthSize);

        //Second Face
        //gc.setFill(Color.LIGHTPINK);
        //gc.fillArc(240,340,100,80,10,20, ArcType.ROUND);

        //Third Face
        //gc.setFill(Color.BLACK);
        //gc.fillArc(200, 300, 100, 110, 180, 180, ArcType.OPEN);


    }

    public static void drawEyes() {
        gc.setFill(Color.BLACK);

        //First Face
        String firstFace = "face1";
        gc.fillOval(220,220,20,20);
        gc.fillOval(360,220,20,20);

        //Second Face
        //gc.fillOval(180,200,20,20);
        //gc.fillOval(320,200,20,20);
    }
    private static void drawPupil() {
        gc.setFill(Color.WHITE);

        //First Face
        gc.fillOval(230,230,5,5);
        gc.fillOval(370,230,5,5);

        //Second Face
        //gc.fillOval(190,205,5,5);
        //gc.fillOval(330,205,5,5);
    }

    private static void drawEyebrows() {
        //First Face
        gc.strokeLine(210, 210, 240 , 200);
        gc.strokeLine(350, 200, 380,210);

        //Second Face
        //gc.strokeLine(170,190,210,190);
        //gc.strokeLine(310,190,350,190);
    }
    private static void drawNose(int noseSize) {
        //First Face
        gc.setFill(Color.LIGHTPINK);
        gc.strokeOval(290, 300, noseSize, noseSize);
        gc.fillOval(300,300, noseSize, noseSize);

        //Second face
        //gc.setFill(Color.GREENYELLOW);
        //gc.strokeOval(290,300, noseSize, noseSize);
        //gc.fillOval(280,300, noseSize, noseSize);

        //Third Face
        //gc.strokeArc(200,280,100,80,70,40, ArcType.ROUND);
        //gc.setFill(Color.PINK);
        //gc.fillOval(225,240,50,50);
    }

    private static void drawEars(int earSize) {
        //First Face
        gc.setFill(Color.LIGHTPINK);
        gc.fillOval(150, 150, earSize, earSize);
        gc.fillOval(375,150, earSize, earSize);
        //Auricle
        gc.setFill(Color.BROWN);
        gc.fillOval(165,170,30,31);
        gc.fillOval(395,170,30,31);

        //Second face
        //gc.setFill(Color.GREENYELLOW);
        //gc.fillOval(80,160, earSize, earSize);
    }

    private static void drawHair() {
        //First Face
        gc.setFill(Color.YELLOW);
        gc.fillArc(205, 150,190, 100, 0, 180, ArcType.OPEN);
        gc.strokeLine(220,175,205,200);
        gc.strokeLine(225,173,210,200);
        gc.strokeLine(230,170,215,200);
        gc.strokeLine(235,165,220,200);
        gc.strokeLine(240,165,225,200);

        //Third Face
        //gc.setFill(Color.GRAY);
        //gc.fillArc(155, 102,185, 100, 0, 180, ArcType.OPEN);
    }

    private static void drawHat() {
        //Third Face
        //gc.setFill(Color.BLACK);
        //gc.fillArc(150, 50, 140, 150, 15, 180, ArcType.OPEN);
        //gc.strokeLine(100, 160, 340, 90);
    }


    public static void main(String[] args) {
        Random random = new Random();

        launch();
    }


}