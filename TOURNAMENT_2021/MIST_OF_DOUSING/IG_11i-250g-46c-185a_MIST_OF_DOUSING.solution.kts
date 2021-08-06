
solution {
    puzzle = "w2450512021"
    name = "B TI11GC 1-2T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to 0
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 3 to -6
        rotation = -7
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -2 to -3
        rotation = -7
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 4 to 0
        rotation = -8
        size = 3
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 6 to 2
        rotation = -7
    }
    glyph(DUPLICATION) {
        position = -1 to 2
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = 4 to 3
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -3 to 0
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = 8 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 1 to -4
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(1)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
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
            sequence(1) {
        
            }
        }
        )
    }
}
