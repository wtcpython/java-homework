// Exercise14_09
package com.wtc;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class MyFan extends Pane {
    public MyFan() {
        setPrefSize(1500, 1500);
    }

    private void paint() {
        double radius = Math.min(getWidth(), getHeight()) / 2 * 0.8;
        double fanRadius = radius * 0.8;
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        getChildren().clear();

        Circle circle = new Circle(centerX, centerY, radius);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        getChildren().add(circle);

        for (int i = 0; i < 4; i++) {
            Arc arc = new Arc(centerX, centerY, fanRadius, fanRadius, i * 90 + 30, 30);
            arc.setFill(Color.RED);
            arc.setType(ArcType.ROUND);
            getChildren().add(arc);
        }
    }

    @Override
    protected void setWidth(double value) {
        super.setWidth(value);
        paint();
    }

    @Override
    protected void setHeight(double value) {
        super.setHeight(value);
        paint();
    }
}
