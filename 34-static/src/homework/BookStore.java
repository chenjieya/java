package homework;

/**
 * 书店
 * 0 管理员 5折
 * 1 VIP   8折
 * 2 普通人 全价
 */
public class BookStore {

    public static final int admin = 0;
    public static final int vip = 1;
    public static final int normal = 2;

    public void buyBook(int identiy, float price) {
        switch (identiy) {
            case BookStore.admin:
                System.out.println("尊敬的管理员您好，这本书的购买价格是："+price*0.5);
                break;
            case BookStore.vip:
                System.out.println("尊敬的VIP您好，这本书的购买价格是："+price*0.8);
                break;
            case BookStore.normal:
                System.out.println("尊敬的普通用户您好，这本书的购买价格是："+price);
                break;
            default:
                System.out.println("对不起，系统中没有查询到您的身份");
        }
    }
}
