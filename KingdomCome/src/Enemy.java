public class Enemy {
    private int hp;
    private int phyDam;
    private int magDam;
    private int phyRes;
    private int magRes;

    public Enemy(int hp, int phyDam, int magDam, int phyRes, int magRes) {
        this.hp = hp;
        this.phyDam = phyDam;
        this.magDam = magDam;
        this.phyRes = phyRes;
        this.magRes = magRes;
    }
    //Get Methods
    public int getHp() {
        return hp;
    }
    public int getPhyDam() {
        return phyDam;
    }
    public int getMagDam() {
        return magDam;
    }
    public int getPhyRes() {
        return phyRes;
    }
    public int getMagRes() {
        return magRes;
    }

    //change methods
    public void changeHp(int x) {
        hp += x;
    }
    public void changePhyDam(int x) {
        phyDam += x;
    }
    public void changeMagDam(int x) {
        magDam += x;
    }
    public void changePhyRes(int x) {
        phyRes += x;
    }
    public void changeMagRes(int x) {
        magRes += x;
    }
}
