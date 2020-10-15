
solution {
    puzzle = "P038"
    name = "B X CAX"
    arm(ARM2) {
        number = 1
        position = 2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 3 to -4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 2 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 4 to -3
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 0 to 1
        rotation = 5
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 0 to -1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                pivotClockwise()
                reset()
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
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
