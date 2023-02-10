import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Store {
    private String name;
    public static Store s1 = null;
    public TreeSet<Product> products = new TreeSet<>();
    public int secim;

    public Store() {
    }

    public Store(String name) {
        this.name = name;
    }

    public static Store openStore(String storeName) {
        if (s1 == null) {
            s1 = new Store(storeName);
            return s1;
        }
        return s1;
    }

    public void menu() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\tMy Store Product Management System\t\t|");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\tSelect From The Following Options:\t\t|");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t1\tList Notebook");
        System.out.println("\t2\tList Cellphones");
        System.out.println("\t3\tList Brands");
        System.out.println("\t4\tDelete Product By Id");
        System.out.println("\t5\tAdd New Notebook");
        System.out.println("\t6\tAdd New Cellphone");
        System.out.println("\t0\tClose System");
        System.out.println("-----------------------------------------------------------------");
    }

    public void operasyon() {
        Scanner scan = new Scanner(System.in);
        s1.menu();
        System.out.println("\t\tPlease Enter a Choice");
        while (true) {
            System.out.print("\t\tYour Choice : ");
            secim = scan.nextInt();
            if (this.secim == 0) {
                scan.close();
                break;
            } else if (secim < 0 || secim > 9) {
                System.out.println("\t\tWrong Choice. Try again between 0 and 9.");
            } else {
                switch (secim) {
                    case 1:
                        pcListele();
                        break;
                    case 2:
                        telListele();
                        break;
                    case 3:
                        markaListele();
                        break;
                    case 4:
                        sil();
                        break;
                    case 5:
                        pcEkle();
                        break;
                    case 6:
                        telEkle();
                        break;

                }
            }
        }
    }
        private void pcEkle () {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("\t\tEnter product Name: ");
                String pname = scan.nextLine();
                System.out.print("\t\tEnter product price: ");
                int pprice = scan.nextInt();
                System.out.print("\t\tEnter product brandname: ");
                String bname = scan.nextLine();
                System.out.print("\t\tEnter product storage size: ");
                int stsize = scan.nextInt();
                System.out.print("\t\tEnter product screen size: ");
                double ssize = scan.nextDouble();
                System.out.print("\t\tEnter product ram size: ");
                int ram = scan.nextInt();
                scan.close();

                Product p1 = new pc(pname, pprice, new Marka(bname), stsize, ssize, ram);
                this.products.add(p1);
                System.out.println("New notebook added to store");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Something went wrong");
                System.out.println(e.getMessage());
            }
        }

        private void telEkle () {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("\t\tEnter product Name: ");
                String pname = scan.nextLine();
                System.out.print("\t\tEnter product price: ");
                int pprice = scan.nextInt();
                System.out.print("\t\tEnter product brandname: ");
                String bname = scan.next();
                System.out.print("\t\tEnter product storage size: ");
                int stsize = scan.nextInt();
                System.out.print("\t\tEnter product screen size: ");
                double ssize = scan.nextDouble();
                System.out.print("\t\tEnter product battery power: ");
                int batterypower = scan.nextInt();
                System.out.print("\t\tEnter product ram size: ");
                int ram = scan.nextInt();
                System.out.print("\t\tEnter product color: ");
                String color = scan.next();
                scan.close();
                Product p1 = new Telefon(pname, pprice, new Marka(bname), stsize, ssize, batterypower, ram, color);
                this.products.add(p1);
                System.out.println("New cellphone added to store");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Something went wrong");
                System.out.println(e.getMessage());
            }

        }

        public void pcListele () {
            System.out.println(
                    " ------------------------------------------------------------------------------ ");
            System.out.println(
                    "| product Id | product Name | price | brand | storage size | screen Size | ram |");
            System.out.println(
                    " ------------------------------------------------------------------------------ ");
            for (Product p1 : products) {
                if (p1 instanceof pc) {
                    System.out.println(p1.toString());
                }
            }
        }
        public void telListele () {
            System.out.println(
                    " ------------------------------------------------------------------------------------------------------ ");
            System.out.println(
                    "| product Id | product Name | price | brand | storage size | screen Size | battery Power | ram | color |");
            System.out.println(
                    " ------------------------------------------------------------------------------------------------------ ");
            for (Product p1 : products) {
                if (p1 instanceof Telefon)
                    System.out.println(p1.toString());
            }
        }
        public void markaListele () {
            System.out.println("\t\tBrands in My Store:");
            for (Marka m1 : Product.brandSet) {
                System.out.println("\t\t-" + m1.getMarkaAd());
            }
        }

        public void sil () {
            Scanner scan = new Scanner(System.in);
            System.out.print("\t\tPlease Enter an ID : ");
            int deletedId = scan.nextInt();

            Iterator<Product> itr = products.iterator();
            while (itr.hasNext()) {
                Product item = itr.next();
                if (item.getPrductId() == deletedId) {
                    itr.remove();
                }
            }
            scan.close();
        }


        public void addCellphone (String productName,int price, Marka brand,int storageSize, double screenSize,
        int batteryPower, int ram, String color){

            Product product = new Telefon(productName, price, brand, storageSize, screenSize, batteryPower, ram, color);
            this.products.add(product);
        }

        public void addNotebook (String productName,int price, Marka brand,int storageSize, double screenSize, int ram){

            Product product = new pc(productName, price, brand, storageSize, screenSize, ram);
            this.products.add(product);
        }



}


