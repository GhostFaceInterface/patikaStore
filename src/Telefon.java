public class Telefon extends Product{
    @Override
    public String toString() {
        return "\t" + this.getPrductId() + "\t" + this.getProductAd() + "\t" + this.getFiyat() + "  "
                + this.getM1().getMarkaAd() + "\t"
                + this.getDepolama() + "\t\t" + this.getEkran() + "\t\t" + this.getBatarya()
                + "\t   " + this.getRam() + "\t" + this.getRenk();
    }

    private int depolama;
    private double ekran;
    private int batarya;


    public Telefon(String productAd, int fiyat, Marka m1, int depolama, double ekran, int batarya, int ram, String renk) {
        super(productAd, fiyat, m1);
        this.depolama = depolama;
        this.ekran = ekran;
        this.batarya = batarya;
        this.ram = ram;
        this.renk = renk;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getEkran() {
        return ekran;
    }

    public void setEkran(double ekran) {
        this.ekran = ekran;
    }

    public int getBatarya() {
        return batarya;
    }

    public void setBatarya(int batarya) {
        this.batarya = batarya;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    private int ram;
    private String renk;

    public Telefon(){}


}
