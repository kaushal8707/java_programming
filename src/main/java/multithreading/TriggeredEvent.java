package multithreading;

public class TriggeredEvent implements Runnable
{
    int barrier_point_num;
    public TriggeredEvent(int barrier_point)
    {
        this.barrier_point_num=barrier_point;
    }
    @Override
    public void run()
    {
        System.out.println("Event Got Triggered after reaching all "+barrier_point_num);
    }
}
