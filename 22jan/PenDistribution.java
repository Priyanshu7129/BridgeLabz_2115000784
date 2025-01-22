public class PenDistribution{
        public static void main(String[] args){
                int numOfPens = 14;
                int numOfStudents = 3;

                int penPerStudent = numOfPens / numOfStudents;
                int remainingPen = numOfPens % numOfStudents;

                System.out.print("The Pen Per student is " + penPerStudent       + " and the remaining pen not distributed is " + remainingPen);
}
}

