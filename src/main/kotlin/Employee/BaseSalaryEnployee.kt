package Employee

import FoodAllowance

open class BaseSalaryEnployee(
    name: String,
    var salary:Double
    ) : Employee(name), FoodAllowance {
    override fun calculateSalary() = salary
    override fun payFoodAllowance() {
        println("Paying foo Allowance to $name...")
    }

    override fun toString(): String {
        return "BaseSalaryEnployee(salary=$salary)"
    }
}