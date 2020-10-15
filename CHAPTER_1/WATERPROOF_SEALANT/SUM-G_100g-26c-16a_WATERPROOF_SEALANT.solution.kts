
solution {
    puzzle = "P011"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = -3 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -4 to 3
        rotation = 3
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -2 to 2
        rotation = 3
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -3 to 1
        rotation = 4
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 6
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
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
