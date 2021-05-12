
solution {
    puzzle = "P017"
    name = "OGA"
    arm(ARM1) {
        number = 1
        position = 2 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
