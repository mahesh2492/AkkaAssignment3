import akka.actor.{Props, Actor}
import UserAccountService._


class SalaryDepositActor extends Actor {

  def receive = {
  case (account_no: Int, uname: String, salary: Double) => {
    listOfUser.map(x => if(x.account_number == account_no)
       {
          val updated = x.copy(initial_amount = x.initial_amount + salary)
          listOfUser +=updated
       }

    )
    println("successfully deposited")

    }
        case _ => println("unknown request")
}

  }

object SalaryDepositActor {

  def prop: Props = Props[SalaryDepositActor]
}

