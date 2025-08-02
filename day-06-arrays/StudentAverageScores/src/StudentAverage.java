public class StudentAverage {
    public static void main(String[] args){
        int sum = 0;
        //defining an array with student grades
        int[] grades = {46, 57, 89, 34, 52, 92, 66, 33, 76, 86};

        //looping through the array
        for(int grade : grades){
            sum += grade;
        }
        System.out.println("The total sum is: " + sum);
        int average = sum / grades.length; 
        System.out.println("The average: " + average);
    }
}
