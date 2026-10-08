class OddEvenSwitch {
    public static void main(String[] args) {
        int num = 10;
        int rem = num % 2;

        switch (rem) {
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }
    }
}