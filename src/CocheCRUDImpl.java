public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Guardando coche");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando todos los coches");
    }

    @Override
    public void delete() {
        System.out.println("Eliminando un coche");
    }
}
