package complex_tasks_tests.entity_tests;

import complex_tasks.entity_manager.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EntityManagerTest extends MainEntityManagerTest {

    @Test
    public void canAddElementsToList() {
        manager.addEntity(lena);
        Assertions.assertEquals(lena, manager.getEntityList().getFirst());
    }

    @Test
    public void canRemoveElementFromList() {
        manager.addEntity(lena);
        Assertions.assertEquals(lena, manager.getEntityList().getFirst());
        manager.removeEntity(lena);
        Assertions.assertTrue(manager.getEntityList().isEmpty());
    }

    @Test
    public void canGetCopyOfList() {
        manager.addEntity(lena, misha, bob, marina);
        List<Person> initialList = manager.getEntityList();
        List<Person> actualList = manager.getAnotherList(initialList);
        Assertions.assertEquals(initialList, actualList);
        Assertions.assertThrows(UnsupportedOperationException.class, () -> actualList.set(0, monica));
    }
}
