package wyp.CreationalPatterns.SingletonPattern;

public class Client {
    public static void main(String[] args) {
        IDCardNumber card_1 = IDCardNumber.getInstance();
        IDCardNumber card_2 = IDCardNumber.getInstance();
        System.out.println("Are the id cards the same: " + ((card_1 == card_2) ? "yes" : "no"));

        String id_1 = card_1.getNumber();
        String id_2 = card_2.getNumber();
        System.out.println("The first number: " + id_1);
        System.out.println("The second number: " + id_2);
        System.out.println("Are the id numbers the same: " + ((id_1.equals(id_2)) ? "yes" : "no"));
        System.out.println("Are these two String objects the same: " + ((id_1 == id_2) ? "yes" : "no"));
    }
}
