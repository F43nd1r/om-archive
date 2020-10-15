
solution {
    puzzle = "P012"
    name = "B X S NOGIF"
    arm(ARM6) {
        number = 1
        position = -1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 0 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        )
    }
}
