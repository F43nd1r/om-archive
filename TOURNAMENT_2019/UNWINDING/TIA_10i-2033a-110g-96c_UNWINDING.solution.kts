
solution {
    puzzle = "w1611998067"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -1 to -2
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 1 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -2
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
