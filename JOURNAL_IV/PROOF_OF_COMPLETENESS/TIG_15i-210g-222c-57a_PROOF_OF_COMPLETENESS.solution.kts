
solution {
    puzzle = "P069"
    name = "NEW SOLUTION 2"
    arm(ARM2) {
        number = 1
        position = -8 to -5
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -5 to -6
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -8 to -3
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -5 to -2
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -4 to -3
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = -5 to -5
        rotation = -1
    }
    glyph(BONDER) {
        position = -8 to -2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -4 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to -2
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -7 to -5
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -7 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -3 to -7
        rotation = 3
    }
    io(OUTPUT) {
        index = 2
        position = -9 to -5
        rotation = 1
    }
    io(OUTPUT) {
        index = 3
        position = -9 to -3
        rotation = 7
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(119)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
