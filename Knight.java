public class Knight extends GameCharacter{
    public Knight(){
        attackStrategy = new SwingSword();
        defenseStrategy = new Shield();
    }

}
