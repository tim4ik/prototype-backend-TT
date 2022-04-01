package com.nvv.viv.security;

public class SecurityConstants {
    public static final String SIGN_UP_URLS = "/api/auth/**";

    public static final String SECRET = "64c167782548627785e43f13aeae01b0d1905d4d365261793dc4550e4b3bf59e4653bf5e7b1d0892d01db58b3139d014a8450ff3348031f4ca76daff535abac0";
    public static final String TOKEN_PREFIX = "Bearer "; // !!! space must be!
    public static final String HEADER_STRING = "Authorization";
    public static final String CONTENT_TYPE = "application/json";
    public static final long EXPIRATION_TIME = 600_000;
}
