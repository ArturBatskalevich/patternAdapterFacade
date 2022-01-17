package task2;

public class BinOps {

    Binary binary = new Binary();
    Desimal desimal = new Desimal();

    public String sum(String a, String b) {
        int totalSum = binary.fromBinaryToDecimal(a) + binary.fromBinaryToDecimal(b);

        return desimal.fromDecimalToBinary(totalSum);
    }

    public String mult(String a, String b) {
        int totalMult = binary.fromBinaryToDecimal(a) * binary.fromBinaryToDecimal(b);

        return desimal.fromDecimalToBinary(totalMult);
    }
}


