
solution {
    puzzle = "P013"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -1 to 4
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
