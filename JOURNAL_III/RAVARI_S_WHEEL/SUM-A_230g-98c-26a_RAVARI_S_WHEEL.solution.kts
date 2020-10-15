
solution {
    puzzle = "P064"
    name = "B CA"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 2 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -3 to 2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -2 to 3
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 1 to 0
        rotation = -4
    }
    glyph(PROJECTION) {
        position = 0 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(8) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
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
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
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
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                pivotClockwise()
                wait(3)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
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
            }
        }
        )
    }
}
