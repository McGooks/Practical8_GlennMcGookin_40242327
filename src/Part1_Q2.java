public class Part1_Q2 {
    public static void main(String[] args) {
        double [] temperatures = {3.4,4.2,9.0,2.2,4.5,6.4,3.1};
        double totalTemps = 0.0;

        for(int counter = 0; counter < temperatures.length; counter++){
            totalTemps += temperatures[counter];
        }
        double avgTemps = totalTemps / temperatures.length;
        System.out.printf("The average temperature is: %1.1f\n", avgTemps);

    }
}
