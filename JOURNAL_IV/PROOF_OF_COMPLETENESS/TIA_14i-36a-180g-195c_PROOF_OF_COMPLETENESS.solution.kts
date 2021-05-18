
solution {
    puzzle = "P069"
    name = "TI"
    arm(ARM2) {
        number = 1
        position = -4 to 1
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to 0
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -2 to 2
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = -1 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -6 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -3 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 4
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = -1 to 3
        rotation = 4
    }
    io(OUTPUT) {
        index = 2
        position = 0 to 1
        rotation = -3
    }
    io(OUTPUT) {
        index = 3
        position = -5 to 0
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
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
