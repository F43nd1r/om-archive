
solution {
    puzzle = "P070"
    name = "287"
    arm(ARM1) {
        number = 1
        position = 2 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 3
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 5 to -2
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to 2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 6 to -2
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -1 to 2
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 3 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 6 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                forward()
                grab()
                back()
                drop()
                wait(3)
                forward()
                grab()
                back()
                drop()
            }
        }
        )
    }
}
