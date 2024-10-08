public class Patterns {
    public static void main(String[] args) {
        // Create objects of each class
        RightHalfPyramid rightHalfPyramid = new RightHalfPyramid();
        ReverseRightHalfPyramid reverseRightHalfPyramid = new ReverseRightHalfPyramid();
        LeftHalfPyramid leftHalfPyramid = new LeftHalfPyramid();

        // Call methods to print patterns
        System.out.println("Right Half Pyramid:");
        rightHalfPyramid.printRightHalfPyramid();

        System.out.println();

        System.out.println("Reverse Right Half Pyramid:");
        reverseRightHalfPyramid.printReverseRightHalfPyramid();

        System.out.println();

        System.out.println("Left Half Pyramid:");
        leftHalfPyramid.printLeftHalfPyramid();
    }
}
