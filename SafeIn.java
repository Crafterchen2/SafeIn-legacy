import java.util.Scanner;
// Autor: 
// Datum: 15.04.2021

public class SafeIn {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("V5");
    System.out.println("\n--- --- --- Zusammenfassung --- --- ---\n");
    System.out.println("Jede Methode dieser Klasse arbeitet folgenderweise:");
    System.out.println("1. Der String 'q' wird gedruckt");
    System.out.println("2. Benutzereingabe in gleicher zeile");
    System.out.println("Bei Falscher eingabe wird 'err' gedruckt und eine erneute Eingabe verlangt.");
    System.out.println("\n --- --- --- Infos zu den eweiterten 'Limit' Methoden --- --- ---\n");
    System.out.println("die Variablen 'minVal' und 'maxVal' werden nur berücksichtigt, wenn die dazugehörigen Boolschen Werte ('limitMin' & 'limitMax') true sind.");
    System.out.println("Ist der vom Benutzer eingegebener Wert nicht zwischen diesen beiden Werten, wird 'err' gedruckt und eine erneute Eingabe verlangt.");
    System.out.println("\n--- --- ---Inhalt: --- --- ---\n");
    System.out.println("1. inIntLimit /// String q, String err, boolean limitMin, int minVal, boolean limitMax, int maxVal");
    System.out.println("2. inDoubleLimit /// String q, String err, boolean limitMin, double minVal, boolean limitMax, double maxVal");
    System.out.println("3. inLongLimit /// String q, String err, boolean limitMin, long minVal, boolean limitMax, long maxVal");
    System.out.println("4. inShortLimit /// String q, String err, boolean limitMin, short minVal, boolean limitMax, short maxVal");
    System.out.println("5. inByteLimit /// String q, String err, boolean limitMin, byte minVal, boolean limitMax, byte maxVal");
    System.out.println("6. inFloatLimit /// String q, String err, boolean limitMin, float minVal, boolean limitMax, float maxVal");
    System.out.println("7. inInt /// String q, String err");
    System.out.println("8. inDouble /// String q, String err");
    System.out.println("9. inChar /// String q, String err");
    System.out.println("10. inLong /// String q, String err");
    System.out.println("11. inShort /// String q, String err");
    System.out.println("12. inByte /// String q, String err");
    System.out.println("13. inFloat /// String q, String err");
    System.out.println("14. inString /// String q, String err");
    System.out.println("15. inBoolean /// String q, String err");
    
