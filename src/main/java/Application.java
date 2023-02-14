public class Application {
    /**
     * This class contains a main method that allows you to manually test the While loop lab functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.whileExample lab will get the sum of all numbers from 1 to some number >1. All code required to
     * calculate this is provided in the while loop lab documentation.
     */
    public static void main(String[] args) {
        int end = 5;
        int sum = 0;
        int i = 0;
    
        while (i<end){
            sum = sum+i;
            System.out.println(sum);

            i++;
        }
     }
}
