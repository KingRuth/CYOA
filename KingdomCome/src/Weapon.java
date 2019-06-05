public class Weapon {
    private int phyDam;
    private int magDam;
    private int strReq;

    public Weapon(int phyDam, int magDam, int strReq){
        this.phyDam = phyDam;
        this.magDam = magDam;
        this.strReq = strReq;
    }
    public int getPhyDam(){
        return phyDam;
    }
    public int getMagDam(){
        return magDam;
    }
    public int getStrReq(){
        return strReq;
    }
    public void changePhyDam(int x){
        phyDam += x;
    }
    public void changeMagDam(int x){
        magDam += x;
    }
    public void changeStrReq(int x){
        strReq += x;
    }

}
