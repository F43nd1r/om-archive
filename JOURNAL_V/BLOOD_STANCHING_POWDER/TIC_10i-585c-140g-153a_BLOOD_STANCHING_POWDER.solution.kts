
solution {
    puzzle = "P087"
    name = "NEW SOLUTION 3"
    arm(ARM6) {
        number = 1
        position = -1 to -4
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = 0 to -3
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 7 to -9
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -5
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 1 to -7
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 2
        position = -2 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
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
                wait(4)
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
