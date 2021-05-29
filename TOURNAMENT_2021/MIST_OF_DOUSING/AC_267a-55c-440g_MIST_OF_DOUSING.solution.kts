
solution {
    puzzle = "w2450512021"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -2 to 3
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -1 to 1
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = 1 to -5
        rotation = 2
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = 3 to 4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 5 to 6
        rotation = 3
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 8
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 11
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 11
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 3 to -5
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 1 to -3
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -7 to 6
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -4 to 7
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to 5
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 0 to 4
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 2 to 5
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 1 to 10
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to 11
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 10 to 7
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 3 to -7
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 10 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 10
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
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
        
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
