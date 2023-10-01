package desafios;

public class CountByX {

    public static int[] countBy(int x, int n){
        int [] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = x*(i+1);
        }
        return array;
    }

}
