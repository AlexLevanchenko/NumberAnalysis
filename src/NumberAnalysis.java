import java.util.Scanner;
public class NumberAnalysis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число от 100 до 999: ");
        int number = input.nextInt();
        if (number < 100) {System.out.println("Слишком маленькое число, давай попробуем до 100 включительно");}
        else if (number > 999)System.out.println("Слишком больше число,давай попробуем до 999 включительно");
        else System.out.println("Сумма всех цифр в " +number + " равна: " + ((number%10)+((number/10)%10)+((number/100)%10)));
    }
}