
solution {
    puzzle = "P019"
    name = "IDK"
    arm(ARM6) {
        number = 1
        position = 0 to 3
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -1 to 2
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
