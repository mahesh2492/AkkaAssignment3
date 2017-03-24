import akka.actor.ActorSystem
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.duration._

object Start extends App{

    val system = ActorSystem("RouterSystem")
    val accountRequest = system.actorOf(AccountGenerateActor.prop)
    val salaryDepositRequest = system.actorOf(SalaryDepositActor.prop)


    //implicit val timeout=Timeout(1000 seconds)

    accountRequest ! Customer("mahesh","delhi","mahesh24",1000)
    Thread.sleep(100)
  salaryDepositRequest ! (1,"mahesh24",2000.0)

  }

