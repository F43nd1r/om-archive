
solution {
    puzzle = "w2450512809"
    name = "NEW SOLUTION 1 (Copy) (Copy) (Copy) (Copy) (Copy) (Copy)"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -6 to 0
        rotation = -7
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -10 to 4
        rotation = -6
        size = 2
    }
    arm(ARM2) {
        number = 3
        position = -5 to 1
        rotation = -12
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = -8 to 4
        rotation = -8
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -7
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -9 to 5
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -7 to 1
        rotation = -10
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -7
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -10 to 2
        rotation = 0
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
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                rotateClockwise()
            }
        }
        )
    }
}
