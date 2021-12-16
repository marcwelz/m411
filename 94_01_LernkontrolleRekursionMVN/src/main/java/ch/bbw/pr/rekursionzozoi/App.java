package ch.bbw.pr.rekursionzozoi;

/**
 * @author Marc Welz
 * @version 07.12.2021
 */

public class App {
   public static void main(String[] args) {
      Calculator calculator = new Calculator();
      System.out.println("App.main: Aufgabe 1 rekursiv:");
      calculator.rekursivAufgabe1(1,2,6);
      System.out.println("App.main: Aufgabe 1 while-loop:");
      calculator.loopAufgabe1(1,2,6);
      System.out.println();

      System.out.println("App.main: Aufgabe 3 Pack-to-String Ausgangslage");
      String name= "elisabeth.";
      System.out.println(name);
      System.out.println(calculator.packString(name));
      System.out.println();

      System.out.println("App.main: Aufgabe 3 Pack-to-String");
      System.out.println(name);
      System.out.println(calculator.packStringAufgabe3(name));
      System.out.println();

      System.out.println("App.main: Aufgabe 4 Pack-to-String 2fach");
      System.out.println(name);
      System.out.println(calculator.packStringAufgabe4(name, "", 0, 0));

   }
}
