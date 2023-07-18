import java.util.Random;

public class Phone {
    private String number;
    public String model;
    private double weight;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight should be greater than 0.");
        }
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName + ".");
    }

    public void call(String receiverName) {
        Random random = new Random();
        boolean callSuccessful = random.nextBoolean();

        if (callSuccessful) {
            System.out.println("Дозвонился до " + receiverName + ".");
        } else {
            System.out.println("Абонент " + receiverName + " не доступен.");
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setNumber("+123456789");
        phone1.model = "Phone Model 1";
        phone1.setWeight(150.5);

        Phone phone2 = new Phone();
        phone2.setNumber("+987654321");
        phone2.model = "Phone Model 2";
        phone2.setWeight(180.2);

        Phone phone3 = new Phone();
        phone3.setNumber("+456789123");
        phone3.model = "Phone Model 3";
        phone3.setWeight(200.0);

        System.out.println("Phone 1: Number: " + phone1.getNumber() + ", Model: " + phone1.model + ", Weight: " + phone1.getWeight());
        System.out.println("Phone 2: Number: " + phone2.getNumber() + ", Model: " + phone2.model + ", Weight: " + phone2.getWeight());
        System.out.println("Phone 3: Number: " + phone3.getNumber() + ", Model: " + phone3.model + ", Weight: " + phone3.getWeight());

        phone1.receiveCall("ИГОРЬ");
        phone2.receiveCall("МАКСИМ");
        phone3.receiveCall("ИРА");

        phone1.call("СВЕТЛАНА");
        phone2.call("КОНСТАНТИН");
        phone3.call("ЕЛЕНА");
    }
}
