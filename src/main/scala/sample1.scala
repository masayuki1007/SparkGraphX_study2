import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.graphx._

// sbt run
// https://spark.apache.org/docs/latest/graphx-programming-guide.html

object sample1 {

  def main(args: Array[String]): Unit = {
    // https://spark.apache.org/docs/latest/quick-start.html
    val conf = new SparkConf().setAppName("Simple Application")

    //https://spark.apache.org/docs/latest/submitting-applications.html#master-urls
    conf.setMaster("local")
    val sc = new SparkContext(conf)

    val graph = GraphLoader.edgeListFile(sc, "data/sample1.tsv")
    graph.edges.collect.foreach(println(_))
  }
}
