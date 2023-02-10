public class Marka implements Comparable<Marka>{
    private int markaId;
    private String markaAd;
    private static int sayac = 1;
    private boolean isExist = false;

    public Marka(){}

    @Override
    public String toString() {
        return  "\nBrand [brandId=" + markaId + ", brandName=" + markaAd + "]";
    }

    @Override
    public int compareTo(Marka o) {
        return this.markaAd.compareTo(o.getMarkaAd());
    }



    public Marka(String markaAd){
        if(checkMarka(markaAd) == null){
            this.markaAd = markaAd;
            setMarkaId(sayac);
            this.sayac++;
        }
    }

    public Marka checkMarka(String name){
        for(Marka item: Product.brandSet){
            this.isExist = item.getMarkaAd().equals(name);
            if(this.isExist==true){
                setMarkaAd(item.getMarkaAd());
                setMarkaId(item.getMarkaId());
                return item;
            }
        }
    return null;
    }



    public int getMarkaId() {
        return markaId;
    }

    public void setMarkaId(int markaId) {
        this.markaId = markaId;
    }

    public String getMarkaAd() {
        return markaAd;
    }

    public void setMarkaAd(String markaAd) {
        this.markaAd = markaAd;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }


}