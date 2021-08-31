
solution {
    puzzle = "P100"
    name = "SUM4 - 245"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -3
        rotation = 0
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
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
                wait(14)
                grab()
                rotateClockwise()
                back()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
