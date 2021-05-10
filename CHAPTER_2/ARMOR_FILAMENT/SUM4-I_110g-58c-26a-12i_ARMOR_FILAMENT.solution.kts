
solution {
    puzzle = "P020"
    name = "SUM4"
    arm(ARM6) {
        number = 1
        position = -4 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to -1
        rotation = 0
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
