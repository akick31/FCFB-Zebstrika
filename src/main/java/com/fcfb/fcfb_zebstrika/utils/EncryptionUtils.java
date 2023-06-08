package com.fcfb.fcfb_zebstrika.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Component
public class EncryptionUtils {

    @Value("${encryption.algorithm}")
    private String algorithm;

    @Value("${encryption.key}")
    private String encryptionKey;

    public String encrypt(String value) throws Exception {
        SecretKey secretKey = new SecretKeySpec(encryptionKey.getBytes(), algorithm);
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(value.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public String decrypt(String encryptedValue) throws Exception {
        SecretKey secretKey = new SecretKeySpec(encryptionKey.getBytes(), algorithm);
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedValue));
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
}
