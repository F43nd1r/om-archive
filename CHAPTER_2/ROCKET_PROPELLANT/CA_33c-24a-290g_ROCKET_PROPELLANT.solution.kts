
solution {
    puzzle = "P019"
    name = "B CAX 2T"
    arm(ARM1) {
        number = 1
        position = -3 to 5
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -5 to 5
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to 4
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -4 to 5
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -6 to 4
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -1 to 0
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -4 to 4
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 3
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -3 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 3
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
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
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
            sequence(4) {
                wait(2)
                grab()
                extend()
                extend()
                reset()
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                rotateClockwise()
                wait(2)
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
