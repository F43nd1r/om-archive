
solution {
    puzzle = "P011"
    name = "INSTRUCTIONS NO TRACK 10"
    arm(ARM6) {
        number = 1
        position = -1 to -2
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = 1 to -1
        rotation = 5
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
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
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
