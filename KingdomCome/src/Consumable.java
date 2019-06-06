public class Consumable {
    private int Power;
    public Consumable(int power){
        this.Power = power;
    }
    public int GetPower(){
        return Power;
    }
    public void ChangePower(int x){
        Power += x;
    }
}
