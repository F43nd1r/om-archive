
solution {
    puzzle = "w2450560971"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = 3 to -3
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = 0 to 3
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 0
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
