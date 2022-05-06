public class Operator_Challenge {
    public static void main(String[] args) {
        double doub_var1 = 20.00d, doub_var2 = 80.00d;
        double res1 = (doub_var1+doub_var2)*100.00;
        double rem = res1%40.00;
        boolean flag;
        if(rem==00)
            flag = true;

        else
            flag = false;


        System.out.println(flag);
        if (!flag)
            System.out.println("Got some Remainder");
    }
}
