import java.util.*;

public class MiniComputer {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gate = true;
        while (gate) {
            System.out.println("1 - GetLottoTal");
            System.out.println("2 - Konverter sekunder til timer");
            System.out.println("3 - getTime");
            System.out.println("4 - RNGguess");
            System.out.println("0 - Exit");

            System.out.println("What program do you want to run?");
            if (sc.hasNextLine()) {
                String input = sc.nextLine();
                if (input.equals("0")) gate = false;
                if (input.equals("1")) GetLottoTal.GetLottoTal();
                if (input.equals("2")) Converter.converter();
                if (input.equals("3")) GetTime.getTime();
                if (input.equals("4")) RngGuess.rngGuess();
                System.out.println("Press enter when ready to continue...");
                sc.nextLine();
            } else System.out.println("Input error!");
        }
    }
}


