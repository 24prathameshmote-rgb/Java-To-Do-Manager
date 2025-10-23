public class Task
{
    private String Title;
    private boolean Completed = false;
    private int Priority;

    private int Id;

    public Task(String Title, int Priority)
    {
        this.Title = Title;
        this.Priority = Priority;
    }

    public void setTitle(String name)
    {
        Title = name;
    }

    public String getTitle()
    {
        return Title;
    }

    public void setCompleted(boolean Completed)
    {
        this.Completed = Completed;
    }

    public boolean getCompleted()
    {
        return Completed;
    }

    public void setPriority(int val)
    {
        if (val > 0 && val < 6)
        {
            Priority = val;
        }
        else
        {
            System.out.println("Please enter a value between 1 and 5");
        }
    }

    public int getPriority()
    {
        return Priority;
    }

    public void setId(int val)
    {
        Id = val;
    }

    public int getId()
    {
        return Id;
    }

    public void PrintDetails()
    {
        System.out.println("Title: " + Title);
        System.out.println("Completed? : " + Completed);
        System.out.println("Priority: " + Priority);
        System.out.println("Id: " + Id);
        System.out.println("----------------------------");
    }

}
