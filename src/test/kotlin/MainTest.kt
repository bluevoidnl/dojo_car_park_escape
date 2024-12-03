import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `Exit the car park from 1 floor where there is 1 spot`() {
        // Given
        val carPark = CarPark(listOf(listOf(2)))

        // When: I want to get out of the car park
        val route = carPark.exitCarPark()

        // Then
        assertEquals(listOf(), route)
    }

    @Test
    fun `Exit the car park from 1 floor where there is 2 spots, car parked on left most spot`(){
        // Given
        val carPark = CarPark(listOf(listOf(2, 0)))

        // When: I want to get out of the car park
        val route = carPark.exitCarPark()

        // Then
        assertEquals(listOf("R1"), route)
    }

}
