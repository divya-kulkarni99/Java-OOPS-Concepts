package RSA;

import javax.crypto.Cipher;
import java.security.*;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.concurrent.ExecutionException;



public class AliceEn{
    private PrivateKey privateKey;
    public PublicKey publicKey;
    private static final String PUBLIC_KEY_STRING="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDCvRuYbkNkq2joT0QdJkRcMd9Sh908+cBxux93eeV46f+vHKvvYrdn4AYxV6kBElSqSKpsSqwzFEzJw3Sekx7ik31KRLNPNV+G5Yy3+4c5q5T4LQKo/6/PL34r6a9/IO62Hh54270+Mi0yS/ggsV3NH9yDv2MXxWcBCbiKOIwnHwIDAQAB";
    private static final String PRIVATE_KEY_STRING="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAMK9G5huQ2SraOhPRB0mRFwx31KH3Tz5wHG7H3d55Xjp/68cq+9it2fgBjFXqQESVKpIqmxKrDMUTMnDdJ6THuKTfUpEs081X4bljLf7hzmrlPgtAqj/r88vfivpr38g7rYeHnjbvT4yLTJL+CCxXc0f3IO/YxfFZwEJuIo4jCcfAgMBAAECgYAQCvI2CYdlyLU4xibvW9Kv4a/rJaQ1PMH83JSIDDO6VVSqAWusqe5AEXWRJQ6YNwFgkeHwT+qFvrtgt8hos+gMT5wEfWOkzUUHqsSeu9SWHmyWd3HRDH2LHjrxuAD1+HOxbTBvSvREOoOwhem9j7g8IoYNwFVZbwhz20iO3wghkQJBAORgPU4CsNdac3R0AW/nhaF+CPxxJLOwPnT2L0MrQgA+eUOgGrLCCJHD4n1UaDsFWIKKuAJ1lLO3OwJF378SxikCQQDaS0bW6iw9mFqHOe2TAW4x4rv6jEcRaUZLw5drWzmZbQ4DCoHYlZaCHcamp7p6t6yTu4VaoRaQDl/D0BGHglwHAkEAwdUNM1EFV0LmC0kKjzgqK08VwW0mgXxtBkiNBK2KbzqXIdaZ0m7tZwqjCUzCypVW8jVayHuTopU5+EvmA/6jQQJAGTzkxsoyLTjlFodLAVkD/X6CTzhSqx+pwe6uHfphEWz7VryrQHgi+44nvnLb63461KW0iELhkewnhEMVE76tlwJAEChr+yJj5kSQdQn3Syz80Tk8PdxSh1ZX46lD+buspHfyPKKkLYfq1WuJJkyBKVv2VPkjVvRlNVJss6d6w9FxKQ==";

    public void init(){

        try{
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(1024);
            KeyPair pair = generator.generateKeyPair();
            privateKey = pair.getPrivate();
            publicKey=pair.getPublic();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    public void initFromStrings(){
        try{
            X509EncodedKeySpec keySpecPublic = new X509EncodedKeySpec(decode(PUBLIC_KEY_STRING));
            PKCS8EncodedKeySpec keySpecPrivate = new PKCS8EncodedKeySpec(decode(PRIVATE_KEY_STRING));

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");

            publicKey = keyFactory.generatePublic(keySpecPublic);
            privateKey = keyFactory.generatePrivate(keySpecPrivate);
        }catch (Exception ignored){}
    }
    public void printKeys(){
        System.out.println("Public Key :\n"+encode(publicKey.getEncoded()));
        System.out.println("Priavte Key :\n"+encode(privateKey.getEncoded()));
    }

    public String encrypt(String message) throws Exception{
        byte[] messageToBytes = message.getBytes();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(cipher.ENCRYPT_MODE,publicKey);
        byte[] encryptedBytes = cipher.doFinal(messageToBytes);
        return encode(encryptedBytes);

    }
    private String encode(byte[] data){
        return Base64.getEncoder().encodeToString(data);
    }

    private String depcrypt(String encryptedMessage) throws Exception{

        byte[] encryptedBytes= decode(encryptedMessage);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE,privateKey);
        byte[] decryptedMessage = cipher.doFinal(encryptedBytes);
        return new String(decryptedMessage,"UTF8");
    }

    private byte[] decode(String data){
        return Base64.getDecoder().decode(data);
    }
    public static void main(String args[]){
        AliceEn rsa = new AliceEn();
        rsa.initFromStrings();

        try{
            String encryptedMessage = rsa.encrypt("Hello Bob");
            String decryptedMessage = rsa.depcrypt(encryptedMessage);

            System.out.println("Encrypted "+encryptedMessage);
            System.out.println("Decrypted "+decryptedMessage);



        } catch (Exception e) {
            e.printStackTrace();
        }
        rsa.printKeys();
    }


}