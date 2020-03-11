package pl.zzpj2020.solid.isp.contactbook.solution.email;

public class Emailer {

    public void send(Emailable emailable, String topic, String message){
        String emailAddress = emailable.getEmailAddress();

        sendEmailMessage(emailAddress, topic, message);
    }

    private void sendEmailMessage(String emailAddress, String topic, String message) {
        //FIXME doesn't work, IDC why ¯\_(ツ)_/¯
    }
}
