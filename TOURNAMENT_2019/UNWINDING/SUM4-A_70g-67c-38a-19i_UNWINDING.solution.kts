
solution {
    puzzle = "w1611998067"
    name = "B S F BIGGIEMAC42"
    arm(ARM1) {
        number = 1
        position = 1 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 7
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = 1
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
