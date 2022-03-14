package Employee

import FoodAllowance
import MedicalAllowance

class ComissionSalaryEmploye(
    name: String,
    val salary:Double,
    val totalSale:Double,
    val comissionRate:Double = 2.5
): Employee(name),FoodAllowance,MedicalAllowance {
    override fun calculateSalary() = salary + ((totalSale * comissionRate)/100)
    override fun payFoodAllowance() {
        println("Pay Food allowance to $name")
    }

    override fun payMedicalAllowance() {
        println("Pay Medical allowance to $name")
    }
}