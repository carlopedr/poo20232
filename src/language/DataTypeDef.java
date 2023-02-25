package language;

public class DataTypeDef {

    public static void main(String[] args) {
        //Declaración de variables 
        //byte is a primitive data type it only takes up 8 bits of memory.
        byte age = 18;
        System.out.println(age);
        //long is another primitive data type related to integers. long takes up 64 bits of memory.
        long varl = 900L;
        System.out.println(age);
        //float represent basic fractional numbers in Java using the float type. This is a single-precision decimal number. Which means if we get past six decimal points, this number becomes less precise and more of an estimate.
        float price = 100.05f;
        System.out.println(price);
        //char is a 16-bit integer representing a Unicode-encoded character.
        char letter = 'A';
        System.out.println(letter);
        //int holds a wide range of non-fractional number values.
        int varint = 256;
        System.out.println(varint);
        //short: If we want to save memory and byte is too small, we can use short.
        short var2 = 5666;
        System.out.println(var2);
        boolean state=true;
        
        //String
        String nombre="Carlos";
        System.out.println(nombre);
        
        int cHar=9; //Case sensitive
        
    }
}
