
solution {
    puzzle = "P103"
    name = "B TI16AC"
    arm(ARM6) {
        number = 1
        position = 0 to 1
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -3 to -2
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -5 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to 6
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 22 to 5
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = 1 to 4
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 5
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 5
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 2 to 5
        rotation = -1
    }
    glyph(DISPOSAL) {
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 2
    }
    io(INFINITE) {
        index = 0
        position = 4 to 4
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 3 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -7 to 1
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
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
            sequence(5) {
                wait(187)
                grab()
                retract()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                pivotCounterClockwise()
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
