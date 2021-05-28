
solution {
    puzzle = "w1698785633"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = 1 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -1 to 0
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 3
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 2 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
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
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
