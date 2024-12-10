# dojo_car_park_escape kata


## Emojis to use
✅ done
🚧 WIP
❌ ERROR
⚠ TODO

0 = empty spot
1 = staircase
2 = car parked


## Steps
✅ Exit the car park from 1 floor where there is 1 spot
[[2]] -> []

✅ Exit the car park from 1 floor where there is 2 spots, car parked on left most spot
[[2, 0]] -> ["R1"]

✅  Exit the car park from 2 floors where there is 3 spots on the top floor, 
car parked on right most spot, stairs on center spot
[[0, 1, 2], [0,0,0]] -> ["L1", "D1", "R1"]