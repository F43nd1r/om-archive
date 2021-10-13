
solution {
    puzzle = "w2450512021"
    name = "TI"
    arm(ARM3) {
        number = 1
        position = 2 to -1
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 6 to -4
        rotation = -1
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = 5 to 2
        rotation = -4
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 5 to -2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 4 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to -3
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 1 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 3 to 1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 4 to 2
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 7 to -3
        rotation = -4
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
                wait(5)
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
