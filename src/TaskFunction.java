import java.util.ArrayList;

public class TaskFunction
{
    private ArrayList<Task> tasks;
    private int IdNew = 1;

    public TaskFunction()
    {
        tasks = new ArrayList<>();
        IdNew = 1;
    }

    public void AddTask(String Title, int Priority)
    {
        Task NewTask = new Task(Title, Priority);
        NewTask.setId(IdNew);
        IdNew++;
        tasks.add(NewTask);
        System.out.println("Task is now Added --> ID: " + NewTask.getId());
        System.out.println();
    }

    public void Completed(int key)
    {
            for (int i = 0; i < tasks.size(); i++)
            {
                Task one = tasks.get(i);
                int val = one.getId();
                if (val == key)
                {
                    one.setCompleted(true);
                    System.out.println("Task marked Completed");
                    System.out.println();
                    return;

                }

            }
            System.out.println("Task not found");


    }

    public void AllTasks()
    {
        if (tasks.size() == 0)
        {
            System.out.println("Congrats, you have no tasks left");
        }

        else
        {
            for(int i = 0; i < tasks.size(); i++)
            {
                tasks.get(i).PrintDetails();
            }
        }
    }

    public void RemoveTask(int val)
    {
        for (int i = 0; i < tasks.size(); i++)
        {
            Task one = tasks.get(i);
            int val1 = one.getId();
            if (val1 == val)
            {
                tasks.remove(i);
                System.out.println("Task with Id " + val + " deleted");
                System.out.println();
                return;
            }

        }
        System.out.println("Task not found to delete");
        System.out.println();
    }

    public void InsertionSortPriority()
    {
        for (int i = 1; i < tasks.size(); i++)
        {
            Task one = tasks.get(i);
            int q = i - 1;

            while (q >= 0 && tasks.get(q).getPriority() > one.getPriority())
            {
                tasks.set(q + 1, tasks.get(q));
                q = q - 1;
            }
            tasks.set(q + 1, one);

        }

        System.out.println("Your Tasks are now Sorted by Priority");
    }

    public void SearchByName(String key1)
    {
        for (int i = 0; i < tasks.size(); i++)
        {
            Task one = tasks.get(i);
            String key2 = one.getTitle();
            if (key2.toLowerCase().contains(key1.toLowerCase()))
            {
                System.out.println("Task Found");
                System.out.println();
                one.PrintDetails();
                return;
            }



        }
        System.out.println("Task Not Found");

    }
}
