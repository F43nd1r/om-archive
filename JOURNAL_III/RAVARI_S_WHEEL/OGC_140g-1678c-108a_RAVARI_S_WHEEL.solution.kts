
solution {
    puzzle = "P064"
    name = "NO-TRACK (Copy)"
    arm(ARM6) {
        number = 1
        position = 3 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -8 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -8 to 5
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to 0
        rotation = -9
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -3
        rotation = -9
    }
    io(INPUT) {
        index = 0
        position = -9 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -6 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
