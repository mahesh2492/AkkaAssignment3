import akka.actor.{Props, Actor}
import UserAccountService._




class AccountGenerateActor extends Actor {

  def receive = {

    case usr:Customer => if(checkUniqueUserName(usr.uname)) {
      val user = CustomerData(account_no,usr.account_holder_name,usr.address,usr.uname,usr.initial_amount)
      account_no += 1
      listOfUser += user
      println("user is successfully added")
    }
      else
      println("username already exists")
  }

  def checkUniqueUserName(uname :String) = {

    val flag = listOfUser.map(x => if(x.uname == uname) true else false)

    if(flag.forall(_ == false)) true else false
  }

}

object AccountGenerateActor {

  def prop: Props = Props[AccountGenerateActor]
}
