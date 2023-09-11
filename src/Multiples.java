public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        // 1. Check each number from 3 to 1000 (we know 1 and 2 are not valid)
        for (int i = 3; i < 1000; i ++){
            // 2. Check if solely divisible by 3s and 5s
            boolean isDivisibleBy3sAnd5s = checkDivisibility(i);
            if (isDivisibleBy3sAnd5s){
                count ++;
            }
        }
        System.out.println(count);
    }

    /**
     * [RECURSIVE] Checks if the input number is solely divisible by 3s and 5s
     * @param i Input number.
     * @return Whether "i" is divisible by entirely 3s and 5s.
     */
    public static boolean checkDivisibility(int i){
        // Base case
        if (i == 1){
            return true;
        }

        double quotient3 = i / 3.0;
        double quotient5 = i / 5.0;
        // We combine the two paths in an or operation here because, if they were to be their own separate
        // branches, the code would short circuit (ie by checking quotient3 first, for i = 25,
        // it would return false prematurely because 3 doesn't divide 25.
        if (quotient3 % 1 == 0 || quotient5 % 1 == 0){
            if (!checkDivisibility((int) quotient3) && !checkDivisibility((int) quotient5)){
                return false;
            }
            else{
                return true;
            }
            // DeMorgan's law simplification:
            // return checkDivisibility((int) quotient3) || checkDivisibility((int) quotient5);
        }
        else{
            return false;
        }
    }
}
