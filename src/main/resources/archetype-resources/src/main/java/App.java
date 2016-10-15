package $package;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 */
public class App {
    
    public static void main(String[] args) {

        // STEP 1: Create a SparkConf object
        SparkConf conf = new SparkConf();

        // STEP 2: Create a Java Spark Context
        JavaSparkContext context = new JavaSparkContext(conf);
        
        // TODO Spark program instructions

        // STEP 6: Stop the spark context
        context.stop();
    }
}
