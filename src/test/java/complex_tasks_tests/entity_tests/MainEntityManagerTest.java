package complex_tasks_tests.entity_tests;

import complex_tasks.entity_manager.EntityManager;
import complex_tasks.entity_manager.Person;
import org.junit.jupiter.api.BeforeEach;

public class MainEntityManagerTest {

    protected EntityManager<Person> manager;
    protected Person lena;
    protected Person misha;
    protected Person bob;
    protected Person marina;
    protected Person monica;

    @BeforeEach
    public void setUp() {
        manager = new EntityManager<>();
        lena = new Person("Lena", 19, true);
        misha = new Person("Misha", 43, true);
        bob = new Person("Bob", 25, false);
        marina = new Person("Marina", 22, true);
        monica = new Person("Monica", 34, false);
    }
}
