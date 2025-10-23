import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);

        TaskFunction starter = new TaskFunction();
        boolean loop = true;


        System.out.println("Welcome to your To-Do Manager");
        while (loop)
        {
            System.out.println();

            System.out.println("-----------------------------");
            System.out.println("Please pick any of the following options");
            System.out.println();
            System.out.println("1. Add new task");
            System.out.println("2. Remove a task");
            System.out.println("3. Mark off a task");
            System.out.println("4. List all tasks");
            System.out.println("5. Sort tasks by priority");
            System.out.println("6. Search task by name");
            System.out.println("7. Exit");


            int option = userInput.nextInt();
            userInput.nextLine();

            if (option == 1)
            {
                System.out.println("Enter Task description");
                String task = userInput.nextLine();
                System.out.println("Enter Task priority from 1 - 5. 1 being urgent");
                int taskPriority = userInput.nextInt();

                starter.AddTask(task, taskPriority);

            }
            else if (option == 2)
            {
                System.out.println("Enter Task ID you wish to Remove");
                int idToRemove = userInput.nextInt();
                starter.RemoveTask(idToRemove);
            }

            else if (option == 3)
            {
                System.out.println("Enter Task ID you wish to be mark completed");
                int idCompleted = userInput.nextInt();
                starter.Completed(idCompleted);
            }

            else if(option == 4)
            {
                System.out.println("----------------------------");
                starter.AllTasks();
            }

            else if(option == 5)
            {
                starter.InsertionSortPriority();
            }

            else if(option == 6)
            {
                System.out.println("Enter key word of a task");
                String keyWord = userInput.nextLine();
                starter.SearchByName(keyWord);

            }

            else if(option == 7)
            {
                System.out.println("You have exited");
                loop = false;
            }

            else
            {
                System.out.println("Enter a valid option");
            }
        }
    }
}