public class Wrappers {
    public static void main(String[] args) {
        Byte b = 127;   //byte
        Byte b2 = -128;
        Byte nullByte = null;

        Character c = 'A'; //char
        Character c2 = 15;

        Short s = 32767; //short
        Short s2 = -32768;

        Integer i = 2147483647;  //int
        Integer i2 = -2147483648;

        Long l = 9223372036854775807L; //long
        Long l2 = -9223372036854775808L;

        Float f = 65f; //float
        Float f2 = 65.0f;
        Float f3 = -0.5f;

        Double d = 1024.99;  //Double
        Double d2 = 10.2456;

        Boolean bo = true;  //boolean
        Boolean bo2 = false;

        Boolean bo3 = Boolean.getBoolean("false");  //OK
        Boolean bo4 = Boolean.valueOf("true");   //OK
    }
}

// Autoboxing = Passa o valor puro para um tipo de objeto
// Usando class no java.lang
// Recurso de conversão automática de tipos de dados primitivos em seu objeto equivalente
// Permite novas formas de trabalhar com os valores
// Diferente dos inteiros agora aceita valor igual a null
