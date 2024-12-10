class CarPark(val parkinglot: List<List<GarageItem>>) {

    fun exitCarPark(): List<String> {

        return if (parkinglot[0].size == 1) {
            emptyList()
        } else {
            listOf("R1")
        }
    }
}