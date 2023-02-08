val df = spark.read.csv("D:/inzynierka/AdventureWorks_Products.csv");

df.show(25);

val df = spark.read.option("header", true).csv("D:/inzynierka/AdventureWorks_Products.csv");

df.show(15);


val df = spark.read.option("header", true).option("infernaSchema", true).csv("D:/inzynierka/AdventureWorks_Products.csv");
df.printSchema

import org.apache.spark.sql.types.{StructType, StructField, StringType, IntegerType};
val mySchema = StructType(Array(
StructField("ProductKey", IntegerType, true),
StructField("ProductSubcategoryKey", IntegerType, true),
StructField("ProductSKU", StringType, true),
StructField("ProductName", StringType, true),
StructField("ModelName", StringType, true),
StructField("ProductDescription", StringType, true),
StructField("ProductColor", StringType, true),
StructField("ProductStyle", StringType, true),
StructField("ProductSize", StringType, true),
StructField("ProductCost", IntegerType, true),
StructField("ProductPrice", IntegerType, true)));

val df = spark.read.option("header", true).schema(mySchema).csv("D:/inzynierka/AdventureWorks_Products.csv");
df.printSchema

val expensiveProducts = df.filter("ProductPrice > 1500");

expensiveProducts.orderBy("ProductPrice").show(35);