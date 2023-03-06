import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class BobDecrypt {
    SecretKey key;
    private int KEY_SIZE = 256;
    private int T_LEN = 128;
    private byte[] IV ;


    public void initFromStrings(String secretKey, String IV){
        key = new SecretKeySpec(decode(secretKey),"AES");
        this.IV = decode(IV);
    }
    public String decrypt(String encryptedMessage) throws Exception{
        byte[] messageInBytes = decode(encryptedMessage);
        Cipher decryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec spec = new GCMParameterSpec(T_LEN,IV);
        decryptionCipher.init(Cipher.DECRYPT_MODE,key,spec);
        byte[] decryptedBytes=decryptionCipher.doFinal(messageInBytes);
        return new String(decryptedBytes);

    }
    //Convert byte to string output
    private String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);


    }
    private byte[] decode(String data){
        return Base64.getDecoder().decode(data);
    }


    public static void main(String args[]) throws Exception {
        try {
            BobDecrypt bob = new  BobDecrypt();
            bob.initFromStrings("bBLkx7AdAHEiDElaf/B0nqcaHCB8xPMhM0DRnoBUZ88=", "1CMM4vCWBxwCGqrb");
            System.out.println("Enter Encrypted message");
            Scanner sc = new Scanner(System.in);
            String message =sc.next();


            String messageRecieved = bob.decrypt(message);
            System.out.println("Message sent is "+messageRecieved );
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }


}