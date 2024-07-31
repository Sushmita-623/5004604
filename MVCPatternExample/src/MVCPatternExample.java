public class MVCPatternExample {
    public static void main(String[] args) {
        // Create a student
        Student model = new Student("1", "John Doe", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(model, view);

        // Display the initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B+");

        // Display the updated student details
        controller.updateView();
    }
}
