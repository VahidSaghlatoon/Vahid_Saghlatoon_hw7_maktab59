package abstractNewspaper;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setSubscriberAddress(String subscriberAddress) {
        int check = 0;
        for (int i = 0; i < subscriberAddress.length(); i++) {
            int ascii = (int) subscriberAddress.charAt(i);
            if (ascii >= 48 && ascii <= 57) {
                check = 1;
                break;
            }
        }
        if (check == 0) {
            setSubscriberRate("0");
            System.out.println("Address invalid ");

        } else if (check == 1) {
            setSubscriberRate("$15");
        }

    }

}
