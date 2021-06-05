
solution {
    puzzle = "P026"
    name = "OAC"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to 0
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
