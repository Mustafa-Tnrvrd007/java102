package Gun3.Ders5GenericInterface;


public interface IDatabase <T>{
    public abstract boolean insert(T data);
    public abstract boolean delete(T data);
    public abstract boolean update(T data);
    public abstract void select();
}
