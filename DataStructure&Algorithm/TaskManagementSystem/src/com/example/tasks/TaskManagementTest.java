package com.example.tasks;

public class TaskManagementTest {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task t1 = new Task("T001", "Design UI", "Pending");
        Task t2 = new Task("T002", "Develop Backend", "In Progress");
        Task t3 = new Task("T003", "Write Tests", "Completed");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        System.out.println("Tasks after adding:");
        taskList.traverseTasks();

        Task searched = taskList.searchTask("T002");
        if (searched != null) {
            System.out.println("Searched Task: " + searched);
        } else {
            System.out.println("Task not found.");
        }

        taskList.deleteTask("T002");
        System.out.println("Tasks after deletion:");
        taskList.traverseTasks();
    }
}
