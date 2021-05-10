
solution {
    puzzle = "P017"
    name = "INSTRUCTIONS NO TRACK 11"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = -9
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = -2 to 1
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -2
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -3
        rotation = -5
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -2 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                extendTape()
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
