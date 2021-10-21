
solution {
    puzzle = "w1611998067"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = 3 to -5
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 4 to -3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = 6 to -7
        rotation = 1
    }
    glyph(BONDER) {
        position = 6 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to -7
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 10 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
