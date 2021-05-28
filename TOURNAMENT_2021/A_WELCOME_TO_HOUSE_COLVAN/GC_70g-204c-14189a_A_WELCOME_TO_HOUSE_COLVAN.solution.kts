
solution {
    puzzle = "w2450560971"
    name = "NEW SOLUTION 3"
    arm(ARM6) {
        number = 1
        position = 3 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 5 to -2
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 4 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 6 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to 4
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 6 to -3
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
                wait(107)
                grab()
                drop()
            }
        }
        )
    }
}
