
solution {
    puzzle = "P061"
    name = "NEW SOLUTION 2"
    arm(ARM6) {
        number = 1
        position = -12 to -5
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -12 to -6
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -9 to -1
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -12 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = -10 to -6
        rotation = -3
    }
    glyph(BONDER) {
        position = -8 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to -3
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -9 to -5
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -7 to -6
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to -5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to -6
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -5
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -5 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -4 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -5
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -1 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -13 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
