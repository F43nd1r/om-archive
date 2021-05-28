
solution {
    puzzle = "w2450560971"
    name = "NEW SOLUTION 2"
    arm(ARM6) {
        number = 1
        position = -9 to -7
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -8 to -2
        rotation = -2
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = -6 to -8
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -7 to -5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -11 to -4
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -8
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -7 to -7
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
                rotateCounterClockwise()
                pivotClockwise()
                reset()
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
