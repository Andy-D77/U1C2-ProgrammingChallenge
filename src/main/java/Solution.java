public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4) / 4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) (average + 0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        //userDouble += 111.11;
        //123.45
        int digitOne = (int) (userDouble / 100);
        digitOne = (digitOne + 1) % 10;
        int digitTwo = (int) (userDouble / 10) % 10;
        digitTwo = (digitTwo + 1) % 10;
        int digitThree = (int) (userDouble % 10);
        digitThree = (digitThree + 1) % 10;
        int digitFour = (int) (userDouble * 10) % 10;
        digitFour = (digitFour + 1) % 10;
        int digitFive = (int) (userDouble * 100) % 10;
        digitFive = (digitFive + 1) % 10;
        double newNum;
        newNum = digitOne * 100 + digitTwo * 10 + digitThree + digitFour / 10.0 + digitFive / 100.0;
        // remove 0.0 and return your answer
        return newNum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
