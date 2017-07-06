package config;

public class ConfigureAPI {
    public interface KafkaProperties {
        public final static String ZK = "127.0.0.1:2181";
        public final static String GROUP_ID = "test_group1";
        public final static String TOPIC = "test";
        public final static String BROKER_LIST = "127.0.0.1:9092";
        public final static int BUFFER_SIZE = 64 * 1024;
        public final static int TIMEOUT = 20000;
        public final static int INTERVAL = 10000;
    }
}
