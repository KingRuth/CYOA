public class Battle {
    public Player main;
    public Enemy bad;
    public Battle(Player good, Enemy baddie){
        this.main = good;
        this.bad = baddie;
    }
    public int battle(){
        int tik = 0;
        while(main.GetHealth() > 0 && bad.getHp() >0){
           if(tik == 0){
               bad.changeHp(-((main.GetWeapon().getPhyDam() - bad.getPhyRes()) + (main.GetWeapon().getMagDam() - bad.getMagRes()))) ;
           }
           if(tik == 1){
               main.AlterHealth(-((bad.getPhyDam()-main.GetArmor().GetPhyres()) + (bad.getMagDam() -main.GetArmor().GetMagres()) ));
           }
           if(tik == 1){ tik +=-2;}
           tik-=-1;
        }
        if(main.GetHealth() <= 0){
            return 0;
        }
        return 1;
    }
}
