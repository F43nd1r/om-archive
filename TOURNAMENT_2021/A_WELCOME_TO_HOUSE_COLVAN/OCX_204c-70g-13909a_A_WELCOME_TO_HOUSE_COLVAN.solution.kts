
solution {
    puzzle = "w2450560971"
    name = "NEW SOLUTION 1 (Copy)"
    arm(ARM6) {
        number = 1
        position = -4 to -3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -2 to -5
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -7 to 1
        rotation = 13
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                rotateClockwise()
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
