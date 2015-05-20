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

// Przerobił na C# Paweł Ślusarczyk

using System;

public class Triangle
{

    // Stores the length of each side of the Triangle object.
    private int side1, side2, side3;

    // Constructor to initialize the sides of the triangle.
    public Triangle(int s1, int s2, int s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    // Method to test for a right-angled triangle.
    public bool IsRightAngled()
    {
        if (((side1 * side1) == ((side2 * side2) + (side3 * side3))) ||
            ((side2 * side2) == ((side1 * side1) + (side3 * side3))) ||
            ((side3 * side3) == ((side1 * side1) + (side2 * side2))))
            return true;
        else
            return false;
    }

    // Method to test for a scalene triangle.
    public bool IsScalene()
    {
        if ((side1 != side2) && (side1 != side3) && (side2 != side3))
            return true;
        else
            return false;
    }

    // Method to test for an isosceles triangle.
    public bool IsIsosceles()
    {
        if (((side1 == side2) && (side1 != side3)) ||
            ((side1 == side3) && (side1 != side2)) ||
            ((side2 == side3) && (side2 != side1)))
            return true;
        else
            return false;
    }

    // Method to test for an equilateral triangle.
    public bool IsEquilateral()
    {
        if ((side1 == side2) && (side1 == side3))
            return true;
        else
            return false;
    }
}

// The TriangleTests class contains one main method where program
// execution starts.  It allows the user to create triangle objects
// by entering the dimensions for the three sides of the triangle,
// and it determines the type of each triangle.  The user types 'n'
// when they want to quit the program (must enter at least 1 triangle).
public class TriangleTests
{

    // Main method that allows the user to enter the dimentions for
    // three sides of a triangle.  These dimensions are then used to
    // create a Triangle object, and this object is tested to determine
    // what type of triangle it is.
    public static void Main(String[] args)
    {

        // loop exits when the user response is "n"
        String userResponse = "y";
        while (userResponse != "n")
        {

            // Ask user for 3 dimensions of triangle.
            System.Console.WriteLine("\nEnter side1 length: ");
            int side1 = Int32.Parse(System.Console.ReadLine());

            System.Console.WriteLine("Enter side2 length: ");
            int side2 = Int32.Parse(System.Console.ReadLine());

            System.Console.WriteLine("Enter side3 length: ");
            int side3 = Int32.Parse(System.Console.ReadLine());

            // Now use these values to create a Triangle object.
            Triangle tri = new Triangle(side1, side2, side3);

            // Determine what kind of triangle it is.
            System.Console.WriteLine("\nIs triangle right-angle? " + tri.IsRightAngled());
            System.Console.WriteLine("Is triangle scalene?     " + tri.IsScalene());
            System.Console.WriteLine("Is triangle isosceles?   " +
                                                          tri.IsIsosceles());
            System.Console.WriteLine("Is triangle equilateral? " +
                                                        tri.IsEquilateral());
            // Ask user if they want to continue.
            System.Console.WriteLine("\nDo you want to examine more triangles?");
            System.Console.WriteLine("(type 'y' for yes or 'n' for no)");
            userResponse = System.Console.ReadLine();
        }
    }
}
