
solution {
    puzzle = "P025"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -1 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to 3
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 2
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
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
