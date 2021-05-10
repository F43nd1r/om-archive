
solution {
    puzzle = "P031b"
    name = "NEW SOLUTION 5"
    arm(ARM6) {
        number = 1
        position = -11 to -4
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -5 to -7
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -6 to -5
        rotation = 0
        size = 1
    }
    glyph(UNBONDER) {
        position = -10 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -12 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -8 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -6 to -4
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -14 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -5 to -6
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
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
