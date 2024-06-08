package bonusTask;

//Створіть ієрархію класів для представлення транспортних засобів:автомобілі,
//велосипеди та човни.Кожен транспортний засіб повинен мати метод для обчислення
//максимальної швидкості та виведення інформації про себе.Створіть абстрактний
//клас або інтерфейс, який містить методи для обчислення максимальної
//швидкості та виведення інформації. Реалізуйте цей абстрактний клас
//у кожному класі транспортного засобу .

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mersedes-Benz", 100, 250);
        Bike bike = new Bike(25, 21);
        Boat boat = new Boat(75, 200);
        car.describe();
        bike.describe();
        boat.describe();
    }
}
