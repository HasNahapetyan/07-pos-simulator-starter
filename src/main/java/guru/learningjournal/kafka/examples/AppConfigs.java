package guru.learningjournal.kafka.examples;

public class AppConfigs {
    public final static String applicationID = "PosSimulator";
    public final static String bootstrapServers = "localhost:9092,localhost:9093";
    final static String topicName = "pos-topic";
    final static int noOfProducers = 4;
    final static int produceSpeed = 100;

}
