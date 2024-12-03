# dojo_car_park_escape kata

Acceptance criteria

Parking lot has at least one floor
Exit is to the right
There is one stair connecting each floor to another
Goal is to find the quickest way to exit the parking lot

Given
We are parked on the far right of the 3rd floor
And the parking lot has 5 spots per floor
And the stairs are always on the far left side

When
I look for the exit

Then
I get the sequence of operations which are move left, move right, move down

Solution: move left 4 spots, down 3x, move right 5x

