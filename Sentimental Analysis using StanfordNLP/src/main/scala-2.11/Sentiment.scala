/**
  * Created by Yagnesh on 4/13/2016.
  */
object Sentiment extends Enumeration {
  type Sentiment = Value
  val POSITIVE, NEGATIVE, NEUTRAL = Value

  def toSentiment(sentiment: Int): Sentiment = sentiment match {
    case x if x == 0 || x == 1 => Sentiment.NEGATIVE            //sentiment of 0 or 1 when text has negative emotion
    case 2 => Sentiment.NEUTRAL                                 //sentiment of 2 when text has neutral emotion
    case x if x == 3 || x == 4 => Sentiment.POSITIVE            //sentiment of 3 or 4 when text has positive emotion
  }
}
