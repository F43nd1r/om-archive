
solution {
    puzzle = "P060"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = 3 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(12)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
