
solution {
    puzzle = "P033"
    name = "INSTRUCTIONS NO TRACK 20"
    arm(ARM6) {
        number = 1
        position = 0 to -3
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 3
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -1 to 1
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = -5
    }
    glyph(MULTI_BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -1 to -3
        rotation = -5
    }
    glyph(PURIFICATION) {
        position = -3 to 0
        rotation = -7
    }
    io(INPUT) {
        index = 0
        position = 1 to -4
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -4
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
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(4) {
                wait(22)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(22)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(22)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
