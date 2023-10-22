
//This class is so important, because here we realize Methods from Database ---
//--- interface used extending JavaApplication class and implementing Database interface
public class AdapterJavaToDatabase extends JavaApplication implements Database {

    //Connected methods
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
