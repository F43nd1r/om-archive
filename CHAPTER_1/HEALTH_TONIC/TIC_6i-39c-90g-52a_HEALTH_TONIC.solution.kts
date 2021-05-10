
solution {
    puzzle = "P014"
    name = "INSTRUCTIONS NO TRACK 12"
    arm(ARM6) {
        number = 1
        position = 1 to -2
        rotation = -1
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = 0 to -5
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -2 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 1 to -4
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
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
