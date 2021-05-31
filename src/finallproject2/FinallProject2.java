/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallproject2;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author fadia
 */
public class FinallProject2 {

    private static final double G = 9.8;
    private double startX, startY, ballX, ballY;
    private double xSpeed, ySpeed, lastPointX, lastPointY, range;
    private double time, deltaTime = 0.1;

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getStartX() {
        return startX;
    }

    public void setStartX(double startX) {
        this.startX = startX;
    }

    public double getStartY() {
        return startY;
    }

    public void setStartY(double startY) {
        this.startY = startY;
    }

    public double getBallX() {
        return ballX;
    }

    public void setBallX(double ballX) {
        this.ballX = ballX;
    }

    public double getBallY() {
        return ballY;
    }

    public void setBallY(double ballY) {
        this.ballY = ballY;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double getLastPointX() {
        return lastPointX;
    }

    public void setLastPointX(double lastPointX) {
        this.lastPointX = lastPointX;
    }

    public double getLastPointY() {
        return lastPointY;
    }

    public void setLastPointY(double lastPointY) {
        this.lastPointY = lastPointY;
    }

    public void getUserInput(String angle_txt, String speed_txt) {
        double angle = Double.parseDouble(angle_txt);
        double speed = Double.parseDouble(speed_txt);
        setxSpeed(speed * Math.cos(angle * (Math.PI / 180)));
        setySpeed(speed * Math.sin(angle * (Math.PI / 180)));
    }

    public void moveBall() {
        setBallX(startX + (getxSpeed() * time));
        setBallY(startY - ((getySpeed() * time) - (0.5 * G * Math.pow(time, 2))));
        time += deltaTime;
    }

    public boolean inBounds(double Width, double Height) {
        if (getBallX() > Width || getBallY() > Height) {
            return false;
        }
        return true;
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval((int) (getBallX()), (int) (getBallY()), 10, 10);
        setLastPointX(getBallX());
        setLastPointY(getBallY());
    }

    public FinallProject2(double startX, double startY, double ballX, double ballY, 
            double xSpeed, double ySpeed, double lastPointX, double lastPointY, double range, double time) {
        this.startX = startX;
        this.startY = startY;
        this.ballX = ballX;
        this.ballY = ballY;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.lastPointX = lastPointX;
        this.lastPointY = lastPointY;
        this.range = range;
        this.time = time;
    }
     public FinallProject2() {
        this(0,0,0,0,0,0,0,0,0,0);
    }
   
}
rwesxgvbcfdughfurehbgnkreghjnvkljdhgjrhegurhengfljrheu
        irinananananananan
hjdifhjreihuireh
ghgyhgygytyt gkjkidjusidhshdsuhs
lshvshjshjdsh
jhsjuh

JIKFJEWIFHJEGFHWJUGHREGHURHE