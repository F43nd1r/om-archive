
solution {
    puzzle = "P038"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to 1
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 2
        rotation = -7
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 0 to -1
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
                forward()
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                forward()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                forward()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
