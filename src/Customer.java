public class Customer extends User {

    public Customer(String name, int id) {
        super(name, id);
    }

    public void useService(Service s) {
        System.out.println(name + " uses " + s.getServiceName());
        s.performService();
    }
}
