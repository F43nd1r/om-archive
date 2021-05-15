
solution {
    puzzle = "P008"
    name = "OVERLAP AX"
    arm(PISTON) {
        number = 1
        position = 0 to 0
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -2
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 4
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                retract()
                rotateCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                pivotClockwise()
                pivotClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
