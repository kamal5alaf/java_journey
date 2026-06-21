//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class TemperatureConverter {

        public static void main(String[] args) {

        byte a = 10;
        short b = 1000;
        int c = 100000;
        long d = 10000000000l;

        float e = 5.5f;
        double f = 10.99;

        char g = 'A';
        boolean h = true;


        System.out.println(7 / 2);
        System.out.println(7.0 / 2);

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        int x = 5;
        int z = ++x;
        System.out.println(x);
        System.out.println(z);


        int n = 5;
        int m = n++;
        System.out.println(n);
        System.out.println(m);

        double t = 5.88888;
        int casted_number = (int) t;
        System.out.println(casted_number);


        double celsius = 37.5;

        double Wrong_F = (celsius * (9 / 5)) + 32;
        double correct_F = (celsius * (9.0 / 5)) + 32;

        System.out.println("Wrong Fahrenheit" + Wrong_F);
        System.out.println("correct Fahrenheit" + correct_F);

        double Kelvin = celsius + 273.15;

        System.out.println("Kelvin" + Kelvin);

        int temp = 100 / 3;
        System.out.println(temp);
        // 100 / 3 = 33 not 33.33 because int division removes decimals

        long bigNumber = 3000000000L;
        System.out.println(bigNumber);
        // If stored in int → overflow because exceeds Integer.MAX_VALUE (2147483647)


    }
}
