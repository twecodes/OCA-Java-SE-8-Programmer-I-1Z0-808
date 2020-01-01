package academy.learnprogramming;

public class WholeNumericPrimitives {

    public static void main(String[] args) {
        // long max = 321334354566567; // by default whole numbers are Integers
        // long max = 321334354566567L;
        long max = 3_213_343_545_665_67L;

        // int oct = 08; // Integer number too large
        // octal (0-7)
        int firstOct = 010; // 8 decimal
        int secondOct = 022; // 18 decimal
        int sumOct = firstOct + secondOct; // 26 decimal, 32 octal
        System.out.println("first="+firstOct+" second="+secondOct);
        System.out.println("decimalSum="+sumOct + " octSum=" + Integer.toOctalString(sumOct));

        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 hexadecimal 2d hex
        System.out.println("first="+firstHex+" second="+secondHex);
        System.out.println("decimalSum="+sumHex + " hexSum=" + Integer.toHexString(sumHex));

        // binary (0 and 1)
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = firstBin + secondBin; // 16 decimal 10000 binary
        System.out.println("first="+firstBin+" second="+secondBin);
        System.out.println("decimalBin="+sumBin + " binSum=" + Integer.toBinaryString(sumBin));
    }
}
