package pl.zzpj2020.solid.isp.contactbook.solution;

import pl.zzpj2020.solid.isp.contactbook.solution.email.Emailer;
import pl.zzpj2020.solid.isp.contactbook.solution.phone.Dialer;

public class SpamServer {
    Emailer emailer;
    Dialer dialer;

    public SpamServer(Emailer emailer, Dialer dialer) {
        this.emailer = emailer;
        this.dialer = dialer;
    }

    public void sendSpamTo(Contact contact) {
        emailer.send(contact, "KUP PAN", "Kup pan misia!");
        dialer.makeCall(contact);
    }
}
