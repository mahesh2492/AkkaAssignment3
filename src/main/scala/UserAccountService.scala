import scala.collection.mutable.ListBuffer


class UserAccountService {



//  def createAccount(user:Customer) =
//  {
//    val usr = CustomerData(account_no,user.account_holder_name,user.address,user.uname,user.initial_amount)
//    account_no += 1
//    val flag = listOfUser.map(x => if(x.uname == user.uname) true else false)
//
//    if(flag.forall(_ == false)) {
//      listOfUser += usr
//      println("user is successfully added")
//      println("User Details:")
//      print(usr.account_number + "\n" + user.account_holder_name + "\n" + user.uname + "\n" + user.address + "\n" + user.initial_amount)
//    }
//    else
//      println("\nusername already exist")
//
//  }


}
object UserAccountService{
  val listOfUser = new ListBuffer[CustomerData]()
  var account_no = 1
}

//object UserAccountService extends App{
//
//  val usr = Customer("mahesh","Delhi","mahesh24",100)
//  val obj = new UserAccountService
//  obj.createAccount(usr)
//  val usr1 = Customer("mahesh","Delhi","mahesh4",100)
//  obj.createAccount(usr1)
//
//
//}
