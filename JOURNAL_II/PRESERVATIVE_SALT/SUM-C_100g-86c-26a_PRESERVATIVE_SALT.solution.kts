
solution {
    puzzle = "P060"
    name = "SLIGHT IMPROVEMENT"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = -22
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -1
        rotation = 3
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
        rotation = -7
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -20
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 3
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
                wait(12)
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
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
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
