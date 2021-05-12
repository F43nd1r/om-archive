
solution {
    puzzle = "P017"
    name = "OGC"
    arm(ARM1) {
        number = 1
        position = -2 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
