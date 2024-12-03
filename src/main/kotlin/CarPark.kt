class CarPark(val parkinglot: List<List<Int>>) {

    fun exitCarPark(): List<String> {

        return if (parkinglot[0].size == 1) {
            emptyList()
        } else {
            listOf("R1")
        }
    }
}