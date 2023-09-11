public class Reduce {
    public static void main(String[] args){
        int n = 100;
        int steps = 0;
        while (n > 0){
            if (n % 2 == 0){ // Even.
                n = n / 2;
            }
            else{ // Odd.
                n --;
            }
            steps ++;
        }
        System.out.println(steps);
    }
}
