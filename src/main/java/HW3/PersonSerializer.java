package HW3;
import java.io.*;

public class PersonSerializer {

    // Метод для сериализации объекта Person в файл
    public static void serializePerson(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Сериализация завершена: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для десериализации объекта Person из файла
    public static Person deserializePerson(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person person = (Person) ois.readObject();
            System.out.println("Десериализация завершена: " + person);
            return person;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Создаем объект Person
        Person person = new Person("Alice", 30);

        // Сериализуем объект в файл
        String filename = "person.ser";
        serializePerson(person, filename);

        // Десериализуем объект из файла
        Person deserializedPerson = deserializePerson(filename);
    }
}
