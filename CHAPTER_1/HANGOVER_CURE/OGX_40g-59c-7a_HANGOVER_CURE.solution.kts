
solution {
    puzzle = "P013"
    name = "OVERLAP GAX"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 6
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
