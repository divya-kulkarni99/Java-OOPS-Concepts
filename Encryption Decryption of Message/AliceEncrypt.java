import javax.crypto.*;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public class AliceEncrypt{
    SecretKey key;
    private int KEY_SIZE= 256;
    private int T_LEN= 128;
    private byte[] IV;
    //Create encryption keys


    public void initFromStrings(String secretKey, String IV){
        key = new SecretKeySpec(decode(secretKey),"AES");
        this.IV = decode(IV);
    }

    public String encrypt(String message) throws Exception {
        byte[] messageInBytes = message.getBytes();
        Cipher encryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec spec = new GCMParameterSpec(T_LEN,IV);
        encryptionCipher.init(Cipher.ENCRYPT_MODE,key,spec);
        IV = encryptionCipher.getIV();
        byte[] encryptedBytes = encryptionCipher.doFinal(messageInBytes);
        return encode(encryptedBytes);
    }

    //Convert byte to string output
    private String encode(byte[] data){
        return Base64.getEncoder().encodeToString(data);


    }


    //Convert  string to byte output
    private byte[] decode(String data){
        return Base64.getDecoder().decode(data);
    }

    public static void main(String args[]){
        try{
            AliceEncrypt aes = new AliceEncrypt();
            aes.initFromStrings("bBLkx7AdAHEiDElaf/B0nqcaHCB8xPMhM0DRnoBUZ88=","1CMM4vCWBxwCGqrb");
            String message="Hi Bob, how are you?";
            String alice = aes.encrypt(message);
            System.out.println("Encrypted message from Alice -> "+alice);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
