// Задача 2.Описать в ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек.
// Какие члены должны быть у каждого из классов?

package Wardrobe;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 2. Описать в ООП - стиле логику взаимодействия объектов реального мира между собой: шкаф-человек");
        System.out.println("\nОбъекты взаимодействия шкаф - человек:");
        MyWardrobe myWardrobe = new MyWardrobe(5,20); // Имеется гардероб: Wardrobe. Вещей: 5 из 20, состояние: Closed
        MyPerson ivan = new MyPerson(); // Есть человек Ivan, который взаимодействует с гардеробом
        System.out.println("\nДействия по взаимодействию шкаф - человек и их результаты:");
        ivan.open(myWardrobe); // Ivan открывает гардероб - Wardrobe успешно открыт
        ivan.open(myWardrobe); // Ivan открывает гардероб - Wardrobe ранее уже открыт
        ivan.get(myWardrobe, 5); //Ivan успешно берет из гардероба 5 вещей
        System.out.print(myWardrobe); // В гардеробе Wardrobe вещей: 0 из 20, состояние: Opened
        ivan.close(myWardrobe); // Ivan закрывает гардероб - Wardrobe успешно закрыт
        System.out.print(myWardrobe); // В гардеробе Wardrobe вещей: 0 из 20, состояние: Closed
        System.out.printf("\n%s - одет и счастлив !", ivan.getName());
        System.out.println("\n\n__________конец__________");
    }
}
