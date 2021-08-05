
solution {
    puzzle = "w2450512021"
    name = "NEW SOLUTION 1 (Copy)"
    arm(ARM6) {
        number = 1
        position = -2 to -2
        rotation = -7
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -4 to -1
        rotation = -7
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 4 to 0
        rotation = -8
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = -1 to -1
        rotation = -6
    }
    glyph(CALCIFICATION) {
        position = -2 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 0 to 3
        rotation = -8
    }
    glyph(DUPLICATION) {
        position = -1 to 4
        rotation = -10
    }
    glyph(DUPLICATION) {
        position = 1 to 5
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 5 to 4
        rotation = -7
    }
    glyph(DUPLICATION) {
        position = 9 to 1
        rotation = -3
    }
    glyph(DUPLICATION) {
        position = 8 to -2
        rotation = -8
    }
    glyph(DUPLICATION) {
        position = 3 to 4
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = 0 to 4
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -4
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -1 to -3
        rotation = -5
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
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
