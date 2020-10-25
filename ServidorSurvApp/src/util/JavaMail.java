package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.codec.binary.Hex;



/**
 *
 * @author chorat
 */
public class JavaMail {
    
    private Properties propiedad;
    private Session sesion;
    private String correo;
    private String contrasena;
    private String pass;
    private MessageDigest encript;
    
    public JavaMail(){
        propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth","true");
        
        sesion = Session.getDefaultInstance(propiedad);
        correo = "survapp.noreply@gmail.com";
        contrasena = "#Survapp2020";
        pass = generarPass();
    }
    
    public void enviarPass(String receptor){
        String asunto = "Contraseña recuperada de SurvApp";
        String mensaje="Has solicitado una nueva contraseña para SurvApp. "
                + "La nueva contraseña generada es: " + pass +
                " .Por favor, cambia la contraseña generada por seguridad.";
        
        MimeMessage mail = new MimeMessage(sesion);
        try {
            mail.setFrom(new InternetAddress (correo));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (receptor));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transportar = sesion.getTransport("smtp");
            transportar.connect(correo,contrasena);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
            transportar.close();
            
        } catch (AddressException ex) {
            ex.printStackTrace();
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }
    
    private String generarPass(){
        char[] allowedCharacters = {'a','b','c','1','2','3','4'};

        SecureRandom random = new SecureRandom();
        StringBuffer password = new StringBuffer();

        for(int i = 0; i < 8; i++) {
               password.append(allowedCharacters[ random.nextInt(allowedCharacters.length) ]);
        }
        return password.toString();
    }
    
    public void encriptarMensaje() {
        try {
            this.encript = MessageDigest.getInstance("SHA-512");
            this.encript.update(pass.getBytes());
            byte[] mb = encript.digest();
            pass = String.copyValueOf(Hex.encodeHex(mb));
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Problema al encriptar el mensaje");
        }
    }
    
    public String getPass() {
        encriptarMensaje();
        return pass;
    }
}
