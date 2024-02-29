package com.prueba.digitalspace.domain.model.constant;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;

public class Constans {
    // Spring Security
    public static final String LOGIN_URL = "/login";
    public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";
    public static final String CUSTOMER_CREATE = "/api/v1/customer/create";
    public static final String CREATE_TYPE_PRODUCT = "/api/v1/product/create";
    public static final String CREATE_WAREHOUSE = "/api/v1/warehouse/create";
    public static final String CREATE_SEAPORTSTRING = "/api/v1/seaport/create";
    public static final String CREATE_TRUCK = "/api/v1/delivery/create-truck";
    public static final String CREATE_MARITIME = "/api/v1/delivery/create-fleet";
    public static final String FIND_BY_GUIDE_NUMBER = "/api/v1/delivery/search?guideNumber";


    // JWT
    public static final String SUPER_SECRET_KEY = "ZnJhc2VzbGFyZ2FzcGFyYWNvbG9jYXJjb21vY2xhdmVlbnVucHJvamVjdG9kZWVtZXBsb3BhcmFqd3Rjb25zcHJpbmdzZWN1cml0eQ==bWlwcnVlYmFkZWVqbXBsb3BhcmFiYXNlNjQ=";
    public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day

    public static Key getSigningKeyB64(String secret) {
        byte[] keyBytes = Decoders.BASE64.decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }
    public static Key getSigningKey(String secret) {
        byte[] keyBytes = secret.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
