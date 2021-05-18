
solution {
    puzzle = "P069"
    name = "NEW SOLUTION 4"
    arm(ARM2) {
        number = 1
        position = 0 to -2
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 3 to -3
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 2 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 4 to -5
        rotation = -5
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = 4 to -4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -4
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
        position = 1 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 1
        position = 4 to -2
        rotation = 3
    }
    io(OUTPUT) {
        index = 2
        position = 3 to 0
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
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
