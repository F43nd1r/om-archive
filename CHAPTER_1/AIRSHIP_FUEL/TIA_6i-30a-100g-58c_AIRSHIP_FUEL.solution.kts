
solution {
    puzzle = "P008"
    name = "INSTRUCTIONS NO TRACK 13"
    arm(ARM6) {
        number = 1
        position = -2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -1 to 0
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 1
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
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
