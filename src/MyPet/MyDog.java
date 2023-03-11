package MyPet;

public class MyDog {

    private String name;
    private int satiety;
    private MyHouse room;


    public MyDog(String name){
        this.name = name;
        this.satiety = 2;
        this.room = MyHouse.livingroom;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goRoom(MyHouse room) {
        System.out.println(this.name + " ушел в " + room);
        if (this.satiety > 0) this.satiety--;
        this.room = room;
    }

    public String getRoom() {
        return room.toString();
    }

    public String getSatiety(){
        if (this.satiety == 2) return "сыт";
        else if (this.satiety == 1) return "немного голоден";
        else return "сильно голоден";
    }

    @Override
    public String toString(){
        return this.name + " находится в " + this.room + " и " + getSatiety();
    }

    public String tryCall(MyPerson person){
        if (person.getRoom() == this.getRoom()) return this.name + " лает";
        return null;
    }

    public String eat(MyPerson person){
        if (person.getRoom() == this.getRoom()){
            if (this.satiety < 2) {
                this.satiety = 2;
                return this.name + " поел и теперь сыт";
            }
            else return this.name + " уже сыт";
        }
        else return this.name + " находится в другой комнате";
    }
}
