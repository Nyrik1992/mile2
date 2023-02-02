public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10;
//        boolean spent = true;


        int mile;
        if (ticketPrice > 20) {

            mile =ticketPrice/20;
        } else {
                mile = 0;
        }



        System.out.println("Ваш бонус: "+ mile);
    }
}