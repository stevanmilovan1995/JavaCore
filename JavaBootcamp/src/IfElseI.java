public class IfElseI {
    public static void main(String[] args) {
        int grifindor = 850;
        int revenklo = 500;
        int margin = grifindor - revenklo;

        if(margin > 300) {
            System.out.println("Grifindor je pobedio");
        }
        else if (margin < 300) {
            System.out.println("Grifindor je drugi");
        }
        else if (margin >= -100) {
            System.out.println("Grifindor je treci");
        }
        else {
            System.out.println("Grifindor je cetvrti");
        }

    }

}
