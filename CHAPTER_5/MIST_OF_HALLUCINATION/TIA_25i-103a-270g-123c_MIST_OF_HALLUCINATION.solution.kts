
solution {
    puzzle = "P038"
    name = "NO-TRACK I-"
    arm(ARM6) {
        number = 1
        position = -1 to 2
        rotation = -4
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to 1
        rotation = -4
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -4 to 4
        rotation = -4
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = -1 to 4
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -1 to -2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -3 to 0
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 7
        position = -3 to 1
        rotation = -3
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = -4
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = -4 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(17)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(14)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(16)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
