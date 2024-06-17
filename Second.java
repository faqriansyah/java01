public class Second {
    public static void Another() {
        System.out.println("Helo from another file");
    }

    public static void Scope(){
        // NO 
        {
            // NO
            int a = 1;
            // YES
            System.out.println(a);
        }

        //NO 
    }

    public static String funy(String name){
        return name;
    }

    public static int funy(int num){
        return num;        
    }

    public static void ArrLoopN() {
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int[] i : myNumbers) {
            for (int x : i) {
                System.out.println(x);
            }
        }
    }

    public static void BreakContin() {
        int a = 0;
        while (a <= 10) {
            if (a % 2 == 1) {
                ++a;
                continue;
            }
            ++a;
            System.out.println(a);
        }
    }

    public static void ArrLoop() {
        String[] names = { "Joko", "Udin", "Jack" };

        for (String x : names) {
            System.out.println(x);
        }
    }

    public static void Loop() {
        // for (int x = 0; x < 10; x++) {
        // if (x % 2 == 0) {
        // System.out.println(x + " is Positif");
        // } else {
        // System.out.println(x + " is Negative");
        // }
        // }
        // for(int a = 0; a <= 5; ++a) {
        // System.out.println("from outer");
        // for(int b = 0; b <= 5;++b) {
        // System.out.println("From inner");
        // }
        // }
    }

    public static void Switch() {
        @SuppressWarnings("unused")
        int grade = 50;
    }

    public static void ConditionalShorthand() {
        boolean x = true;
        String status = (x) ? "You are allowed to play" : "Your are \" not \" allowed to play";
        System.out.println(status);
    }

    public static void Battery() {
        int lvl = 20;

        if (lvl <= 20)
            System.out.println("Your battery is low");
    }

    public static void Math() {
        int num1 = 12, num2 = 21;
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));

        System.out.println(Math.sqrt(num2));
    }
}
