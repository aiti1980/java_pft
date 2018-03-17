package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

 public static void main(String[] args) {
  Point p1 = new Point();
  Point p2 = new Point();
  p1.a=12.0;
  p1.b=14.0;
  p2.c=18.0;
  p2.d=18.0;

  System.out.println("Distance from point A(" + p1.a +"," + p1.b +") "+ "to B(" +  + p2.c +"," + p2.d +")" + " = " + distance(p1,p2));

 }
 public static double distance (Point p1, Point p2)

 {
  return Math.sqrt(Math.pow(p2.c - p1.a,2) + Math.pow(p2.d-p1.b,2));

 }

}