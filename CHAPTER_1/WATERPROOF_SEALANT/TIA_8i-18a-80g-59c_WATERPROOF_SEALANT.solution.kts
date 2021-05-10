
solution {
    puzzle = "P011"
    name = "NEW SOLUTION 8"
    arm(ARM6) {
        number = 1
        position = -7 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to -7
        rotation = 6
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -7 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to -6
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -7 to -7
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
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
