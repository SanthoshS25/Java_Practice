package Chapter09_Generics;

public class DeliveryBox<T>{
    T item;

    public DeliveryBox(T item){
        this.item = item;
    }

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    public void showItem(){
        System.out.println(item);
    }
}