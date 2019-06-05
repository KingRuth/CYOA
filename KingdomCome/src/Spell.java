
public class Spell {
    private int intelReq;
    private int magDam;
    public Spell(int intelReq, int magDam){
        this.intelReq = intelReq;
        this.magDam = magDam;
    }
    public int getIntelReq(){
        return intelReq;
    }
    public int getMagDam(){
        return magDam;
    }
    public void changeIntelReq(int x){
        intelReq += x;
    }
    public void changeMagDam(int x){
        magDam += x;
    }
}
