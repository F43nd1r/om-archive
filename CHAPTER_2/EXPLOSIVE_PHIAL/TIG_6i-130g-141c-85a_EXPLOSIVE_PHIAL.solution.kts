
solution {
    puzzle = "P017"
    name = "NO-TRACK I-6"
    arm(ARM6) {
        number = 1
        position = 0 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 2 to -2
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -4
        rotation = -3
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -4
        rotation = -3
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to -2
        rotation = -6
    }
    glyph(CALCIFICATION) {
        position = 6 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
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
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
