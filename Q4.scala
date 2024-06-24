// At Rs 15 per ticket, the attendance is 120 people.
// For every Rs 5 decrease in ticket price, the attendance increases by 20 people.
// For every Rs 5 increase in ticket price, the attendance decreases by 20 people.
// Change in Number of Attendees per 1 Rupee is 20/5 = 4

// Calculate the Number of Attendees
def count(ticketPrice: Double): Int = 120 + ((15 - ticketPrice) * 4).toInt

// Calculate the Total Cost
def totalCost(ticketPrice: Double): Double = 500 + 3 * count(ticketPrice)

// Calculate the Total Revenue
def revenue(ticketPrice: Double): Double = ticketPrice * count(ticketPrice)

// Calculate the Profit
def profit(ticketPrice: Double): Double = {
  revenue(ticketPrice) - totalCost(ticketPrice)
}

@main
def main(): Unit = {
  println(s"Profit for Rs. 5 Ticket : ${profit(5)}")
  println(s"Profit for Rs. 10 Ticket : ${profit(10)}")
  println(s"Profit for Rs. 15 Ticket : ${profit(15)}")
  println(s"Profit for Rs. 20 Ticket : ${profit(20)}")
  println(s"Profit for Rs. 25 Ticket : ${profit(25)}")
  println(s"Profit for Rs. 30 Ticket : ${profit(30)}")
  println(s"Profit for Rs. 35 Ticket : ${profit(35)}")
  println(s"Profit for Rs. 40 Ticket : ${profit(40)}")
}
