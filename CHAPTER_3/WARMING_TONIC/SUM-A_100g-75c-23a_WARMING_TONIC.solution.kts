
solution {
    puzzle = "P028"
    name = "B X S"
    arm(ARM6) {
        number = 1
        position = -2 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = 3
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 2
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                back()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
