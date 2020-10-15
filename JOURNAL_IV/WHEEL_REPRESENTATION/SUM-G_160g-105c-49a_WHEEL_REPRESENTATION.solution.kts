
solution {
    puzzle = "P070"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -5 to 0
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -2 to -3
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -4 to -3
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -4 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -5 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 1, 1 to 1, 2 to 0, 2 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
