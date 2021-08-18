
solution {
    puzzle = "P018"
    name = "B TI9G 1-12T"
    arm(ARM1) {
        number = 1
        position = -2 to 3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 2
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 2
        rotation = 2
    }
    io(INPUT) {
        index = 2
        position = -3 to 1
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
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(142)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
