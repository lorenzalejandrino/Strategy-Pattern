abstract class GameCharacter {
    AttackStrategy attackStrategy;
    DefenseStrategy defenseStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefend() {
        defenseStrategy.defend();
    }
}