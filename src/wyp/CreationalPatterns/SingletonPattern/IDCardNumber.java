package wyp.CreationalPatterns.SingletonPattern;

public class IDCardNumber {
    private static IDCardNumber instance = null;
    private String number;

    private IDCardNumber() {
    }

    public static IDCardNumber getInstance() {
        if (instance == null) {
            System.out.println("First Application for id card, get a new number.");
            instance = new IDCardNumber();
            instance.setNumber("No10086");
        } else {
            System.out.println("Duplicate application for id card, get the old number.");
        }
        return instance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
