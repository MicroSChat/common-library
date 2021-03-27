package com.microschat.commonlibrary.connectivity;

public final class ConnectivityConstant {

    private ConnectivityConstant(){}

    public final static String APPLICATION_EXCHANGE = "msc-exchange";

    public final static String USER_REGISTRATION_ROUTING_KEY = "user.register";
    public final static String USER_AUTHENTICATION_ROUTING_KEY = "user.authenticate";
    public final static String USER_INQUIRY_ROUTING_KEY = "user.inquiry";

    public final static String MESSAGE_DELIVER_ROUTING_KEY = "message.deliver";

    public final static String AUTHENTICATION_TOKEN_VALIDATION_ROUTING_KEY = "token.authenticate";
}
