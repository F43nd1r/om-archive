
solution {
    puzzle = "P079"
    name = "B GIX 1-3T"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -2 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = -2
    }
    track {
        position = 0 to 1
        positions = listOf(-1 to 1, 0 to 1)
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 6 to 0
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
                forward()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                drop()
                grab()
                back()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
