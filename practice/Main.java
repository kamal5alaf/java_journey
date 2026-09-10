import javax.print.attribute.standard.MediaSize;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.util.Objects.requireNonNull;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Practise.carpetArea(5, 5);
        Practise.amountPerPerson(80.00, 8);
        Practise.amountPerPerson(150.00, 8);
        Practise.celsiusToFahrenheit(37);
        int[] result = Practise.packEgg(50);
        System.out.println(Arrays.toString(result));
        System.out.println(Practise.canPair(7));
        System.out.println(Practise.ticketPrice(11));

        System.out.println(Arrays.toString(Practise.splitDuration(3599)));


        double[] res = {10., 10., 10.};
        System.out.println(Practise.basketTotal(res));
        int[] d = {2, 3, 9};

        System.out.println(Practise.hottestDay(d));
        int[] q = {1, 0, 1, 0, 1};

        System.out.println(Practise.countRainyDays(q));


        int[] w = {70,80,90,100};
        System.out.println(Practise.classAverage(w));

        int[] r = {50, -30, -80};
        System.out.println(Practise.finalBalance(100,r));


        String[] k = Practise.conveyorTags(15);
        System.out.println(Arrays.toString(k));

        String[] Names ={"kamal", "mohammed", "yasser"};
        System.out.println(Practise.checkGuest(Names ,"kamal"));
        System.out.println(Practise.checkGuest(Names ,"ahmed"));



        System.out.println(Practise.countVowels("awaa"));


        System.out.println(Practise.longestWinStreak("WWWWLW"));
        System.out.println(Practise.fewestCoins(68));
        int[] order = {5,15,5};
        int[] stock = {5,5,5};
        System.out.println(Practise.canFulfill(stock,order));


        int[] elevator = {3, 4, -1};
        System.out.println(Practise.finalFloor(5,elevator));





    }


}