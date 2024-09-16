package HW3.Task2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonRepository {
    private EntityManagerFactory emf;

    public PersonRepository() {
        emf = Persistence.createEntityManagerFactory("your-persistence-unit");
    }

    public void addPerson(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }

    public void updatePerson(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(person);
        em.getTransaction().commit();
        em.close();
    }

    public void deletePerson(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = em.find(Person.class, id);
        if (person != null) {
            em.remove(person);
        }
        em.getTransaction().commit();
        em.close();
    }
    public class Main {
        public static void main(String[] args) {
            PersonRepository repository = new PersonRepository();

            // Добавление нового человека
            Person person = new Person("Bob", 25);
            repository.addPerson(person);

            // Обновление информации о человеке
            person.setAge(26);
            repository.updatePerson(person);

            // Удаление человека по ID
            repository.deletePerson(person.getId());
        }
    }
}
