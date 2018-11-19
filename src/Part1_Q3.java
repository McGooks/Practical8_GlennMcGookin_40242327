public class Part1_Q3 {
    public static void main(String[] args) {
        double [] height = {1.4,1.9,1.31,1.2};
        double totalHeight = 0.0;

        for(int counter = 0; counter < height.length; counter++){
            totalHeight += height[counter];
        }
        double max = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) max = height[i];
        }

        double min = height[0];
        for (int i = 1; i < height.length; i++) {
            if(height[i] < min) min = height [i];
        }

        double avgHeight = totalHeight / height.length;
        System.out.printf("The average height is: %1.1f\n", avgHeight);
        System.out.printf("The max height is: %1.1f\n", max);
        System.out.printf("The min height is: %1.1f\n", min);

    }
}
