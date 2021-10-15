
solution {
    puzzle = "w2450512809"
    name = "NEW SOLUTION 2 (Copy) (Copy) (Copy) (Copy)"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -8 to 1
        rotation = -6
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -5 to 3
        rotation = -2
        size = 2
    }
    arm(ARM2) {
        number = 3
        position = -1 to 1
        rotation = -7
        size = 2
    }
    arm(ARM2) {
        number = 4
        position = 0 to 1
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = 0 to -5
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -7 to 1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = -7 to 3
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -1
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
                wait(1)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extendTape()
            }
        }
        )
    }
}
