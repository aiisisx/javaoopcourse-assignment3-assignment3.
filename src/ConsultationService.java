public class ConsultationService extends Service implements Billable {

    private int sessionCount = 3;

    public ConsultationService(String name, int id) {
        super(name, id);
    }

    public void performService() {
        if (!isActive) {
            System.out.println(serviceName + " inactive");
            return;
        }

        System.out.println("Doctor consultation session started");
    }

    public void generateBill() {
        System.out.println("Consultation bill: $" + sessionCount * 15);
    }
}
