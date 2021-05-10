
solution {
    puzzle = "P012"
    name = "INSTRUCTIONS NO TRACK 11"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = -4
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 1 to -3
        rotation = 7
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
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
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
