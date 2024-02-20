package Class;

public class Basics {
    String color;
    int tip;
    // Constructors
    Basics(){
        this.color = "Red";
        this.tip = 10;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String color) {
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
    int getTip(){
        return this.tip;
    }

    public static void main(String[] args){
        Basics p1 = new Basics();
        // p1.setColor("Yellow");
        // p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
      

    }
}
