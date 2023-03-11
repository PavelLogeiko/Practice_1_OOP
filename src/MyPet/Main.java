// Задача 3. Подумать как описать логику взаимодействия человека и домашнего питомца.
// Сценарий: Человек зовёт кота / собаку  - > кот / собака отзывается и пр.

package MyPet;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 3. Описать в ООП - стиле логику взаимодействия человек - домашний питомец.");
        System.out.println("\nОбъекты взаимодействия человек - собака:");
        MyPerson man = new MyPerson("Иван");
        MyDog dog = new MyDog("Рекс");
        System.out.printf("Человек - > %s, ", man.getName());
        System.out.printf("Собака -> %s\n", dog.getName());
        System.out.println("\nМестоположение и статус человека и собаки:");
        System.out.println(man);
        System.out.println(dog);
        System.out.println("\nВзаимодействие человека и собаки и его результаты:");
        man.call(dog);
        dog.goRoom(MyHouse.balcony);
        man.call(dog);
        System.out.println(dog);
        dog.goRoom(MyHouse.kitchen);
        System.out.println(dog);
        man.feed(dog);
        man.goRoom(MyHouse.kitchen);
        man.feed(dog);
        man.feed(dog);

        System.out.printf("\n%s и %s - довольны и счастливы !", man.getName(), dog.getName());

        System.out.println("\n\n__________конец__________");
    }
}
