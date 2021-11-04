
solution {
    puzzle = "P070"
    name = "BETTER? 309 +54"
    arm(ARM1) {
        number = 1
        position = 0 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -3
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 3 to -4
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -2
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -3 to 0
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 0 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = -4
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = 3 to -3
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(3)
                grab()
                back()
                drop()
                rotateCounterClockwise()
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
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
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
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                wait(2)
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
        )
    }
}
