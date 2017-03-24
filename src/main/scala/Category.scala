/**
  * Created by knoldus on 23/3/17.
  */
trait Category

case object Phone extends Category
case object Electricity extends Category
case object Internet extends Category
case object Food extends Category
case object Car extends Category


case class Bill(category: List[Category],
                biller_name: String,
                account_number:Int,
                transaction_date:String,
                amount:Double,
                total_iterations:Int,
                executed_iterations:Int,
                paid_amount:Double)

