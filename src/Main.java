public class Main {
    public static void main(String[] args) {
        int moneyBag = 100;
        int addTo = 1999;
        int account = moneyBag + addTo;

        int bonusTern = addTo > 1000 ? addTo / 100 : 0; // класс
        System.out.println("Бонусов: " + bonusTern);
        System.out.println("На счету: " + (account + bonusTern));


//        int bonus = 0;
//        if (addTo < 1000) {
//            System.out.println("Бонусов: " + bonus);
//            System.out.println("На счету: " + account);
//        } else {
//            bonus = addTo / 100;
//            System.out.println("Бонусов: " + bonus);
//            System.out.println("На счету: " + (account + bonus));
//        }


    }
}
