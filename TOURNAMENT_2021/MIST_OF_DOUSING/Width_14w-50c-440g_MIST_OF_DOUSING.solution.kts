
solution {
    puzzle = "w2450512021"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = 1 to 8
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to 9
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 5 to 9
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -5 to 5
        rotation = 1
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 5
        position = -4 to 6
        rotation = 0
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 2 to 9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 11
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 12
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 14
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 13
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -9 to 10
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to 11
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 4 to 8
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 3 to 10
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 13
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -4 to 12
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -4 to 10
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -4 to 9
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -5 to 7
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -8 to 8
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -9 to 5
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -6 to 1
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = 6 to 7
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 2 to 7
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
        
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
