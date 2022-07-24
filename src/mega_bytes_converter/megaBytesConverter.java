package mega_bytes_converter;

public class megaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        double oneKB = 0.0009765625;
        double result = 0;

        if (kiloBytes == 0) {
            System.out.println("Invalid value");
        } else {

            result = kiloBytes * oneKB;

        }

        System.out.printf("%d KB = %f MB and %d KB", kiloBytes, Math.floor(result), Math.round((result % 2) * 1000));

    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

}
