public class Test {

    public static void main(String[] args) {
        //String answer = compute(500000);
        //System.out.println(answer);

        //String answer = solution("Sat", 23);
        //System.out.println(answer);

        int answer = solution(new int[]{1, 6, 2}, new int[]{3, 2, 5}, 2, 1);
        System.out.println(answer);


    }
    public static String compute(int bytesQuantity) {
        // Write your code here

        if (bytesQuantity < 1024) {
            return Integer.toString(bytesQuantity);
        } else if (bytesQuantity <1048576) {
            bytesQuantity = Math.floorDiv(bytesQuantity, 1024);
            return bytesQuantity + " KiB";
        } else {
            bytesQuantity = Math.floorDiv(bytesQuantity, (1024 * 1024));
            return bytesQuantity + " MiB";
        }
    }

    public static String solution(String S, int K) {
        int day = 0;
        switch (S) {
            case "Mon":
                day = 1;
                break;
            case "Tue":
                day = 2;
                break;
            case "Wed":
                day = 3;
                break;
            case "Thu":
                day = 4;
                break;
            case "Fri":
                day = 5;
                break;
            case "Sat":
                day = 6;
                break;
            case "Sun":
                day = 7;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + S);
        }

        day += K;

        while (day > 7) {
            day -= 7;
        }

        switch (day) {
            case 1:
                S = "Mon";
                break;
            case 2:
                S = "Tue";
                break;
            case 3:
                S = "Wed";
                break;
            case 4:
                S = "Thu";
                break;
            case 5:
                S = "Fri";
                break;
            case 6:
                S = "Sat";
                break;
            case 7:
                S = "Sun";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
        
        return S;
    }

    public static int solution(int[] A, int[] B, int X, int Y) {
        // Implement your solution here
        boolean side = true;
        int time = 0;
        if (A[0] > B[0]) {
            time += A[0];
        } else {
            time += B[0];
            side = false;
        }

        for (int i = 1; i < A.length; i++){

            if (side == true) {
                if (A[i] <= (B[i] + X)) {
                    time += A[i];
                } else {
                    side = false;
                    time += X;
                    time += B[i];

                }
            } else if (side != true) {
                if (B[i] <= (A[i] + Y)) {
                    time += B[i];
                } else {
                    side = true;
                    time += Y;
                    time += A[i];
                }
            }



        }

        return time;
    }
}

