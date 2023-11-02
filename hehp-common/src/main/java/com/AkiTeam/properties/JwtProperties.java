package com.AkiTeam.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.jwt")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtProperties {

    private String SecretKey;
    private long Ttl;
    private String TokenName;

}