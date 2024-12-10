import kotlin.math.abs

class CarPark(private val garage: List<List<GarageItem>>) {

    fun exitCarPark(): List<String> {
        var currentFloor = garage.indexOfFirst { it.contains(GarageItem.Car) }
        var currentPlace = garage[currentFloor].indexOf(GarageItem.Car)
        val groundFloor = garage.lastIndex

        val instructions = mutableListOf<String>()
        for (floor in currentFloor..groundFloor) {
            if (floor == groundFloor) {
                // go to right/exit
                val steps = garage[groundFloor].lastIndex - currentPlace
                if (steps > 0) {
                    instructions.add("R${abs(steps)}")
                }
            } else {
                // go to stair
                val newPlace = addFloorInstructions(currentFloor, currentPlace, instructions)
                currentFloor--
                currentPlace = newPlace
            }
        }

        return instructions
    }

    private fun addFloorInstructions(
        currentFloor: Int,
        currentPlace: Int,
        instructions: MutableList<String>
    ): Int {
        val stair = garage[currentFloor].indexOf(GarageItem.Staircase)
        val steps = stair - currentPlace   // negative = left, positive = right
        when {
            steps == 0 -> {} // no instruction
            steps < 0 -> instructions.add("L${abs(steps)}")
            steps > 0 -> instructions.add("R${abs(steps)}")
        }
        instructions.add("D1")
        return stair
    }
}