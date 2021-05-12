
solution {
    puzzle = "P008"
    name = "OG"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
