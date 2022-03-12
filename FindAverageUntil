public class FindAverageUntil {
    public static void main(String[] args) {
        int n, sum = 0, counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        for (n=0 ; n<=num ; n+=2) {
            if (n%3 == 0 || n%4 == 0) {
                sum += n;
            }
            counter ++;
        }
        double average = sum / counter;
        System.out.println("The average is " + average);
    }
}
