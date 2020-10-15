
solution {
    puzzle = "P010"
    name = "B CAX 2T"
    arm(ARM1) {
        number = 1
        position = -3 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to 1
        rotation = 4
        size = 1
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(9)
                grab()
                rotateClockwise()
                reset()
                wait(7)
                repeat()
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
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                reset()
                wait(7)
                repeat()
            }
        }
        )
    }
}
