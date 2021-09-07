
solution {
    puzzle = "P064"
    name = "BETTER SUM4"
    arm(ARM1) {
        number = 1
        position = 1 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to -1
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -3
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -2
        rotation = 10
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 1 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
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
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
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
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                wait(6)
                pivotClockwise()
                wait(4)
                pivotClockwise()
                wait(3)
                pivotClockwise()
                wait(2)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
