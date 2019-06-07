public class Armor {
    private int Magres;
    private int Phyres;
    public Armor(int magres,int physres){
        this.Magres = magres;
        this.Phyres = physres;}
    public int GetPhyres(){
        return Phyres;
    }
    public int GetMagres(){
        return Magres;
    }
    public void ChangeMagres(int x){
        Magres += x;
    }
    public void ChangePhyres(int x){
        Phyres += x;
    }
}
