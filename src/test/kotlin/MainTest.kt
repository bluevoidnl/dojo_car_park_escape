import GarageItem.*
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `Exit the car park from 1 floor where there is 1 spot`() {
        // Given
        val carPark = CarPark(listOf(listOf(Car)))

        // When: I want to get out of the car park
        val route = carPark.exitCarPark()

        // Then
        assertEquals(listOf(), route)
    }

    @Test
    fun `Exit the car park from 1 floor where there is 2 spots, car parked on left most spot`(){
        // Given
        val carPark = CarPark(listOf(listOf(Car, Empty)))

        // When: I want to get out of the car park
        val route = carPark.exitCarPark()

        // Then
        assertEquals(listOf("R1"), route)
    }

    @Test
    fun `Exit the car park from 2 floors, car parked on right most spot, stairs on center spot`(){
        // Given
        val carPark = CarPark(listOf(listOf(Empty, Staircase, Car), listOf(Empty, Empty, Empty)))

        // When: I want to get out of the car park
        val route = carPark.exitCarPark()

        // Then
        assertEquals(listOf("L1", "D1", "R2"), route)
    }
}
