package ReverseBit;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(reverseBits(11));
        //System.out.println(reverseBits(Integer.parseInt("00000010100101000001111010011100", 2)));
        long temp = Long.parseLong("11111111111111111111111111111101",2);
        int value = (int) temp;
        System.out.println(reverseBits(value));
    }

    public static int reverseBits(int n) {
        String result = "";
        int count = 0;
        while(count <32) {

            if ((n & 1) == 1) {
                result = result +"1";
            } else {
                result = result + "0";
            }
            n = n>>>1;
            count++;
        }
        long temp = Long.parseLong(result,2);
        return (int) temp;
    }
}
