
solution {
    puzzle = "P103"
    name = "B TI16G"
    arm(ARM6) {
        number = 1
        position = 5 to -1
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 8 to -7
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 7 to -8
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to 4
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 4
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 2 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 6 to -6
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 4 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to 2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 4
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 19 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 8 to -4
        rotation = 3
    }
    io(INFINITE) {
        index = 0
        position = 5 to 4
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 3 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 5 to -8
        rotation = -2
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
        , 
        {
            sequence(5) {
                wait(207)
                grab()
                pivotClockwise()
            }
        }
        )
    }
}
