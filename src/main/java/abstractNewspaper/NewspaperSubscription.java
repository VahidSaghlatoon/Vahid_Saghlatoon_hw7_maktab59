package abstractNewspaper;

public abstract class NewspaperSubscription {
    private String subscriberName;
    private String subscriberAddress;
    private String subscriberRate;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    public abstract void setSubscriberAddress(String subscriberAddress);

    public String getSubscriberRate() {
        return subscriberRate;
    }

    public void setSubscriberRate(String subscriberRate) {
        this.subscriberRate ="Newspaper rate is : " + subscriberRate;
    }
}
