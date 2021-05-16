
solution {
    puzzle = "P021"
    name = "B F"
    arm(ARM6) {
        number = 1
        position = -2 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 2
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
