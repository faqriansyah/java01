public class wrtiz {
    public static int Recurs(int a) {
        if (a > 5) {
            return a * Recurs(a - 20);
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(Recurs(11));
    }

    public static void test() {
        System.out.println("lalalala");
        test();
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum2(int k) {
        return sum2(k - 1);
    }
}

/*
 * We make a same method to call itself
 * But why we dont have same output? then why the sum returned 66? where does it
 * come from?
 * 
 * First we created a sum() function for sure, then make an conditional like as
 * you can see
 * The number from the parameter (wich is (int k)) will validated if greater
 * than zero it will be return k + sum(k - 1)
 * 
 * Assume that we passing number 20 there, the process pretty much look like
 * this
 * 
 * 1. Checking validation
 * 2. Parameter received from arguments then returned (wich is 20 right?)
 * 3. so the k is 20, it will be added to sum() function (itself) then decreased
 * it 1, then he result should be 19 right?
 * 4. Then when we pass argument 20, maybe the output is 20 + 19 = 39, but its
 * not!, why?
 * 
 * Well here is the experiment that we do for searching the reason why the
 * result is 210 instead of 39
 * 
 * 
 */
