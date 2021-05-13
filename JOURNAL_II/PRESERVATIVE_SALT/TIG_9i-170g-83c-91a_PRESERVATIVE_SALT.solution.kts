
solution {
    puzzle = "P060"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = 0 to 3
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -5 to 8
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 3 to 6
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 5
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 6
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 6
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 3 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 7
        rotation = -3
    }
    glyph(DUPLICATION) {
        position = 4 to 3
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -5 to 7
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
                drop()
            }
        }
        )
    }
}
