package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

 public static void main(String[] args) {
  Point p1 = new Point(10.0, 12.0);
  Point p2 = new Point(13.0, 16.0);
  System.out.println("Distance from point A(" + p1.x + "," + p1.y + ") " + "to B(" + p2.x + "," + p2.y + ")" + " = " + p2.distance(p1));
 }

}