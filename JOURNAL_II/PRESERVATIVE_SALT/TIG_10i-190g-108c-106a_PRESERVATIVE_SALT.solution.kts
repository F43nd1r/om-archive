
solution {
    puzzle = "P060"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = 2 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to 4
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 8 to -1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 6 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 6
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 1 to 6
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 4 to 3
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -4 to 1
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
            sequence(3) {
                wait(3)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(1)
                reset()
            }
        }
        )
    }
}
