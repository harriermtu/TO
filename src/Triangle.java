import java.io.*;

// CSC108 Chapter 4, Question 19
// Name:  Iam Me         Student ID: 555555555
// Tutor: Andria Hunter  Prof: Ken Jackson
//
// Program Description: This program uses the Triangle class
//     to create a triangle object.  It then uses the is_right,
//     is_scalene, is_isosceles, and is_equilateral methods
//     to test what type of triangle it is.

// The Triangle class contains three variables to store the length
// of each side of the triange, and methods that can be used to determine
// determine if a triange is right, scalene, isoscelese, and equilateral.

class Triangle {

   // Stores the length of each side of the Triangle object.
   private int side1, side2, side3;

   // Constructor to initialize the sides of the triangle.
   public Triangle (int s1, int s2, int s3) {
       if (is_Triangle(s1,s2,s3)) {
           side1 = s1;
           side2 = s2;
           side3 = s3;
       }
       else System.out.println("To nie jest trojkat");
   }

    public Triangle() {
    }

    public boolean is_Triangle(int s1, int s2, int s3){
        if (Math.abs(s2-s3) < s1 && s1 < s2 + s3) return true;
        else return false;
    }


   // Method to test for a right-angled triangle.
   public boolean is_right () {
       if (is_Triangle(side1,side2,side3)) {
           if (((side1 * side1) == ((side2 * side2) + (side3 * side3))) ||
                   ((side2 * side2) == ((side1 * side1) + (side3 * side3))) ||
                   ((side3 * side3) == ((side1 * side1) + (side2 * side2))))
               return true;
           else
               return false;
       }
       else {
           return false;
       }
   }

   // Method to test for a scalene triangle.
   public boolean is_scalene () {
       if (is_Triangle(side1,side2,side3)) {
           if ((side1 != side2) && (side1 != side3) && (side2 != side3))
               return true;
           else
               return false;
       }
       else {
           return false;
       }
   }

   // Method to test for an isosceles triangle.
   public boolean is_isosceles () {
       if (is_Triangle(side1,side2,side3)) {
           if (((side1 == side2) && (side1 != side3)) ||
                   ((side1 == side3) && (side1 != side2)) ||
                   ((side2 == side3) && (side2 != side1)))
               return true;
           else
               return false;
       }
       else {
           return false;
       }
   }

   // Method to test for an equilateral triangle.
   public boolean is_equilateral () {
       if (is_Triangle(side1,side2,side3)) {
           if ((side1 == side2) && (side1 == side3))
               return true;
           else
               return false;
       }
       else {
           return false;
       }
   }
}

// The Test_Triangle class contains one main method where program
// execution starts.  It allows the user to create triangle objects
// by entering the dimensions for the three sides of the triangle,
// and it determines the type of each triangle.  The user types 'n'
// when they want to quit the program (must enter at least 1 triangle).
class Test_Triangle {

   // Main method that allows the user to enter the dimentions for
   // three sides of a triangle.  These dimensions are then used to
   // create a Triangle object, and this object is tested to determine
   // what type of triangle it is.
   public static void main (String[] args) throws IOException {

      // Declare stdin so data can be read from input.
      DataInputStream stdin = new DataInputStream (System.in);

      // loop exits when the user response is "n"
      String user_response = "y";
      while (!user_response.equals("n")) {

         // Ask user for 3 dimensions of triangle.
         System.out.println ("\nEnter side1 length: ");
         int side1 = Integer.parseInt (stdin.readLine());

         System.out.println ("Enter side2 length: ");
         int side2 = Integer.parseInt (stdin.readLine());

         System.out.println ("Enter side3 length: ");
         int side3 = Integer.parseInt (stdin.readLine());

         // Now use these values to create a Triangle object.
         Triangle tri = new Triangle (side1,side2,side3);

         // Determine what kind of triangle it is.
         System.out.println ("\nIs triangle right-angle? "+tri.is_right());
         System.out.println ("Is triangle scalene?     "+tri.is_scalene());
         System.out.println ("Is triangle isosceles?   "+
                                                       tri.is_isosceles());
         System.out.println ("Is triangle equilateral? "+
                                                     tri.is_equilateral());
         // Ask user if they want to continue.
         System.out.println ("\nDo you want to examine more triangles?");
         System.out.println ("(type 'y' for yes or 'n' for no)");
         user_response = stdin.readLine();
      }
   }
}
