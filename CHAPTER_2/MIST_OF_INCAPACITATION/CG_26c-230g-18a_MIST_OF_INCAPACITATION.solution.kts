
solution {
    puzzle = "P018"
    name = "B CA"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 2
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 4
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 3
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -2 to 1
        rotation = -4
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -4 to 2
        rotation = -6
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 1 to 0
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -6
    }
    glyph(PROJECTION) {
        position = 0 to 3
        rotation = -9
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -6
    }
    io(OUTPUT) {
        index = 1
        position = -2 to 3
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
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
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                extend()
                wait(1)
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                extend()
                retract()
                reset()
                repeat()
            }
        }
        )
    }
}
