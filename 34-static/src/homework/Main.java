package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请您输入这本书的总价：");
        float price = input.nextFloat();
        System.out.println("请您输入用户的身份：");
        int indentiy = input.nextInt();

        BookStore bs = new BookStore();
        bs.buyBook(indentiy, price);
    }
}
