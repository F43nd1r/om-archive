
solution {
    puzzle = "w2450512021"
    name = "TI"
    arm(ARM3) {
        number = 1
        position = 1 to 1
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 5 to -2
        rotation = 4
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = 4 to 4
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 3 to -1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 2 to 3
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -1 to 4
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = 3 to 4
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 6 to -1
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
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
        
            }
        }
        )
    }
}
