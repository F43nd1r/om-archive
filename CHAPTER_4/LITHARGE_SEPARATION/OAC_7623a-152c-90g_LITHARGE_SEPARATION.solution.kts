
solution {
    puzzle = "P031b"
    name = "NEW SOLUTION 2"
    arm(ARM6) {
        number = 1
        position = -9 to -5
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -10 to -4
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -11 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -13 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -12 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -9 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -12 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -8
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -6 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(70)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
