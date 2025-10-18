public class Main {
    public static void main(String[] args) {
        SalariedEmployee dave = new SalariedEmployee("Dave", "19-07-1987",   "09-09-2020", 45000);
        System.out.println(dave.toString());
        System.out.println(dave.getAge(2025));
        System.out.println(dave.collectPay());
        dave.retire("18-10-2025");
        System.out.println(dave.collectPay());
        System.out.println(dave.toString());

        HourlyEmployee matthew = new HourlyEmployee("Matthew", "27-01-1996",  "20-10-2024", 20.50);
        System.out.println(matthew.toString());
        matthew.getAge(2025);
        System.out.println(matthew.collectPay());
        System.out.println(matthew.getDoublePay());
        System.out.println(matthew.toString());
    }
}
