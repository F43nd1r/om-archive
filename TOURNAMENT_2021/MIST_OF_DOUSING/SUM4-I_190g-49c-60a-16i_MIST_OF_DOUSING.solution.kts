
solution {
    puzzle = "w2450512021"
    name = "NEW SOLUTION 4"
    arm(ARM1) {
        number = 1
        position = 2 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 7 to -2
        rotation = -2
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = 5 to 2
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 5 to -2
        rotation = 0
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
        position = 3 to 1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 1 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 4 to 2
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 7 to -4
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
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
