
solution {
    puzzle = "P060"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
