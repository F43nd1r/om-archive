
solution {
    puzzle = "P021"
    name = "INSTRUCTIONS NO TRACK 8"
    arm(ARM6) {
        number = 1
        position = 2 to 2
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -1 to 4
        rotation = -4
        size = 3
    }
    glyph(BONDER) {
        position = 2 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 7
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 3
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 1 to 3
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
