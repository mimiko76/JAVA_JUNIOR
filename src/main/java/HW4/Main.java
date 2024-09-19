package HW4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        // Создаем SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Открываем сессию
        Session session = sessionFactory.openSession();

        try {
            // Начинаем транзакцию
            session.beginTransaction();

            // Создаем и сохраняем объекты Person
            Person person1 = new Person("Alice", 30);
            Person person2 = new Person("Bob", 25);

            session.save(person1);
            session.save(person2);

            // Завершаем транзакцию
            session.getTransaction().commit();

            System.out.println("Persons saved successfully!");

        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
