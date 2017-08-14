# FlumeKafkaSpark
This Data Injection used as data Analysis for analyzing the hash Tags fo Twitter calls, 
Architecture: Flume -> Kafka -> Spark Streaming ->result to -> HDFS
Here FLume is used as interface having Twitter as source and Kafka and HDFS as Sink, Kafka then integrates with Spark Streaming for performing the processing and result stored at HDFS.
Flume can also be used to inject data directly to HDFS.
Tools: HADOOP, ZooKeeper, Kafka, Flume, HDFS, Spark Streaming.
