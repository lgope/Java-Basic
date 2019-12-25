package JavaBeginner;
//Created By Lakshman on 1/7/2019

public class NumberToWord {

    public static void main(String[] args) {
        numberToWords(121);
    }

    public static void numberToWords(int number){
        int num = reverse(number);
        if (number < 0){
            System.out.println("Invalid Value");
        }else{
            int numb =  getDigitCount(num);
            while (num > 0) {

                int lastDigit = num % 10;

                switch (lastDigit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                num /= 10;
            }

            while (getDigitCount(number) != numb){
                System.out.print("Zero ");
                numb ++;
            }
        }

    }
    public static int reverse(int number){
        int reverse = 0;
        if (number == 0){
            return 0;
        }
        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }return reverse;
    }
    public static int getDigitCount(int number){
        int count = 0;
        if (number < 0){
            return -1;
        }else if (number == 0){
            return 1;}
        else{
            while (number > 0){
                number /= 10;
                count++;
            }
        }return count;
    }
}
