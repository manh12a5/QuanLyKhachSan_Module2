import Hotel.Hotel;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class HotelManager {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Hotel> arrHotels = new LinkedList<>();


    public void listNewCustomer() {
        Hotel hotel = new Hotel();
        hotel.addNewHotel();
        arrHotels.add(hotel);
    }

    public void informationCustomer() {
        System.out.println("Tìm kiếm qua chứng minh thư: ");
        int index = scanner.nextInt();
        for (int i = 0; i < arrHotels.size(); i++) {
            if (index == arrHotels.get(i).getIdentityCard()) {
                System.out.println(arrHotels.contains(index));
            }
        }
    }

    public void removeCustomer() {
        System.out.println("Xóa theo chứng minh thư: ");
        int index = scanner.nextInt();
        for (int i = 0; i < arrHotels.size(); i++) {
            if (index == arrHotels.get(i).getIdentityCard()) {
                arrHotels.remove(arrHotels.get(i));
            }
        }
        System.out.println(arrHotels);
    }

    public void showAllCustomer() {
        for (int i = 0; i < arrHotels.size(); i++) {
            System.out.println(arrHotels.get(i));
        }
    }

    public int totalPrice(int day) {
        int totalPrice = 0;
        for (int i = 0; i < arrHotels.size(); i++) {
            totalPrice = arrHotels.get(i).getPriceHotel() * day;
        }
        return totalPrice;
    }

//    public void editCustomer() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số chứng minh thư");
//        int numberEdit = scanner.nextInt();
//        for (int i = 0; i < arrHotels.size(); i++) {
//            if (numberEdit == arrHotels.get(i).getIdentityCard()) {
//                arrHotels.set(i, );
//            }
//        }
//        System.out.println("Thông tin sau khi sửa");
//        System.out.println(arrHotels.get(numberEdit));
//    }

    public void sortCustomer() {
        Collections.sort(arrHotels, new Comparator<Hotel>() {
            @Override
            public int compare(Hotel hotel1, Hotel hotel2) {
                return (hotel1.getName().compareTo(hotel2.getName()));
            }
        });
        System.out.println("Sắp xếp lại: ");
        for (int i = 0; i < arrHotels.size(); i++) {
            System.out.println(arrHotels.get(i));
        }
    }

}

