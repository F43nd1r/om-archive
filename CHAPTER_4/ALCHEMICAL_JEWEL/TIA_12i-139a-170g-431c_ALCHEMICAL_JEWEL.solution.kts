
solution {
    puzzle = "P035"
    name = "INSTRUCTIONS NO TRACK 8"
    arm(ARM6) {
        number = 1
        position = 2 to -3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM2) {
        number = 3
        position = -4 to -1
        rotation = 4
        size = 3
    }
    arm(ARM2) {
        number = 4
        position = -5 to -1
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -5
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to -4
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
            sequence(4) {
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
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
