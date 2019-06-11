public class Player {
    private int Str;
    private int Dex;
    private int Int;
    private int Chr;
    private int health;
    private Weapon Main;
    private Armor Equipped;
    private SpellBook Spoot;
    private Bag satchel;
    public Player(int str, int dex, int tell, int chr, int health, Weapon weapon, Armor main, SpellBook spoott, Bag backpack){
    this.Str = str;
    this.Dex = dex;
    this.Int = tell;
    this.Chr = chr;
    this.health = health;
    this.Main = weapon;
    this.Equipped = main;
    this.Spoot = spoott;
    this.satchel = backpack;
    }
    public int GetStr(){
        return Str;
    }
    public int GetDex(){
        return Dex;
    }
    public int GetInt(){
        return Int;
    }
    public int GetChr(){
        return Chr;
    }
    public int GetHealth(){
        return health;
    }
    public Weapon GetWeapon() {
        return Main;
    }
    public Armor GetArmor() {
        return Equipped;
    }
    public Bag GetBag() {
        return satchel;
    }
    public SpellBook GetSpellBook() {
        return Spoot;
    }
    public void AlterStr(int j){
        Str += j;
    }
    public void AlterChr(int j){
        Chr += j;
    }
    public void AlterInt(int j){
        Int += j;
    }
    public void AlterDex(int j){
        Dex += j;
    }
    public void AlterHealth(int j){
        health += j;
    }
}