package pl.zzpj2020.solid.isp.contactbook.solution;

import pl.zzpj2020.solid.isp.contactbook.solution.phone.Dialable;
import pl.zzpj2020.solid.isp.contactbook.solution.email.Emailable;

public class Contact implements Dialable, Emailable {
    public String name;
    public String address;
    public String emailAddress;
    public String telephone;

    public Contact(String name, String address, String emailAddress, String telephone) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.telephone = telephone;
    }

    @Override
    public String getEmailAddress() {
        return this.emailAddress;
    }

    @Override
    public String getPhoneNumber() {
        return this.telephone;
    }
}
