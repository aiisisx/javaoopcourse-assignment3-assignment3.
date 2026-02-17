public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    private boolean isPremium = false;
    private int storageUsed = 50;

    public CloudStorageService(String name, int id) {
        super(name, id);
    }

    public void performService() {
        if (!isActive) {
            System.out.println(serviceName + " inactive");
            return;
        }

        System.out.println("Storing files in cloud...");
    }

    public void upgradeToPremium() {
        isPremium = true;
        System.out.println(serviceName + " storage expanded!");
    }

    public void generateBill() {
        System.out.println("Cloud bill: $" + storageUsed * 2);
    }
}
