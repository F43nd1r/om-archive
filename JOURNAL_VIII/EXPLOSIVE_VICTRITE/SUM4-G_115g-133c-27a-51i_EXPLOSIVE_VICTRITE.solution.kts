
solution {
    puzzle = "P100"
    name = "NEW SOLUTION 7 (Copy) (Copy)"
    arm(ARM1) {
        number = 1
        position = -4 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -5 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to 3
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to 1, 1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                wait(1)
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                grab()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
            }
        }
        )
    }
}
