package Employee

class HourlySalaryEmploye(
    name: String,
    val totalHour:Double,
    val hourlyRate:Double = 100.0
):Employee(name){
    override fun calculateSalary() = totalHour * hourlyRate
    override fun toString(): String {
        return "HourlySalaryEmploye(totalHour=$totalHour, hourlyRate=$hourlyRate)"
    }
}