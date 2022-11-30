public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.delete();
        cocheCrud.findAll();
        cocheCrud.save();
    }
}