
solution {
    puzzle = "P013"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = -3 to 3
        rotation = 10
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 1
        rotation = 14
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = 14
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 4
        rotation = 11
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 2
        rotation = 10
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 4
        rotation = 12
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
