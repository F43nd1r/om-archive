
solution {
    puzzle = "P019"
    name = "INSTRUCTIONS NO TRACK 9"
    arm(ARM6) {
        number = 1
        position = 2 to 3
        rotation = 2
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -1 to 4
        rotation = -4
        size = 2
    }
    arm(ARM2) {
        number = 3
        position = -2 to 4
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = 3 to 2
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to 2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(4)
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
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        )
    }
}
