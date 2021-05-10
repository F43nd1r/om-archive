
solution {
    puzzle = "P031b"
    name = "NEW SOLUTION 5 (Copy)"
    arm(ARM6) {
        number = 1
        position = -12 to -3
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -16 to -1
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -8 to -4
        rotation = 0
        size = 1
    }
    glyph(UNBONDER) {
        position = -11 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -13 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -10 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -8 to -3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -14 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = -7 to -5
        rotation = 0
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
            sequence(3) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
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
        )
    }
}
