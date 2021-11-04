
solution {
    puzzle = "P070"
    name = "302"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -1
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 4 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 0
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 1 to -2
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 1 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 2
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    track {
        position = 0 to 3
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                wait(3)
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(4)
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
            sequence(3) {
                wait(3)
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                back()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
