package desafios;

public class test {

    public static void main(String[] args) {

        int n = 12;

        int square = (int) Math.pow(n, 2);
        System.out.println("square = " + square);
        int antecessor = (int) Math.pow((n - 1), 2);
        System.out.println(" antecessor = " + antecessor);
        int sucessor = (int) Math.pow((n + 1), 2);
        System.out.println(" sucessor = " + sucessor);

        int calculo1 = (int) Math.abs(Math.sqrt(n) - square);
        int calculo2 = (int) Math.abs(Math.sqrt(n) - antecessor);
        int calculo3 = (int) Math.abs(Math.sqrt(n) - sucessor);

        int menorIntervalo;
        if(calculo1 < calculo2){
            menorIntervalo = square;
            if(calculo3 < calculo1){
                menorIntervalo = sucessor;
            }
        } else {
            menorIntervalo = antecessor;
        }

        System.out.println(" menorIntervalo = " + menorIntervalo);
    }
}
