import static java.lang.Integer.*;

/*
Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
Usare le funzioni scritte con i valori creati
 */
public class Main {
    public static void main(String[] args) {
        int typeInt1 = 8;
        int typeInt2 = 129;
        char typeChar1 = 'f';
        double typeDouble1 = 43.23;

        Integer objInt1 = 4;
        Integer objInt2 = 5;
        Character objChar1 = 'o';
        Double objDouble1 = 54.98;

        printIntSum(typeInt1, typeInt2);
        printChar(typeChar1);
        printIntegerSum(objInt1, objInt2);

        // autoboxing
        Integer myInteger = 6;
        Character myChar = 'o';
        Double myDouble = 444.888;
        System.out.println("Autoboxing (da tipo primitivo a obj.) eseguito: " + myInteger + ", " + myChar + ", " + myDouble);

        // unboxing
        int myI = objInt1;
        char myC = objChar1;
        double myD = objDouble1;
        System.out.println("Unboxing (da obj. a tipo primitivo) eseguito: " + myI + ", " + myC + ", " + myD);
        
    }
    public static void printIntSum(int myInt1, int myInt2){
        int sum = myInt1 + myInt2;
        System.out.println("Ecco la somma dei due int: " + sum);
    }
    public static void printChar(char myChar){
        System.out.println("Ecco il char: " + myChar);

    }
    public static void printIntegerSum(Integer myInteger1, Integer myInteger2){
        Integer sum = sum(myInteger1, myInteger2);
        System.out.println("Ecco la somma dei due Integer: " + sum);
    }


}