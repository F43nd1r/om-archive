
solution {
    puzzle = "P029"
    name = "INSTRUCTIONS NO TRACK 12"
    arm(ARM6) {
        number = 1
        position = -9 to 5
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -5 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -7 to 2
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -6 to 3
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -5 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -3 to 3
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -1 to -1
        rotation = -4
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -5 to 1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -2 to -5
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -8 to 4
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -5 to -5
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -6 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -9 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
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
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
