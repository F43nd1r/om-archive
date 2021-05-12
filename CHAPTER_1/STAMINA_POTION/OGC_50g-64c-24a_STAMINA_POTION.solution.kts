
solution {
    puzzle = "P015"
    name = "OGC"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 3
    }
    glyph(PROJECTION) {
        position = 2 to 0
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
