package Hotel;

import java.util.Scanner;

public class Person {
    private String name;
    private int birthday;
    private int identityCard;
    private int phone;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.err.println("Tên không được bỏ trống");
        }
    }

    public int getBirthday() {
        return birthday;
    }

    public boolean setBirthday(int birthday) {
        if (birthday != 0) {
            this.birthday = birthday;
            return true;
        } else {
            System.err.println("Năm sinh phải có 4 chữ số");
            return false;
        }

    }

    public int getIdentityCard() {
        return identityCard;
    }

    public boolean setIdentityCard(int identityCard) {
        if (identityCard != 0) {
            this.identityCard = identityCard;
            return true;
        } else {
            System.err.println("CMND ít nhất phải có 9 số");
            return false;
        }
    }

    public int getPhone() {
        return phone;
    }

    public boolean setPhone(int phone) {
        if (phone != 0) {
            this.phone = phone;
            return true;
        } else {
            System.out.println("Số điện thoại phải có 9 số");
            return false;
        }
    }

    public void addNewPerson() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Thông tin cá nhân");
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        while (name.length() < 1) {
            System.err.println("Mời bạn nhập lại tên");
            name = scanner.nextLine();
        }
        setName(name);
        while (true) {
            System.out.println("Nhập năm sinh: ");
            birthday = scanner1.nextInt();
            boolean check = setBirthday(birthday);
            if (check) {
                break;
            }
        }
        while (true) {
            System.out.println("Nhập chứng minh thư: ");
            identityCard = scanner.nextInt();
            boolean check = setIdentityCard(identityCard);
            if (check) {
                break;
            }
        }
        while (true) {
            System.out.println("Nhập số điện thoại: ");
            phone = scanner1.nextInt();
            boolean check = setBirthday(birthday);
            if (check) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Person " +
                "name ='" + name + '\'' +
                ", birthday = " + birthday +
                ", identityCard = " + identityCard +
                ", phone = " + phone;
    }

}
