public class Malicious {
    public static void main(String[] args) {
        maliciousMathod(new CreditCard());
    }
    static void maliciousMathod(CreditCard card) {
        // class CreaditCard set fields to private and its fields can't accesse outside.
        card.expenses = 0.0;
        System.out.println(card.cardNumber);
    }
}