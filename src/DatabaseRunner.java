
//Main class with starting a program, based on Adapter Pattern
public class DatabaseRunner {
    public static void main(String[] args) {

        //Using AdapterJavaToDatabase
        Database database = new AdapterJavaToDatabase();


        //Methods from Database interface without realization inside, but they are realized used to Adapter Pattern with AdapterJavaToDatabase class
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
