import java.util.Scanner;
// Autor: 
// Datum: 15.04.2021

public class SafeIn {
  
  public static void main(String[] args) {
    
  } // end of main
  
  public static int inInt(String q,String err) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    int i = 0;
    do {
      try {
        System.out.print(q);
        i = in.nextInt();
        invalid = false;
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return i;
  }
  
  public static double inDouble(String q,String err) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    double d = 0;
    do {
      try {
        System.out.print(q);
        d = in.nextDouble();
        invalid = false;
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return d;
  }
  
  public static char inChar(String q,String err) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    char c = 0;
    do {
      try {
        System.out.print(q);
        c = in.next().charAt(0);
        invalid = false;
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return c;
  }
  
  public static long inLong(String q,String err) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    long l = 0;
    do {
      try {
        System.out.print(q);
        l = in.nextLong();
        invalid = false;
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return l;
  }
  
  public static short inShort(String q,String err) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    short s = 0;
    do {
      try {
        System.out.print(q);
        s = in.nextShort();
        invalid = false;
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return s;
  }
  
  public static byte inByte(String q,String err) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    byte b = 0;
    do {
      try {
        System.out.print(q);
        b = in.nextByte();
        invalid = false;
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return b;
  }
  
  public static float inFloat(String q,String err) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    float f = 0;
    do {
      try {
        System.out.print(q);
        f = in.nextFloat();
        invalid = false;
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return f;
  }
  
  public static String inString(String q,String err) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    String s = null;
    do {
      try {
        System.out.print(q);
        s = in.next();
        invalid = false;
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return s;
  }
  
  public static boolean inBoolean(String q,String err) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    boolean b = false;
    String s = null;
    do {
      try {
        System.out.print(q);
        s = in.next();
        invalid = false;
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    switch (s) {
      case "1" : b = true;   break;
      case "ja" : b = true;   break;
      case "Ja" : b = true;   break;
      case "true" : b = true;   break;
      case "True" : b = true;   break;  
      case "Wahr" : b = true;   break;
      case "wahr" : b = true;   break;
      case "yes" : b = true;   break;
      case "Yes" : b = true;   break;
      case "+" : b = true;   break;
      case "richtig" : b = true;   break;
      case "Richtig" : b = true;   break;
      case "K3K5" : 
        b = true;  
        System.out.println("YAY!! Secret! woohoo...");
        break;      
    } // end of switch
    return b;
  }
  
} // end of class SafeIn

