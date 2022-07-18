public class Conversoes {

    public static void main(String[] args) {

        /*

        Upcast
        Downcast

         */

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // downcast, vai gerar divergencia de valor
        System.out.println(b1);

        long l1;
        int i1 = 10;
        l1 = i1; // upcast, tudo certo!
        System.out.println(l1);

        int i2;
        long l2 = 100000000000000000L;
        i2 = (int) l2; // downcast, vai gerar divergencia de valor
        System.out.println(i2);

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; // downcast, mas nao gera divergencia pelo tamanho do numero.
        System.out.println(i3);

    }
}
