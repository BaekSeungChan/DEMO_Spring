package com.qortmdcks.demo.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfig {

    @Bean("jasyptStringEncryptor")
    public StringEncryptor stringEncryptor(){
        String key="GKf5fCiaMON7TBgkGBeJv2nD98DWzY8W"; // 여기에 실제 암호화 키를 입력하세요
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(key); // 암호화 키 설정

        config.setAlgorithm("PBEWithMD5AndDES"); // 더 안전한 알고리즘으로 변경
        config.setPoolSize(1); // 필요에 따라 풀 크기 조정
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        return encryptor;
    }
}