
solution {
    puzzle = "w1611998067"
    name = "B TI10A 1-3T"
    arm(ARM6) {
        number = 1
        position = -3 to 0
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 0 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -8 to 5
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -4
        rotation = -3
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
