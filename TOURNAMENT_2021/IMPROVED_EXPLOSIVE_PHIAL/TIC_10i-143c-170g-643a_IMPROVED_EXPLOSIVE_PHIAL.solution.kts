
solution {
    puzzle = "w2450508212"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -3 to 0
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 2
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -6 to 2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 2
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to 1
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -5 to 2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -1
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
