
solution {
    puzzle = "w1611998067"
    name = "BETTER TI"
    arm(ARM6) {
        number = 1
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -8 to 4
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
