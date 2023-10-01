package desafios;

import java.util.Scanner;

public class FindNearestSquareNumber {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = read.nextInt();
        int menorIntervalo = getMenorIntervaloRefatorado(n);
        System.out.println("Quadrado perfeito mais próximo: " + menorIntervalo);

        read.close();
    }

    private static int getMenorIntervaloRefatorado(int n) {
        int square = (int) Math.sqrt(n);

        int arredondado = (int) Math.pow(square, 2);
        int antecessor = (int) Math.pow((square - 1), 2);
        int sucessor = (int) Math.pow((square + 1), 2);

        int calculo1 = Math.abs(n - arredondado);
        int calculo2 = Math.abs(n - antecessor);
        int calculo3 = Math.abs(n - sucessor);

        int menorIntervalo;
        if(calculo1 < calculo2){
            menorIntervalo = arredondado;
            if(calculo3 < calculo1){
                menorIntervalo = sucessor;
            }
        } else {
            menorIntervalo = antecessor;
        }
        return menorIntervalo;
    }



    @SuppressWarnings("unused")
	private static int getMenorIntervalo(int n) {
        int square = (int) Math.sqrt(n);

        int multiplo = (int) Math.pow(square, 2);
        int menorMultiplo = (int) Math.pow(square-1, 2);
        int maiorMultiplo = (int) Math.pow(square+1, 2);

        int calculo1 = n - multiplo;
        int calculo2 = n - menorMultiplo;
        int calculo3 = n - maiorMultiplo;

        if(calculo1 < 0){
            calculo1 *= -1;
        }
        if(calculo2 < 0){
            calculo2 *= -1;
        }
        if(calculo3 < 0) {
            calculo3 *= -1;
        }

        int menorIntervalo = 0;
        if(calculo1 < calculo2){
            menorIntervalo = multiplo;
            if(calculo3 < calculo1){
                menorIntervalo = maiorMultiplo;
            }
        } else {
            menorIntervalo = menorMultiplo;
        }
        return menorIntervalo;
    }
}
