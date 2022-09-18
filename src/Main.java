import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sınır değeri giriniz: ");
        k = input.nextInt();

        int i;
        int j;
        int power4=0;
        int power5=0;

        for (i = 1; i<k; i *= 4 ){
            System.out.println("4'ün "+ power4 + ". kuvveti: " + i);
            power4 ++;
        }

        for (j = 1; j<k;  j *= 5 ){
            System.out.println("5'in "+ power5 + ". kuvveti: " + j);
            power5 ++;
        }
    }
}

