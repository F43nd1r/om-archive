
solution {
    puzzle = "P040"
    name = "INSTRUCTIONS NO TRACK 9"
    arm(ARM6) {
        number = 1
        position = -8 to 2
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -10 to 2
        rotation = -6
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -2 to 1
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 1 to -5
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -6 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -9 to 3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -7 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -9 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(3)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
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
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
