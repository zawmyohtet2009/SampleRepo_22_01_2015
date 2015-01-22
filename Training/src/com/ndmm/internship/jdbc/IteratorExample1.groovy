class IteratorExample1{
  static void main(String[] args) {
    def coll = ["JMS", "EJB", "JMX"]
    coll.each{ item -> 
      println item 
    }
  }
}
