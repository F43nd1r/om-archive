
solution {
    puzzle = "P064"
    name = "OVERLAP AREA"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 0
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
                wait(7)
                pivotClockwise()
                wait(3)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
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
