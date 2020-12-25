package Hotel;

import java.util.Scanner;

public class Hotel extends Person{
    private int numberOfDayHotel;
    private String typeHotel;
    private int priceHotel;

    public Hotel() {
    }

    public int getNumberOfDayHotel() {
        return numberOfDayHotel;
    }

    public void setNumberOfDayHotel(int numberOfDayHotel) {
        this.numberOfDayHotel = numberOfDayHotel;
    }

    public String getTypeHotel() {
        return typeHotel;
    }

    public void setTypeHotel(String typeHotel) {
        this.typeHotel = typeHotel;
    }

    public int getPriceHotel() {
        return priceHotel;
    }

    public void setPriceHotel(int priceHotel) {
        this.priceHotel = priceHotel;
    }

    public void addNewHotel() {
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        super.addNewPerson();
        System.out.println("Nhập ngày thuê phòng: ");
        numberOfDayHotel = scanner2.nextInt();
        System.out.println("Nhập loại phòng: ");
        typeHotel = scanner1.nextLine();
        System.out.println("Nhập giá phòng: ");
        priceHotel = scanner2.nextInt();
    }

    @Override
    public String toString() {
        return "Hotel" + super.toString() +
                " numberOfDayHotel = " + numberOfDayHotel +
                ", typeHotel = '" + typeHotel + '\'' +
                ", priceHotel = " + priceHotel;
    }
}
