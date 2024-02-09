package com.qortmdcks.demo;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

@Slf4j
public class JasyptTest {


    @Test
    public void jasyptTest(){
        String value = "jdbc:mariadb://localhost:3306/testdb";
        String result = jasyptEncoding(value);
        log.info("---{}---", result);
    }

    public String jasyptEncoding(String value){
        String key = "GKf5fCiaMON7TBgkGBeJv2nD98DWzY8W";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }
}
