import java.util.Scanner;

public class AurrekoZenbakiBatazBestekoa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int zenbaki;
        int zenbakiKopurua = 0;
        int zenbakiTotala = 0;

        do {
            System.out.print("Sartu zenbaki oso bat (0 bukatzeko): ");
            zenbaki = scanner.nextInt();

            if (zenbaki != 0) {
                zenbakiKopurua++;
                zenbakiTotala += zenbaki;
            }

        } while (zenbaki != 0);

        if (zenbakiKopurua > 0) {
            double batazbestekoa = (double) zenbakiTotala / zenbakiKopurua;
            System.out.println("Aurreko zenbaki guztien bataz bestekoa: " + batazbestekoa);
        } else {
            System.out.println("Ez zenbaki sartu.");
        }

        scanner.close();
    }
}

