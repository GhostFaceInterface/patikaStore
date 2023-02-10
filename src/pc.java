public class pc extends Product {
    private int depolama;
    private double ekran;
    private int ram;


    public pc(){}

    @Override
    public String toString() {
        return "\t" + this.getPrductId() + "\t" + this.getProductAd() + "\t" + this.getFiyat() + "  "
                + this.getM1().getMarkaAd() + "\t" + this.getDepolama() + "\t\t" + this.getEkran()
                + "\t\t" + this.getRam();
    }

    public pc(String productAd,int fiyat, Marka m1,int depolama, double ekran,int ram){
        super(productAd,fiyat,m1);
        this.depolama = depolama;
        this.ekran = ekran;
        this.ram = ram;
    }


    public pc(Product product, int depolama, double ekran, int ram) {
        super();
        this.depolama = depolama;
        this.ekran = ekran;
        this.ram = ram;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }



}
