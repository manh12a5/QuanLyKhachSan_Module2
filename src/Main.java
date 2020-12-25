import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelManager hotelManager = new HotelManager();

        int number;
        do {
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Tìm kiếm thông tin");
            System.out.println("3. Xóa thông tin");
            System.out.println("4. Hiển thị toàn bộ thông tin");
            System.out.println("5. Tính tổng tiền thuê phòng");
            System.out.println("6. Sắp xếp tên A-Z");
            System.out.println("Choice number: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    hotelManager.listNewCustomer();
                    break;
                case 2:
                    hotelManager.informationCustomer();
                    break;
                case 3:
                    hotelManager.removeCustomer();
                    break;
                case 4:
                    hotelManager.showAllCustomer();
                    break;
                case 5:
                    System.out.println("Nhập số ngày thuê: ");
                    int day = scanner.nextInt();
                    System.out.println("Tổng tiền trả là: " + hotelManager.totalPrice(day));
                    break;
                case 6:
                    hotelManager.sortCustomer();
                    break;
            }
        } while (number != 0);
        System.exit(0);

    }

}
