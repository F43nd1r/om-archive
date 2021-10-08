
solution {
    puzzle = "w2450512434"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -3 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -3 to -1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 15 to -2
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -6 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = -3
    }
    io(INFINITE) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 2 to -2
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
                wait(2)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
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
            sequence(4) {
                wait(79)
                grab()
                retract()
            }
        }
        )
    }
}
