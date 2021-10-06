
solution {
    puzzle = "w2450512809"
    name = "NEW SOLUTION 1 (Copy)"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -5 to 2
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -9 to 2
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -4 to 0
        rotation = -4
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -2 to -2
        rotation = -7
        size = 3
    }
    glyph(BONDER) {
        position = -7 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to -5
        rotation = -4
    }
    glyph(BONDER) {
        position = -7 to -3
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = -6 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -8 to 3
        rotation = -10
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -7
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
