
solution {
    puzzle = "P026"
    name = "INSTRUCTIONS NO TRACK 10"
    arm(ARM6) {
        number = 1
        position = -5 to 0
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to 3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to -2
        rotation = 7
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -3 to 4
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -6 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
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
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
