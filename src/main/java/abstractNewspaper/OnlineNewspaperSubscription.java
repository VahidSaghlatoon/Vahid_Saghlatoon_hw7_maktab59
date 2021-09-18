package abstractNewspaper;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setSubscriberAddress(String subscriberAddress) {
        int check = 0;
        for (int i = 0; i < subscriberAddress.length(); i++) {
            int ascii = (int) subscriberAddress.charAt(i);
            if ( ascii == 64 ) {
                check = 1;
                break;
            }
        }
        if (check == 0) {
            setSubscriberRate("0");
            System.out.println("Address invalid ");
        } else if (check == 1) {
            setSubscriberRate("$9");
        }
    }
}
