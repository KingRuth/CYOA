import java.util.ArrayList;

public class SpellBook {
    ArrayList<String> spellBook = new ArrayList<>();
    public SpellBook(ArrayList spellBook){
        this.spellBook = spellBook;
    }

    public ArrayList<String> getSpellBook() {
        return spellBook;
    }
}
