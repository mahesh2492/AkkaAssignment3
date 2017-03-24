import akka.actor.{Props, Actor}
import UserAccountService._


class SalaryDepositActor extends Actor {

  def receive = {
  case (account_no: Int,uname: String, salary: Double) => {  if( updateSalary(account_no,salary,listOfUser.toList))
                                                              println("successfully deposited")
                                                               else println("transaction failed")
                                                                }


  }
  def updateSalary(account_no:Int,salary:Double,list:List[CustomerData]):Boolean = {
    var flag = false
    list match {
      case head::tail if(head.account_number == account_no) => {
         var update = head.copy(initial_amount = head.initial_amount + salary)
        listOfUser.append(update)
        flag = true
      }
      case _::tail => updateSalary(account_no,salary,tail)
    }
    flag
  }


}

object SalaryDepositActor {

  def prop: Props = Props[SalaryDepositActor]
}

