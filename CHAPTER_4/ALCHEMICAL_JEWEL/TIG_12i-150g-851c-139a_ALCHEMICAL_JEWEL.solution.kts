
solution {
    puzzle = "P035"
    name = "NEW SOLUTION 15"
    arm(ARM6) {
        number = 1
        position = -9 to -5
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -15 to -3
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -16 to -3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -15 to -2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -13 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -13 to 0
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -12 to -6
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -14 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -9 to -8
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -9 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -15 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -16 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                extendTape()
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
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
