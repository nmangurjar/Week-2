//Create course class
class Course {
    static String instituteName = "Rajiv Gandhi institute";
    String courseName;
    int duration;
    double fee;

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Method to display details of the course
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Create instances of the Course class
        Course c1 = new Course("Java Programming", 8, 3000.00);
        Course c2 = new Course("Web Development", 12, 5000.00);

       //Display course details
        System.out.println("Course 1:");
        c1.displayCourseDetails();

        System.out.println("Course 2:");
        c2.displayCourseDetails();

        // Update the institute name
        Course.updateInstituteName("Tit institute");

        // Display details
        System.out.println("New Institute Name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}