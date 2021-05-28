
solution {
    puzzle = "w1698785633"
    name = "NEW SOLUTION 2"
    arm(ARM2) {
        number = 1
        position = -12 to -8
        rotation = 2
        size = 2
    }
    arm(ARM2) {
        number = 2
        position = -8 to -11
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -16 to -9
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -18 to -8
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -19 to -7
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -10 to -11
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -16 to -7
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -14 to -9
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -10 to -8
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -14 to -5
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -9
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
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
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
