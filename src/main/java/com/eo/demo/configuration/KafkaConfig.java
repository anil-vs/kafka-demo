package com.eo.demo.configuration;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class KafkaConfig {

    public static final String BOOTSTRAP_SERVER = "localhost:9092";
    public static final String REGISTER_TOPIC = "eo.demo.register";
    public static final String CONSUMER_GROUP = "eo";

}
