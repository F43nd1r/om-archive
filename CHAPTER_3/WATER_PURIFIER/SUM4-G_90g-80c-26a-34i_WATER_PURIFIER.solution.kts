
solution {
    puzzle = "P025"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = 2 to 0
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 7
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
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
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
