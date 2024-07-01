/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.pkgfinal.pkg_.tshabalala;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class registrationFinal {
    public class TaskManager {

        // method to show report options
        private static void showReport() {
            List<Task> allTasks = Task.getAllTasks();
            if (allTasks.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No tasks available to generate report.");
                return;
            }

            String[] reportOptions = {"View all tasks", "Delete task using task name", "Search task by developer", "Task with the longest duration", "View 'done' tasks", "Search task by name"};
            String reportChoice = (String) JOptionPane.showInputDialog(null, "Select report option", "Report Options", JOptionPane.QUESTION_MESSAGE, null, reportOptions, reportOptions[0]);

            if (reportChoice != null) {
                switch (reportChoice) {
                    case "View all tasks":
                        viewTasks();
                        break;
                    case "Delete task using task name":
                        String taskNameToDelete = JOptionPane.showInputDialog(null, "Enter the name of the task");
                        deleteTaskByName(taskNameToDelete);
                        break;
                    case "Search task by developer":
                        String developerName = JOptionPane.showInputDialog(null, "Enter the developer name");
                        searchTasksByDeveloper(developerName);
                        break;
                    case "Task with the longest duration":
                        displayTaskWithLongestDuration();
                        break;
                    case "View 'done' tasks":
                        displayAllDoneTasks();
                        break;
                    case "Search task by name":
                        String taskName = JOptionPane.showInputDialog(null, "Enter the task name to search");
                        searchTaskByName(taskName);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option selected.");
                        break;
                }
            }
        }

        // method for viewing tasks 
        private static void viewTasks() {
            List<Task> allTasks = Task.getAllTasks();
            if (allTasks.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No tasks available");
            } else {
                StringBuilder taskDetails = new StringBuilder();
                for (Task task : allTasks) {
                    taskDetails.append(task.printTaskDetails()).append("\n\n");
                }
                JOptionPane.showMessageDialog(null, taskDetails.toString());
            }
        }

        private static void deleteTaskByName(String taskName) {
            List<Task> allTasks = Task.getAllTasks();
            Task taskToDelete = null;
            for (Task task : allTasks) {
                if (task.getTaskName().equalsIgnoreCase(taskName)) {
                    taskToDelete = task;
                    break;
                }
            }
            if (taskToDelete != null) {
                allTasks.remove(taskToDelete);
                JOptionPane.showMessageDialog(null, "Task with name \"" + taskName + "\" deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Task with name \"" + taskName + "\" not found");
            }
        }

        private static void searchTasksByDeveloper(String developerName) {
            List<Task> allTasks = Task.getAllTasks();
            StringBuilder tasksFound = new StringBuilder();
            boolean tasksFoundFlag = false;
            for (Task task : allTasks) {
                if (task.getDeveloperDetails().equalsIgnoreCase(developerName)) {
                    tasksFound.append(task.printTaskDetails()).append("\n\n");
                    tasksFoundFlag = true;
                }
            }
            if (tasksFoundFlag) {
                JOptionPane.showMessageDialog(null, "Tasks assigned to developer \"" + developerName + "\":\n\n" + tasksFound.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No tasks found for developer \"" + developerName + "\".");
            }
        }

        // displaying task with longest duration 
        private static void displayTaskWithLongestDuration() {
            List<Task> allTasks = Task.getAllTasks();
            if (allTasks.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No tasks available.");
                return;
            }

            Task longestDurationTask = allTasks.get(0);
            for (Task task : allTasks) {
                if (task.getTaskDuration() > longestDurationTask.getTaskDuration()) {
                    longestDurationTask = task;
                }
            }
            JOptionPane.showMessageDialog(null, "Task with the longest duration:\n\n" + longestDurationTask.printTaskDetails());
        }

        // This method was missing in the original code, so adding a placeholder
        private static void displayAllDoneTasks() {
            // Implementation for displaying all tasks marked as 'done'
        }

        // This method was missing in the original code, so adding a placeholder
        private static void searchTaskByName(String taskName) {
            // Implementation for searching a task by its name
        }
    }

    // Placeholder for Task class since it's referenced in TaskManager methods
    public static class Task {
        public static List<Task> getAllTasks() {
            // Return a list of all tasks
            return null;
        }

        public String getTaskName() {
            // Return the task name
            return null;
        }

        public String getDeveloperDetails() {
            // Return developer details
            return null;
        }

        public int getTaskDuration() {
            // Return task duration
            return 0;
        }

        public String printTaskDetails() {
            // Return task details as a string
            return null;
        }
    }
}



