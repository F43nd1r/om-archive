
solution {
    puzzle = "P070"
    name = "NEW SOLUTION 3"
    arm(ARM1) {
        number = 1
        position = -6 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -2 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -1 to -5
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -8 to 0
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = -1
    }
    track {
        position = -3 to -1
        positions = listOf(0 to 0, 1 to -1, 1 to -2, 0 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
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
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
