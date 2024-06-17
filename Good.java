public class Good {
    public static void main(String[] args) {
        int time = 7;

        if(time < 1) {
            System.out.println("Midnight bro, go to sleep");
        } else if (time >= 1 && time <= 10) {
            System.out.println("Good Morning baby");
        } else if (time > 10 && time <= 14) {
            System.out.println("Good evening my friend");
        } else if (time > 14 && time <= 18) {
            System.out.println("Good afternoon my friend");
        } else if (time > 18 && time <= 22) {
            System.out.println("Good night the nighterians!");
        } else if (time > 22 && time <= 24) {
            System.out.println("Midnight bro, go to sleep");
        }
    }
}
