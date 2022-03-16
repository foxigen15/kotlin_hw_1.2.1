fun main(){
    val amount = 25_000_00
    val minCommission = 35_00
    val commission = if (amount*0.0075 > minCommission) amount*0.0075 else minCommission
    println("При переводе $amount копеек комиссия составит $commission копеек")
}