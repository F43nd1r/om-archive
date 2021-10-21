
solution {
    puzzle = "w2450512434"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -3 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -2 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -4 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 13
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -5 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 16 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -5 to 2
        rotation = -2
    }
    io(INFINITE) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
