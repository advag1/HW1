public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int sign = 1;
        for (int i = 1; i <= 2*Integer.parseInt(args[0]); i += 2){
            approxPi += sign * (1.0 / i);
            sign = -sign;
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
