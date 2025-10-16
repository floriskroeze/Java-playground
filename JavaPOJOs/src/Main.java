public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            Student s = new Student(
                    "S92300" + i,
                    switch(i) {
                        case 1 -> "Mary";
                        case 2 -> "Bill";
                        case 3 -> "William";
                        case 4 -> "Joann";
                        case 5 -> "Heather";
                        default -> "Unknown";
                        },
                    "05/11/1985",
                    "Java masterclass");

            System.out.println(s.toString());
        }


    }
}
