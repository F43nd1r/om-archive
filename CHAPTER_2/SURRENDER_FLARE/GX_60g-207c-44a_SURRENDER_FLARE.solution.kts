
solution {
    puzzle = "P022"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 4
    }
    glyph(PROJECTION) {
        position = 1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 4 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
