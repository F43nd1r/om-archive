
solution {
    puzzle = "P064"
    name = "OVERLAP AA"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 0 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(17)
                grab()
                pivotClockwise()
                wait(15)
                pivotClockwise()
                wait(11)
                pivotClockwise()
                wait(10)
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
