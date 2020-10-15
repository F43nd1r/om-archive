
solution {
    puzzle = "P025"
    name = "B X S 2T"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = 6
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 2 to 1
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
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                reset()
                wait(1)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
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
                wait(1)
                pivotClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
