public class Archer extends GameCharacter{
    public Archer(){
        attackStrategy = new ShootArrow();
        defenseStrategy = new Dodge();
    }
}
