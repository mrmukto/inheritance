import Employee.BaseSalaryEnployee
import Employee.ComissionSalaryEmploye
import Employee.Employee
import Employee.HourlySalaryEmploye

fun main() {
    val base = BaseSalaryEnployee(name = "Hasan", salary = 20000.0)
    val hse = HourlySalaryEmploye(name = "Ibrahim", totalHour = 170.0)
    val cse = ComissionSalaryEmploye(name = "Tarek", salary = 15000.0, totalSale = 10000.0)

    val employees:List<Employee> = listOf(base, hse, cse)
    for (employee in employees){
        if(employee is FoodAllowance){
            employee.payFoodAllowance()
        }

    }

    println("${base.name},${base.salary}")

    val manager = SalaryManager(base)
    println(manager.pay())
}

class SalaryManager(val employee: Employee){
    fun pay() = employee.calculateSalary()
}

interface FoodAllowance{
    fun payFoodAllowance()

}

interface MedicalAllowance{
    fun payMedicalAllowance()

}