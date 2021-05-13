
solution {
    puzzle = "P017"
    name = "OGA?"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 3
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
