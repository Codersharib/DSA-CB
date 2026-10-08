package Lec23;

public class cars implements Comparable<cars> {
    int price;
    int speed;
    String color;
    public cars(){

    }
    public cars(int price,int speed,String color){
        this.price=price;
        this.speed=speed;
        this.color=color;
    }
    @Override
    public String toString(){
        return "P "+price+" S "+speed+" C "+color;
    }
    // @Override
    // public int compareTo(cars o){
    //     // return this.price-o.price;
    //     return o.speed-this.speed;
    // }
}
