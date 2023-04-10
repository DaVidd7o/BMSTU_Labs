package org.example;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Main {
    public static void main(String[] args) {

        SparkSession spark = SparkSession
                .builder()
                .appName("Java Spark SQL basic example")
                .config("spark.master", "local")
                .getOrCreate();
        Dataset<Row> df = spark.read().option("header","true").csv("C:/Users/sonar/IdeaProjects/lab10/NYPD_Shooting_Incident_Data__Year_To_Date_.csv");

        df.createOrReplaceTempView("NYPD");
        df.groupBy("BORO").count().show();
        df.groupBy("VIC_SEX").count().show();
        spark.sql("Select * FROM NYPD").show();
        spark.sql("Select * FROM NYPD WHERE VIC_RACE != 'BLACK'").show();
        spark.sql("Select * FROM NYPD WHERE `Police Precincts` > 30 AND VIC_SEX = 'M'").show();
        spark.sql("Select * FROM NYPD WHERE STATISTICAL_MURDER_FLAG = 'Y' ORDER BY BORO" ).show();
        spark.sql("Select * FROM NYPD WHERE LOC_OF_OCCUR_DESC = 'INSIDE' OR PERP_AGE_GROUP NOT LIKE '18-24'" ).show();
        spark.sql("Select * FROM NYPD WHERE PERP_SEX = '(null)' " ).show();
        spark.sql("Select * FROM NYPD WHERE `City Council Districts` > 10 AND `Police Precincts` < 50 " ).show();
        spark.sql("Select * FROM NYPD WHERE LOC_CLASSFCTN_DESC = 'VEHICLE' ORDER BY PRECINCT DESC" ).show();
    }
}