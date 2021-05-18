
solution {
    puzzle = "P064"
    name = "TI"
    arm(ARM1) {
        number = 1
        position = -7 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -12 to 6
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -6 to 1
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -1 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -12 to 1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -11 to 5
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -13 to 6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to 4
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -10 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
