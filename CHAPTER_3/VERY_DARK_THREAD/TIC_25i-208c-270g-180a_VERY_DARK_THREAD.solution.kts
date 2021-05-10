
solution {
    puzzle = "P029"
    name = "INSTRUCTIONS NO TRACK 15"
    arm(ARM6) {
        number = 1
        position = -2 to -6
        rotation = 1
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -1 to -2
        rotation = 8
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to -4
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to -3
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to -2
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -5 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -1 to -1
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 1
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = 0 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to -5
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                extend()
                drop()
                retract()
            }
        }
        )
    }
}
