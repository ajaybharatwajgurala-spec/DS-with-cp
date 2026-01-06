class Demo {

    public String add(int a, int b) {
        if (a % 2 == 0) {
            return "even";
        }
        return "odd";
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        String r = obj.add(28, 8);
        System.out.println(r);
    }
}
