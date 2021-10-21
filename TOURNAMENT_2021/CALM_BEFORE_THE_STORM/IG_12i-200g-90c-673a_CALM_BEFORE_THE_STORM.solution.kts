
solution {
    puzzle = "w2450512434"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = -14 to -3
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -13 to -3
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -13 to -4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -16 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = -11 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -12 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -13 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -11 to 11
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -12 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -16 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -12 to -6
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -12 to -5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to -5
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -9 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -17 to -1
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -8 to -4
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = -8 to -3
        rotation = 0
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
            sequence(3) {
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
