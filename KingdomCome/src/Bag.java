import java.util.ArrayList;
public class Bag {
    ArrayList<Consumable> empty = new ArrayList();
    private ArrayList<Consumable> Bag = empty;
    public Bag(ArrayList<Consumable> HopefullyEmpty){
        this.Bag = HopefullyEmpty;
    }
    public ArrayList GetBag(){
        return Bag;
    }
}
