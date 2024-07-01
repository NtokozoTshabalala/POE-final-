/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.pkgfinal.pkg_.tshabalala;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */
public class POEFinal_Tshabalala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] 
        public class Task {
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private String taskStatus;
    private int taskDuration;
    private String taskID;
    private static int taskCount = 0;
    private static List<Task> taskList = new ArrayList<>();

    // Constructor
    public Task(String taskName, String taskDescription, String developerDetails, int taskDuration) {
        this.taskName = taskName;
        this.developerDetails = developerDetails;
        this.taskDescription = taskDescription;
        this.taskID = createTaskID();
        this.taskDuration = taskDuration;
        taskCount++;
        taskList.add(this);
    }

    // Getter methods
    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public String getTaskID() {
        return taskID;
    }

    // Setter method for task status
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public static List<Task> getAllTasks() {
        return taskList;
    }

    // Method to create taskID
    private String createTaskID() {
        String[] devNameParts = developerDetails.split(" ");
        String devInitials = devNameParts[0].substring(0, 1) + devNameParts[1].substring(0, 1);
        return taskName.substring(0, 2).toUpperCase() + ":" + taskCount + ":" + devInitials.toUpperCase();
    }

    // Method to print task details
    public String printTaskDetails() {
        return "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Duration: " + taskDuration + " hours\n" +
               "Task Status: " + taskStatus + "\n" +
               "Task ID: " + taskID;
    }

    // Method to check if task description length is valid
    public boolean checkTaskDescription(String taskDescription) {
        return taskDescription.length() <= 50;
    }
}
}
    

    


    
    

