
solution {
    puzzle = "w2450512809"
    name = "NEW SOLUTION 1 (Copy)"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to -3
        rotation = -5
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -2 to -5
        rotation = -7
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -1 to -5
        rotation = -4
        size = 2
    }
    arm(ARM2) {
        number = 4
        position = 4 to -5
        rotation = -10
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to 2
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -7
        rotation = -6
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -9
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -3 to -4
        rotation = -8
    }
    io(INPUT) {
        index = 0
        position = -2 to -6
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -2
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
            }
        }
        )
    }
}
