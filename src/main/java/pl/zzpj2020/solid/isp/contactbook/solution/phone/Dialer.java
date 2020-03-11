package pl.zzpj2020.solid.isp.contactbook.solution.phone;

public class Dialer {
    public void makeCall(Dialable dialable) {
        String phoneNumber = dialable.getPhoneNumber();

        callViaVoLTE(phoneNumber);
    }

    private void callViaVoLTE(String phoneNumber) {
        //TODO implement hacking rear phone camera
    }
}
