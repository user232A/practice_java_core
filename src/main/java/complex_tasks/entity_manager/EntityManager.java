package complex_tasks.entity_manager;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

public class EntityManager<T> {

    private List<T> entityList;

    public EntityManager() {
        this.entityList = new CopyOnWriteArrayList<>();
    }

    public List<T> getEntityList() {
        return entityList;
    }

    public void addEntity(T... entity) {
        entityList.addAll(Arrays.asList(entity));
    }

    public void removeEntity(T entity) {
        entityList.remove(entity);
    }

    public List<T> getAnotherList(List<T> list) {
        try {
            return List.copyOf(list);
        } catch (UnsupportedOperationException e) {
            e.getStackTrace();
        }
        return List.of();
    }

    public List<T> getPersonListMoreAge(Predicate<T> predicate) {
        return entityList.stream().filter(predicate).toList();
    }

    public List<T> getPersonListLessAge(Predicate<T> predicate) {
        return entityList.stream().filter(predicate).toList();
    }

    public List<T> getPersonListByName(Predicate<T> predicate) {
        return entityList.stream().filter(predicate).toList();
    }

    public List<T> getPersonListByActive(Predicate<T> predicate) {
        return entityList.stream().filter(predicate).toList();
    }
}
