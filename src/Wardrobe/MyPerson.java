package Wardrobe;

public class MyPerson {
    private String name;
    private int things = 0;


    public MyPerson(String name) {
        this.name = name;
        System.out.printf("Есть человек, который пользуется гардеробом: %s\n", this.getName());
    }

    public MyPerson() {
        this("Ivan");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void intThings(int value) {
        this.things += value;
        System.out.printf("%s получил %d вещей. Общее количество: %d\n", this.name, value, this.things);
    }
    @Override
    public String toString(){
        return String.format("%s: %d вещей\n", this.name, this.things);
    }

    public void open(MyWardrobe myWardrobe) {
        System.out.print(name + ": попытка открыть " + myWardrobe.getName() + " -> ");
        System.out.println(myWardrobe.tryOpen());
    }

    public void close(MyWardrobe myWardrobe) {
        System.out.print(name + ": попытка закрыть " + myWardrobe.getName() + " -> ");
        System.out.println(myWardrobe.tryClose());
    }

    public void get(MyWardrobe myWardrobe, int value) {
        System.out.print(name + ": попытка взять вещи из " + myWardrobe.getName() + " -> ");
        int x = myWardrobe.tryGet(value);
        this.things += x;
        if (x != 0) System.out.printf("%s взял из %s %d вещей\n", this.name, myWardrobe.getName(), x);
    }

    public void put(MyWardrobe myWardrobe, int value) {
        System.out.print(name + ": попытка положить вещи в " + myWardrobe.getName() + " -> ");
        if (value > this.things) System.out.println("Недостаточно вещей");
        else {
            int x = myWardrobe.tryPut(value);
            this.things -= x;
            if (x != 0) System.out.printf("%s положил в %s %d вещей\n", this.name, myWardrobe.getName(), x);}
    }
}
