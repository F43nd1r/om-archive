
solution {
    puzzle = "P069"
    name = "TI"
    arm(ARM2) {
        number = 1
        position = 0 to -2
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 3 to -3
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 2 to -1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 0
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 1 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = 4 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 2
        position = 2 to 1
        rotation = -2
    }
    io(OUTPUT) {
        index = 3
        position = -1 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
