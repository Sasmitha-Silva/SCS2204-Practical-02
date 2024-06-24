// Calculate the Normal Salary
def normalSalary(normalHours: Int): Int = normalHours * 250

// Calculate the Overtime Salary
def OT(overTimeHours: Int): Int = overTimeHours * 85

def totalSalary(norHr: Int, ovHr: Int): Int = normalSalary(norHr) + OT(ovHr)

// Calculate the Tax Amount
def tax(totSal: Int): Double = totSal * .12

// Calculate the Take Home Salary
def takeHomeSalary(norHr: Int, ovHr: Int): Double = {
  totalSalary(norHr, ovHr) - tax(totalSalary(norHr, ovHr))
}

@main
def main(): Unit = println("Take Home Salary : Rs. " + takeHomeSalary(40, 30))
