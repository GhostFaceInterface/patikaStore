import java.util.Set;
import java.util.TreeSet;

public class Product implements Comparable<Product>{

    private String productAd;
    private int prductId;
    private static int sayac = 1;
    private int fiyat;
    private Marka m1;
    public static Set <Marka> brandSet = new TreeSet<>();

    static {
        brandSet.add(new Marka("Samsung"));
        brandSet.add(new Marka("Lenovo"));
        brandSet.add(new Marka("Apple"));
        brandSet.add(new Marka("Huawei"));
        brandSet.add(new Marka("Casper"));
        brandSet.add(new Marka("Asus"));
        brandSet.add(new Marka("HP"));
        brandSet.add(new Marka("Xiaomi"));
        brandSet.add(new Marka("Monster"));
    }
    public Product(){}
    public Product(String productAd, int fiyat, Marka m1){
    this.setPrductId(sayac);
    this.productAd = productAd;
    this.fiyat = fiyat;
    this.m1 = m1;
    sayac++;
    }
    @Override
    public int compareTo(Product o) {
        return this.productAd.compareTo(o.productAd);
    }








    public String getProductAd() {
        return productAd;
    }

    public void setProductAd(String productAd) {
        this.productAd = productAd;
    }

    public int getPrductId() {
        return prductId;
    }

    public void setPrductId(int prductId) {
        this.prductId = prductId;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public Marka getM1() {
        return m1;
    }

    public void setM1(Marka m1) {
        this.m1 = m1;
    }

    public static Set<Marka> getBrandSet() {
        return brandSet;
    }

    public static void setBrandSet(Set<Marka> brandSet) {
        Product.brandSet = brandSet;
    }


}
