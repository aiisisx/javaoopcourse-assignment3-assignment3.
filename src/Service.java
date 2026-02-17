public abstract class Service {
    protected String serviceName;
    protected int serviceId;
    protected boolean isActive;

    public Service(String name, int id){
        this.serviceName = name;
        this.serviceId = id;
        this.isActive = false;
    }
    public void activateService() {
        isActive = true;
        System.out.println(serviceName + "activated");
    }
    public void deactivateService(){
        isActive = false;
        System.out.println(serviceName + "deactivated");
    }
    public String getServiceName() {
        return serviceName;
    }
    public abstract void performService();
