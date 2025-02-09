import java.util.Scanner;
public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a character:\n1. Knight\n2. Wizard\n3. Archer");
        int charChoice = scanner.nextInt();
        GameCharacter character = null;

        switch (charChoice) {
            case 1:
                character = new Knight();
                break;
            case 2:
                character = new Wizard();
                break;
            case 3:
                character = new Archer();
                break;
            default:
                System.out.println("Invalid choice! Please restart and choose a valid option.");
                scanner.close();
                return;
        }

        if (character instanceof Knight) {
            System.out.println("Choose a defense strategy:\n1. Shield\n2. Dodge\n3. Magic Barrier");
            int defenseChoice = scanner.nextInt();

            switch (defenseChoice) {
                case 1:
                    character.setDefenseStrategy(new Shield());
                    break;
                case 2:
                    character.setDefenseStrategy(new Dodge());
                    break;
                case 3:
                    character.setDefenseStrategy(new CreateMagicBarrier());
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to Shield.");
                    character.setDefenseStrategy(new Shield());
            }
        }

        character.performAttack();
        character.performDefend();

        scanner.close();
    }
}