    System.out.print("Für mehr info Zahl eingeben: ");
    switch (in.nextInt()) {
      case 1 : 
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        System.out.println("boolean limitMin /// Falls false wird der 'minVal' wert ignoriert.");
        System.out.println("int minVal /// Es wird 'err' gedruckt falls eingabe >= wert");
        System.out.println("boolean limitMax /// Falls false wird der 'maxVal' wert ignoriert.");
        System.out.println("int maxVal /// Es wird 'err' gedruckt falls eingabe <= wert");
        break; 
      case 2 : 
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");  
        System.out.println("boolean limitMin /// Falls false wird der 'minVal' wert ignoriert.");
        System.out.println("int minVal /// Es wird 'err' gedruckt falls eingabe >= wert");
        System.out.println("boolean limitMax /// Falls false wird der 'maxVal' wert ignoriert.");
        System.out.println("int maxVal /// Es wird 'err' gedruckt falls eingabe <= wert");
        break; 
      case 3 : 
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");  
        System.out.println("boolean limitMin /// Falls false wird der 'minVal' wert ignoriert.");
        System.out.println("int minVal /// Es wird 'err' gedruckt falls eingabe >= wert");
        System.out.println("boolean limitMax /// Falls false wird der 'maxVal' wert ignoriert.");
        System.out.println("int maxVal /// Es wird 'err' gedruckt falls eingabe <= wert");
        break; 
      case 4 : 
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");  
        System.out.println("boolean limitMin /// Falls false wird der 'minVal' wert ignoriert.");
        System.out.println("int minVal /// Es wird 'err' gedruckt falls eingabe >= wert");
        System.out.println("boolean limitMax /// Falls false wird der 'maxVal' wert ignoriert.");
        System.out.println("int maxVal /// Es wird 'err' gedruckt falls eingabe <= wert");
        break;
      case 5 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");   
        System.out.println("boolean limitMin /// Falls false wird der 'minVal' wert ignoriert.");
        System.out.println("int minVal /// Es wird 'err' gedruckt falls eingabe >= wert");
        System.out.println("boolean limitMax /// Falls false wird der 'maxVal' wert ignoriert.");
        System.out.println("int maxVal /// Es wird 'err' gedruckt falls eingabe <= wert");
        break;
      case 6 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");   
        System.out.println("boolean limitMin /// Falls false wird der 'minVal' wert ignoriert.");
        System.out.println("int minVal /// Es wird 'err' gedruckt falls eingabe >= wert");
        System.out.println("boolean limitMax /// Falls false wird der 'maxVal' wert ignoriert.");
        System.out.println("int maxVal /// Es wird 'err' gedruckt falls eingabe <= wert");
        break;
      case 7 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        break;
      case 8 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        break;
      case 9 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        break;
      case 10 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        break;
      case 11 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        break;
      case 12 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        break;
      case 13 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        break;
      case 14 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        break;
      case 15 :
        System.out.println("\nString q /// Text, der vor dem Benutzerinput geschrieben wird.");
        System.out.println("String err /// Text, der bei falscher Eingabe geschrieben wird.");
        break; 
      default: 
        System.out.println("Nicht Vorhanden."); 
    }
  } // end of main
    
  public static int inIntLimit(String q,String err,boolean limitMin,int minVal,boolean limitMax,int maxVal) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    int i = 0;
    do {
      try {
        System.out.print(q);
        i = in.nextInt();
        if (( (!limitMin) && (!limitMax) ) || ( (limitMin && (i>=minVal) ) && (limitMax && (i<=maxVal) ) ) || (((!limitMin) && (!(i>=minVal)) ) && (i<=maxVal)) || (((!limitMax) && (!(i<=maxVal)) ) && (i>=minVal))
        ) {
          invalid = false;
        } else {
          System.out.println(err); 
          in = new Scanner(System.in);
        } // end of if-else// end of if
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return i;
  }
  
  public static double inDoubleLimit(String q,String err,boolean limitMin,double minVal,boolean limitMax,double maxVal) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    double d = 0;
    do {
      try {
        System.out.print(q);
        d = in.nextDouble();
        if (( (!limitMin) && (!limitMax) ) || ( (limitMin && (d>=minVal) ) && (limitMax && (d<=maxVal) ) ) || (((!limitMin) && (!(d>=minVal)) ) && (d<=maxVal)) || (((!limitMax) && (!(d<=maxVal)) ) && (d>=minVal))
        ) {
          invalid = false;
        } else {
          System.out.println(err); 
          in = new Scanner(System.in);
        } // end of if-else// end of if
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return d;
  }

  public static long inLongLimit(String q,String err,boolean limitMin,long minVal,boolean limitMax,long maxVal) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    long l = 0;
    do {
      try {
        System.out.print(q);
        l = in.nextLong();
        if (( (!limitMin) && (!limitMax) ) || ( (limitMin && (l>=minVal) ) && (limitMax && (l<=maxVal) ) ) || (((!limitMin) && (!(l>=minVal)) ) && (l<=maxVal)) || (((!limitMax) && (!(l<=maxVal)) ) && (l>=minVal))
        ) {
          invalid = false;
        } else {
          System.out.println(err); 
          in = new Scanner(System.in);
        } // end of if-else// end of if
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return l;
  }

  public static short inShortLimit(String q,String err,boolean limitMin,short minVal,boolean limitMax,short maxVal) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    short s = 0;
    do {
      try {
        System.out.print(q);
        s = in.nextShort();
        if (( (!limitMin) && (!limitMax) ) || ( (limitMin && (s>=minVal) ) && (limitMax && (s<=maxVal) ) ) || (((!limitMin) && (!(s>=minVal)) ) && (s<=maxVal)) || (((!limitMax) && (!(s<=maxVal)) ) && (s>=minVal))
        ) {
          invalid = false;
        } else {
          System.out.println(err); 
          in = new Scanner(System.in);
        } // end of if-else// end of if
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return s;
  }

  public static byte inByteLimit(String q,String err,boolean limitMin,byte minVal,boolean limitMax,byte maxVal) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    byte b = 0;
    do {
      try {
        System.out.print(q);
        b = in.nextByte();
        if (( (!limitMin) && (!limitMax) ) || ( (limitMin && (b>=minVal) ) && (limitMax && (b<=maxVal) ) ) || (((!limitMin) && (!(b>=minVal)) ) && (b<=maxVal)) || (((!limitMax) && (!(b<=maxVal)) ) && (b>=minVal))
        ) {
          invalid = false;
        } else {
          System.out.println(err); 
          in = new Scanner(System.in);
        } // end of if-else// end of if
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return b;
  }

  public static float inFloatLimit(String q,String err,boolean limitMin,float minVal,boolean limitMax,float maxVal) {
    boolean invalid = true;
    Scanner in = new Scanner(System.in);
    float f = 0;
    do {
      try {
        System.out.print(q);
        f = in.nextFloat();
        if (( (!limitMin) && (!limitMax) ) || ( (limitMin && (f>=minVal) ) && (limitMax && (f<=maxVal) ) ) || (((!limitMin) && (!(f>=minVal)) ) && (f<=maxVal)) || (((!limitMax) && (!(f<=maxVal)) ) && (f>=minVal))
        ) {
          invalid = false;
        } else {
          System.out.println(err); 
          in = new Scanner(System.in);
        } // end of if-else// end of if
      } catch(Exception e) {
        System.out.println(err);  
        in = new Scanner(System.in);
      } 
    } while (invalid); // end of do-while
    return f;
  }
  
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
      case "j" : b = true;   break;
      case "J" : b = true;   break;
      case "y" : b = true;   break;
      case "Y" : b = true;   break;
      case "K3K5" : 
        b = true;  
        System.out.println("YAY!! Secret! woohoo...");
        break;      
    } // end of switch
    return b;
  }
  
} // end of class SafeIn

