package clean_code.patterns.homework.task_5;

public class ClassicFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
