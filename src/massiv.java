public class massiv {

   private double [] numbers;

   massiv() {
       numbers = new double[10];
       System.out.println("New massive created with 10 numbers");
   }
   massiv (int N) {
       numbers = new double[N];
       System.out.println("New massive created with "+N+" numbers");
   }



    public double[] take_massiv(){
        return numbers;
    }
    public double take_max() {
        double max_value;
        max_value = numbers[0];
        for (double number : numbers)
            if (max_value < number) max_value = number;
        System.out.printf("%.3f",max_value);
        System.out.println();
        return max_value;
    }

    public double take_min() {
        double min_value;
        min_value = numbers[0];
        for (double number : numbers)
            if (min_value > number) min_value = number;
        System.out.printf("%.3f",min_value);
        System.out.println();
        return min_value;
    }

    public double take_average() {
        double average_value = 0;
        for (double number : numbers)
            average_value += number;
        average_value = average_value / numbers.length;
        System.out.printf("%.3f",average_value);
        System.out.println();
        return average_value;
    }

    public void init_random_massiv() {
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Math.random() * 101;
        }
    }

    public void show_massive() {
       for (double number : numbers) {
           System.out.printf("%.3f", number);
           if (number != numbers[numbers.length-1]) System.out.print("::");
       }
       System.out.println();
    }
}
