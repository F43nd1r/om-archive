
solution {
    puzzle = "P038"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = 3 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 0 to 1
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = 3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = 3 to 0
        rotation = 0
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                reset()
            }
        }
        )
    }
}
