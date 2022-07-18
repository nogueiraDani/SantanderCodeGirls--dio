public class Relogio {

    public static void cumprimentar(int hora) {
        if (hora >= 5 && hora <= 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 13 && hora <= 17) {
            System.out.println("Boa tarde!");
        } else if (hora > 23) {
            System.out.println("Hora inválida.");
        } else {
            System.out.println("Boa noite!");
        }
    }

}
