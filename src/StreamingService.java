public class StreamingService extends Service implements PremiumFeature {

    private boolean isPremiuim = false;

    public StreamingService(String name, int id) {
        super(name, id);
    }

    public void performService() {
        if (!isActive){
            System.out.println(serviceName + "is not active");
            return;
        }
        if(isPremium)
            System.out.println("Streaming in 4k quality..");
        else
            System.out.println("Streaming in HD quality");
    }
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println(serviceName + "upgraded to Premium");
    }

}
