package abstractNewspaper;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physical = new PhysicalNewspaperSubscription();
        //Physical test
        physical.setSubscriberAddress("Mashhad15");
        System.out.println( physical.getSubscriberRate());
        System.out.println();
        physical.setSubscriberAddress("Mashhad");
        System.out.println( physical.getSubscriberRate());
        System.out.println();
        //Online test
        OnlineNewspaperSubscription online = new OnlineNewspaperSubscription();
        online.setSubscriberAddress("Mashhad@");
        System.out.println(online.getSubscriberRate());
        System.out.println();
        online.setSubscriberAddress("Mashhad");
        System.out.println(online.getSubscriberRate());
    }
}
