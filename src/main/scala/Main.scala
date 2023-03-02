import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    val spark = SparkSession.builder().appName("Sample code").getOrCreate()

    import spark.implicits._

    val data = Seq(("Java", "20000"), ("Python", "100000"), ("Scala", "3000"))
    val df = data.toDF("language", "users_count")
    df.show(false)
  }
}