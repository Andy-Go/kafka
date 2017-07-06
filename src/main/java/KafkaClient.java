import config.ConfigureAPI;
import consume.KafkaConsume;
import produce.KafkaProduce;

public class KafkaClient {
    public static void main(String[] args) {
        KafkaProduce pro = new KafkaProduce(ConfigureAPI.KafkaProperties.TOPIC);
        pro.start();

        KafkaConsume con = new KafkaConsume(ConfigureAPI.KafkaProperties.TOPIC);
        con.start();
    }
}
