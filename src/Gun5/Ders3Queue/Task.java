package Gun5.Ders3Queue;

public class Task {
    private String name;
    private int priority;

    public Task(String name,int priority){
        setName(name);
        setPriority(priority);
    }

    @Override
    public String toString() {
        return "Görev : "+getName()+"  , Oncelik sirasi : "+getPriority();
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name ){
        this.name = name;
    }
    public int getPriority(){
        return this.priority;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
}
